package org.algo.invest.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.*;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.algo.invest.core.AppConfig;
import org.algo.invest.dto.ChartDataDto;
import org.algo.invest.dto.QuoteDto;
import org.algo.invest.model.QuoteRecord;
import org.algo.invest.model.QuoteRecord.Industry;
import org.algo.invest.model.QuoteRecord.QuoteType;
import org.algo.invest.model.YahooFinanceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin({"http://localhost:4200", "http://47.91.78.219:3000"})
public class MarketDataRestController {

	@Autowired
	RealtimeMarketDataController realtimeMarketDataController;
	
	@Autowired
	AppConfig appConfig;

//	private final WebClient yahooFinanceApi = WebClient.create("https://query1.finance.yahoo.com/v7/finance");

//	@GetMapping(value="/stream/quotes/fang", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public Flux<QuoteDto> updateBigTechQuotes() {
//
//		Flux<QuoteDto> flux = yahooFinanceApi
//				.get()
//				.uri(uriBuilder ->
//						uriBuilder.path("/quote")
//								.queryParam("symbols",
//										appConfig.getTechQuotes().getUrlSymbols().get(Industry.FANG))
//								.build())
//				.retrieve()
//				.bodyToMono(YahooFinanceResponse.class)
//				.flatMapMany(results ->
//						Flux.fromIterable(results.getQuoteResponse().getResult())
//								.map(this::getQuoteDto));
//
//		return flux.mergeWith(Flux.interval(Duration.ofSeconds(1)).flatMap(counter -> flux));
//	}

	@RequestMapping(value="/stream/quotes/indices", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> getIndicesQuotes() {
		Flux<QuoteDto> flux = Mono.just(
				Stream.concat(getQuotes(QuoteType.CURRENCY, Industry.NONE).stream(), getQuotes(QuoteType.INDEX, Industry.NONE).stream()).collect(Collectors.toList()))
				.flatMapMany(Flux::fromIterable);
		return flux.mergeWith(Flux.interval(Duration.ofSeconds(2)).flatMap(counter -> flux));
	}

	@RequestMapping(value="/stream/quotes/etf", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> getEtfQuotes() {
		Flux<QuoteDto> flux = Mono.just(getQuotes(QuoteType.ETF, Industry.NONE)).flatMapMany(Flux::fromIterable);
		return flux.mergeWith(Flux.interval(Duration.ofSeconds(2)).flatMap(counter -> flux));
	}

	@RequestMapping(value="/stream/quotes/{industry}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<QuoteDto> getEcommerceQuotes(@PathVariable String industry) {
		Flux<QuoteDto> flux = Mono.just(getQuotes(QuoteType.EQUITY, Industry.valueOf(industry.toUpperCase()))).flatMapMany(Flux::fromIterable);
		return flux.mergeWith(Flux.interval(Duration.ofSeconds(2)).flatMap(counter -> flux));
	}

	@RequestMapping(value="/get24hOutperformer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<QuoteDto> getDailyOutperformer() {
		Flux<QuoteDto> flux = Mono.just(appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == QuoteType.EQUITY)
				.sorted(Comparator.comparing(QuoteRecord::getRegularMarketChangePercent).reversed())
				.map(this::getQuoteDto).collect(Collectors.toList()).subList(0, 9)).flatMapMany(Flux::fromIterable);
		return flux.mergeWith(Flux.interval(Duration.ofSeconds(2)).flatMap(counter -> flux));
	}

	@RequestMapping(value="/get24hUnderperformer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> getDailyUnderPerformer() {
		Flux<QuoteDto> flux = Mono.just(appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == QuoteType.EQUITY)
				.sorted(Comparator.comparing(QuoteRecord::getRegularMarketChangePercent))
				.map(this::getQuoteDto).collect(Collectors.toList()).subList(0, 9)).flatMapMany(Flux::fromIterable);
		return flux.mergeWith(Flux.interval(Duration.ofSeconds(2)).flatMap(counter -> flux));
	}
	
	@RequestMapping(value="/get50dOutperformer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<QuoteDto> get50dOutperformer() {
		Flux<QuoteDto> flux = Mono.just(appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == QuoteType.EQUITY)
				.sorted(Comparator.comparing(QuoteRecord::getFiftyDayAverageChangePercent).reversed())
				.map(this::getQuoteDto).collect(Collectors.toList()).subList(0, 9)).flatMapMany(Flux::fromIterable);
		return flux.mergeWith(Flux.interval(Duration.ofSeconds(2)).flatMap(counter -> flux));
	}

	@RequestMapping(value="/get50dUnderperformer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> get50dPerformer() {
		Flux<QuoteDto> flux = Mono.just(appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == QuoteType.EQUITY)
				.sorted(Comparator.comparing(QuoteRecord::getFiftyDayAverageChangePercent))
				.map(this::getQuoteDto).collect(Collectors.toList()).subList(0, 9)).flatMapMany(Flux::fromIterable);
		return flux.mergeWith(Flux.interval(Duration.ofSeconds(2)).flatMap(counter -> flux));
	}
	
	@RequestMapping(value="/get200dOutperformer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<QuoteDto> get200dOutperformer() {
		Flux<QuoteDto> flux = Mono.just(appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == QuoteType.EQUITY)
				.sorted(Comparator.comparing(QuoteRecord::getTwoHundredDayAverageChangePercent).reversed())
				.map(this::getQuoteDto).collect(Collectors.toList()).subList(0, 9)).flatMapMany(Flux::fromIterable);
		return flux.mergeWith(Flux.interval(Duration.ofSeconds(2)).flatMap(counter -> flux));
	}

	@RequestMapping(value="/get200dUnderperformer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> get200dUnderPerformer() {
		Flux<QuoteDto> flux = Mono.just(appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == QuoteType.EQUITY)
				.sorted(Comparator.comparing(QuoteRecord::getTwoHundredDayAverageChangePercent))
				.map(this::getQuoteDto).collect(Collectors.toList()).subList(0, 9)).flatMapMany(Flux::fromIterable);
		return flux.mergeWith(Flux.interval(Duration.ofSeconds(2)).flatMap(counter -> flux));
	}
	

	private List<QuoteDto> getQuotes(QuoteType quoteType, Industry industry){
		
		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == quoteType && appConfig.getSymbolNameMapping().get(x.getSymbol()).getIndustry() == industry)
				.map(this::getQuoteDto).collect(Collectors.toList());
	}

	private List<QuoteDto> updateQuotes(QuoteType quoteType, Industry industry){

		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == quoteType && appConfig.getSymbolNameMapping().get(x.getSymbol()).getIndustry() == industry && x.isRefresh())
				.map(this::getQuoteDto).collect(Collectors.toList());
	}
	
	@RequestMapping(value="/getAllQuotes", method=RequestMethod.GET)
    public List<QuoteDto> getAllQuotes() {

		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
			.map(this::getQuoteDto).collect(Collectors.toList());
	}
	
	@RequestMapping(value="/updateAllQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateAllQuotes() {

		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
			.filter(QuoteRecord::isRefresh)
			.map(this::getQuoteDto).filter(Objects::nonNull).collect(Collectors.toList());
	}

	@RequestMapping(value="/log", method=RequestMethod.GET)
    public List<String> getLog() {
		List<String> s_log = new ArrayList<>();
		try{
		   FileInputStream fstream = new FileInputStream("logs/bot-app.log");
		   BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		   String strLine;
		   while ((strLine = br.readLine()) != null)   {
		     s_log.add(strLine);
		   }
		   fstream.close();
		} catch (Exception ignored) {
		}
		return s_log;
	}
	
	private QuoteDto getQuoteDto(QuoteRecord quoteRecord) {
		
		ChartDataDto chartData = new ChartDataDto(
				realtimeMarketDataController.getHistoryQuotes().containsKey(quoteRecord.getSymbol())
					&& realtimeMarketDataController.getHistoryQuotes().get(quoteRecord.getSymbol()).size() > 10 ?
				realtimeMarketDataController.getHistoryQuotes().get(quoteRecord.getSymbol()).entrySet().stream().collect(lastN(10)).subList(0, 10)
					.stream().map(x -> x.getValue().getClose().floatValue()).collect(Collectors.toList()) :
						new ArrayList<Float>());

		if (chartData.getData().size() == 10 && chartData.getData().get(9) != quoteRecord.getRegularMarketPrice())
		{
			chartData.getData().remove(0);
			chartData.getData().add(quoteRecord.getRegularMarketPrice());
		}

		
		return QuoteDto.builder().symbol(quoteRecord.getSymbol())
				.name(appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getName())
				.wkn(appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getWkn())
				.url(appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getUrl())
				.exchange(quoteRecord.getFullExchangeName())
				.currency(quoteRecord.getCurrency())
				.price(quoteRecord.getRegularMarketPrice())
				.dayChange(quoteRecord.getRegularMarketChange())
				.dayChangePercent(quoteRecord.getRegularMarketChangePercent())
				.marketCap(quoteRecord.getMarketCap())
				.fiftyDayAverage(quoteRecord.getFiftyDayAverage())
				.fiftyDayAverageChangePercent(quoteRecord.getFiftyDayAverageChangePercent())
				.twoHundredDayAverage(quoteRecord.getTwoHundredDayAverage())
				.twoHundredDayAverageChangePercent(quoteRecord.getTwoHundredDayAverageChangePercent())
				.fiftyTwoWeekHigh(quoteRecord.getFiftyTwoWeekHigh())
				.fiftyTwoWeekHighChangePercent(quoteRecord.getFiftyTwoWeekHighChangePercent())
				.fiftyTwoWeekLow(quoteRecord.getFiftyTwoWeekLow())
				.fiftyTwoWeekLowChangePercent(quoteRecord.getFiftyTwoWeekLowChangePercent())
				.quoteType(quoteRecord.getQuoteType())
				.chartData(Collections.singletonList(chartData))
				.build();
	}

	@RequestMapping(value="/quote/{symbol}", method=RequestMethod.GET)
    public QuoteDto getQuote(@PathVariable String symbol) {

		QuoteRecord quoteRecord = realtimeMarketDataController.getRealtimeStockRecords().get(symbol);
		
		ChartDataDto chartData = new ChartDataDto(
				realtimeMarketDataController.getHistoryQuotes().containsKey(symbol) &&
						realtimeMarketDataController.getHistoryQuotes().get(symbol).size() >= 200 ?
				realtimeMarketDataController.getHistoryQuotes().get(symbol).values().stream().collect(lastN(200)).subList(0, 200)
					.stream().map(x -> x.getClose().floatValue()).collect(Collectors.toList()) :
						new ArrayList<>());

		if (chartData.getData().size() == 200 && chartData.getData().get(199) != quoteRecord.getRegularMarketPrice())
		{
			chartData.getData().remove(0);
			chartData.getData().add(quoteRecord.getRegularMarketPrice());
		}

		return QuoteDto.builder().symbol(quoteRecord.getSymbol())
			.name(appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getName())
			.wkn(appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getWkn())
			.url(appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getUrl())
			.exchange(quoteRecord.getFullExchangeName())
			.currency(quoteRecord.getCurrency())
			.price(quoteRecord.getRegularMarketPrice())
			.dayChange(quoteRecord.getRegularMarketChange())
			.dayChangePercent(quoteRecord.getRegularMarketChangePercent())
			.marketCap(quoteRecord.getMarketCap())
			.fiftyDayAverage(quoteRecord.getFiftyDayAverage())
			.fiftyDayAverageChangePercent(quoteRecord.getFiftyDayAverageChangePercent())
			.twoHundredDayAverage(quoteRecord.getTwoHundredDayAverage())
			.twoHundredDayAverageChangePercent(quoteRecord.getTwoHundredDayAverageChangePercent())
			.fiftyTwoWeekHigh(quoteRecord.getFiftyTwoWeekHigh())
			.fiftyTwoWeekHighChangePercent(quoteRecord.getFiftyTwoWeekHighChangePercent())
			.fiftyTwoWeekLow(quoteRecord.getFiftyTwoWeekLow())
			.fiftyTwoWeekLowChangePercent(quoteRecord.getFiftyTwoWeekLowChangePercent())
			.quoteType(quoteRecord.getQuoteType())
			.chartData(Collections.singletonList(chartData))
			.build();
	}

	public <T> Collector<T, ?, List<T>> lastN(int n) {
		return Collector.<T, Deque<T>, List<T>>of(ArrayDeque::new, (acc, t) -> {
			if(acc.size() == n)
				acc.pollFirst();
			acc.add(t);
		}, (acc1, acc2) -> {
			while(acc2.size() < n && !acc1.isEmpty()) {
				acc2.addFirst(acc1.pollLast());
			}
			return acc2;
		}, ArrayList::new);
	}
}
