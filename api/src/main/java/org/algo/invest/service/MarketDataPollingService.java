package org.algo.invest.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;

import org.algo.invest.controller.RealtimeMarketDataController;
import org.algo.invest.core.AppConfig;
import org.algo.invest.model.QuoteRecord;
import org.algo.invest.model.YahooFinanceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import lombok.extern.log4j.Log4j2;
import yahoofinance.Stock;
import yahoofinance.Utils;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;
import yahoofinance.util.RedirectableRequest;

@Log4j2
@Service
public class MarketDataPollingService {
	
	@Autowired
	private AppConfig appconfig;
	
	@Autowired
	private RealtimeMarketDataController realtimeMarketDataController;
	
	private final Gson gson = new Gson();
	
	@PostConstruct
    public void onStartup() {
		
		initHistoricalData();
		initStockData();
    }
	
	public void initStockData() {
		
		YahooFinanceResponse _response = gson.fromJson(getYahooStockRecords(), YahooFinanceResponse.class);
		
		for (QuoteRecord vYahooFinanceRecord : _response.getQuoteResponse().getResult()) {
			
			realtimeMarketDataController.getRealtimeStockRecords().put(vYahooFinanceRecord.getSymbol(), vYahooFinanceRecord);
		}
	}
	
	@Scheduled(fixedRate = 10000, initialDelay = 180000)
	public void updateStockData() {
		
		realtimeMarketDataController.getRealtimeStockRecords().values().forEach(x -> x.setRefresh(false));
		
		YahooFinanceResponse _response = gson.fromJson(getYahooStockRecords(), YahooFinanceResponse.class);
		
		for (QuoteRecord vYahooFinanceRecord : _response.getQuoteResponse().getResult()) {
			
			try {
				if (realtimeMarketDataController.getRealtimeStockRecords().get(vYahooFinanceRecord.getSymbol())
						.getRegularMarketPrice() != vYahooFinanceRecord.getRegularMarketPrice()) {
					
					vYahooFinanceRecord.setRefresh(true);
					realtimeMarketDataController.getRealtimeStockRecords().put(vYahooFinanceRecord.getSymbol(), vYahooFinanceRecord);
				}
			}
			catch(Exception e)
			{
				log.error("Exception: " + vYahooFinanceRecord.getSymbol());
			}
			
		}
	}
	
	@Scheduled(cron = "0 0 0 * * *")
	public void updateHistoricalData() {
		
		for(Entry<String, List<HistoricalQuote>> entry : getYahooHistricalData((long) 6.048e+8).entrySet()) {
			
			for(HistoricalQuote quote : entry.getValue()) {
				realtimeMarketDataController.getHistoryQuotes().get(quote.getSymbol()).put(quote.getDate(), quote);
			}
		}
	}
	
	public void initHistoricalData() {
		
		for(Entry<String, List<HistoricalQuote>> entry : getYahooHistricalData((long) 2.592e+10).entrySet()) {

			realtimeMarketDataController.getHistoryQuotes().put(entry.getKey(), new LinkedHashMap<Calendar, HistoricalQuote>());
			
			for (HistoricalQuote quote : entry.getValue()) {
				realtimeMarketDataController.getHistoryQuotes().get(entry.getKey()).put(quote.getDate(), quote);
			}
		}
	}
	
	private String getYahooStockRecords(){
		
		String result = "";
		
		try {
			URI uri = new URI(appconfig.getYAHOO_FINANCE_QUOTE_URL() + "?" + appconfig.getAllQuoteSymbolsUrl());
			RestTemplate restTemplate = new RestTemplate();
			result = restTemplate.getForObject(uri, String.class);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	private Map<String, List<HistoricalQuote>> getYahooHistricalData(long timeMillis){
		
		Calendar cal = Calendar.getInstance(Locale.GERMAN);
		cal.setTime(new Date(System.currentTimeMillis() - timeMillis));
		
		Map<String, List<HistoricalQuote>> result = new HashMap<String, List<HistoricalQuote>>();
		
		try {
//			Map<String, Stock> stocks = YahooFinance.get(appconfig.getAllQuoteSymbols().toArray(
//					new String[appconfig.getAllQuoteSymbols().size()]));
			
			for (String symbol : appconfig.getSymbolNameMapping().keySet()) {
				
				result.put(symbol, getHistory(symbol, Interval.DAILY, cal));
			}
			
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		
		return result;
	}
	
	private List<HistoricalQuote> getHistory(String vSymbol, Interval vInterval, Calendar vFrom) throws IOException {

		log.info("History: " + vSymbol);

        List<HistoricalQuote> result = new ArrayList<HistoricalQuote>();
        
        Calendar DEFAULT_TO = Calendar.getInstance();
        
        if(vFrom.after(DEFAULT_TO)) {
            log.warn("Unable to retrieve historical quotes. "
                    + "From-date should not be after to-date. From: "
                    + vFrom.getTime() + ", to: " + DEFAULT_TO.getTime());
            return result;
        }

        Map<String, String> params = new LinkedHashMap<String, String>();
        params.put("period1", String.valueOf(vFrom.getTimeInMillis() / 1000));
        params.put("period2", String.valueOf(DEFAULT_TO.getTimeInMillis() / 1000));

        params.put("interval", "1" + vInterval.getTag());

        String url = YahooFinance.HISTQUOTES2_BASE_URL + URLEncoder.encode(vSymbol , "UTF-8") + "?" + Utils.getURLParameters(params);
        
        System.out.println(url);

        URL request = new URL(url);
        RedirectableRequest redirectableRequest = new RedirectableRequest(request, 5);
        redirectableRequest.setConnectTimeout(YahooFinance.CONNECTION_TIMEOUT);
        redirectableRequest.setReadTimeout(YahooFinance.CONNECTION_TIMEOUT);
        Map<String, String> requestProperties = new HashMap<String, String>();
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
