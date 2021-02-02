package org.algo.invest.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.time.Duration;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import lombok.Getter;
import org.algo.invest.core.AppConfig;
import org.algo.invest.model.QuoteRecord;
import org.algo.invest.model.YahooFinanceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;
import yahoofinance.Utils;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;
import yahoofinance.util.RedirectableRequest;

@Log4j2
@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MarketDataService {
	
	@Autowired
	private AppConfig appConfig;

	@Getter
	public Map<String, QuoteRecord> realtimeStockRecords = new ConcurrentHashMap<>();

	@Getter
	public Map<String, Map<Calendar, HistoricalQuote>> historyQuotes = new ConcurrentHashMap<>();

	@Getter
	private Flux<QuoteRecord> latestQuotes;

	private Flux<QuoteRecord> flux;

	private Sinks.Many<QuoteRecord> sink;

	@PostConstruct
    public void onStartup() {

		for (String vSymbol : appConfig.symbolNameMapping.keySet()) {
			realtimeStockRecords.put(vSymbol, new QuoteRecord());
		}

		sink = Sinks.many().replay().latest();

		latestQuotes = sink.asFlux();

		Mono<YahooFinanceResponse> mono =
			WebClient.builder().baseUrl("https://query1.finance.yahoo.com/v7/finance")
				.exchangeStrategies(
					ExchangeStrategies.builder()
					.codecs(config -> config.defaultCodecs().maxInMemorySize(1024 * 1024)).build())
				.build()
				.get()
				.uri(uriBuilder ->
					uriBuilder.path("/quote")
						.queryParam("symbols", appConfig.getAllQuoteSymbolsUrl()).build())
				.retrieve()
				.bodyToMono(YahooFinanceResponse.class);

		// Init RealtimeMarketDataController.RealtimeStockRecords
		Objects.requireNonNull(
			mono.block()).getQuoteResponse().getResult()
				.forEach(record -> realtimeStockRecords.put(record.getSymbol(), record));

		// Init Historical Quote Records
		initHistoricalData();

		// Update RealtimeMarketDataController.RealtimeStockRecords every Second
		flux = Flux.interval(Duration.ofSeconds(10)).flatMap(counter ->
			mono.flatMapMany(results ->
				Flux.fromIterable(results.getQuoteResponse().getResult()))
				.doOnNext(quoteRecord -> {
					if (realtimeStockRecords.containsKey(quoteRecord.getSymbol()))
						if (realtimeStockRecords.get(quoteRecord.getSymbol())
								.getRegularMarketPrice() != quoteRecord.getRegularMarketPrice()) {
							realtimeStockRecords.put(quoteRecord.getSymbol(), quoteRecord);
							sink.tryEmitNext(quoteRecord);
						}
					}
				));

		flux.subscribe();
    }
	
	@Scheduled(cron = "0 0 0 * * *")
	public void updateHistoricalData() {
		for(Entry<String, List<HistoricalQuote>> entry : getYahooHistoricalData((long) 6.048e+8).entrySet()) {
			for(HistoricalQuote quote : entry.getValue()) {
				historyQuotes.get(quote.getSymbol()).put(quote.getDate(), quote);
			}
		}
	}
	
	public void initHistoricalData() {
		for(Entry<String, List<HistoricalQuote>> entry : getYahooHistoricalData((long) 2.592e+10).entrySet()) {
			historyQuotes.put(entry.getKey(), new LinkedHashMap<>());
			for (HistoricalQuote quote : entry.getValue()) {
				historyQuotes.get(entry.getKey()).put(quote.getDate(), quote);
			}
		}
	}
	
	private Map<String, List<HistoricalQuote>> getYahooHistoricalData(long timeMillis){
		
		Calendar cal = Calendar.getInstance(Locale.GERMAN);
		cal.setTime(new Date(System.currentTimeMillis() - timeMillis));
		
		Map<String, List<HistoricalQuote>> result = new HashMap<>();
		
		try {
			for (String symbol : appConfig.symbolNameMapping.keySet()) {
				result.put(symbol, getHistory(symbol, cal));
			}
			
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		
		return result;
	}
	
	private List<HistoricalQuote> getHistory(String vSymbol, Calendar vFrom) throws IOException {

		log.info("History: " + vSymbol);

        List<HistoricalQuote> result = new ArrayList<>();
        
        Calendar DEFAULT_TO = Calendar.getInstance();
        
        if(vFrom.after(DEFAULT_TO)) {
            log.warn("Unable to retrieve historical quotes. "
                    + "From-date should not be after to-date. From: "
                    + vFrom.getTime() + ", to: " + DEFAULT_TO.getTime());
            return result;
        }

        Map<String, String> params = new LinkedHashMap<>();
        params.put("period1", String.valueOf(vFrom.getTimeInMillis() / 1000));
        params.put("period2", String.valueOf(DEFAULT_TO.getTimeInMillis() / 1000));

        params.put("interval", "1" + Interval.DAILY.getTag());

        String url = YahooFinance.HISTQUOTES2_BASE_URL + URLEncoder.encode(vSymbol , "UTF-8") + "?" + Utils.getURLParameters(params);
        
        System.out.println(url);

        URL request = new URL(url);
        RedirectableRequest redirectableRequest = new RedirectableRequest(request, 5);
        redirectableRequest.setConnectTimeout(YahooFinance.CONNECTION_TIMEOUT);
        redirectableRequest.setReadTimeout(YahooFinance.CONNECTION_TIMEOUT);
        Map<String, String> requestProperties = new HashMap<>();
        URLConnection connection = redirectableRequest.openConnection(requestProperties);
        
        InputStreamReader is = new InputStreamReader(connection.getInputStream());
        BufferedReader br = new BufferedReader(is);
        br.readLine(); // skip the first line
        // Parse CSV
        for (String line = br.readLine(); line != null; line = br.readLine()) {
        	
            HistoricalQuote quote = this.parseCSVLine(line, vSymbol);
            if (quote.getClose() != null && quote.getDate() != null) {
            	result.add(quote);
            }
        }
        return result;
    }
	
	private HistoricalQuote parseCSVLine(String line, String vSymbol) {
        String[] data = line.split(YahooFinance.QUOTES_CSV_DELIMITER);
        
        return new HistoricalQuote(vSymbol,
                Utils.parseHistDate(data[0]),
                Utils.getBigDecimal(data[1]),
                Utils.getBigDecimal(data[3]),
                Utils.getBigDecimal(data[2]),
                Utils.getBigDecimal(data[4]),
                Utils.getBigDecimal(data[5]),
                Utils.getLong(data[6])
        );
    }
}
