package org.algo.invest.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.algo.invest.core.AppConfig;
import org.algo.invest.dto.ChartDataDto;
import org.algo.invest.dto.QuoteDto;
import org.algo.invest.model.Industry;
import org.algo.invest.model.QuoteRecord;
import org.algo.invest.model.QuoteType;
import org.algo.invest.service.MarketDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin({"http://localhost:4200", "http://47.91.78.219:3000"})
public class MarketDataRestController {

    @Autowired
    MarketDataService marketDataService;

    @Autowired
    AppConfig appConfig;

    @RequestMapping(value="/stream/quotes/indices", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> getIndicesQuotes() {
        Flux<QuoteDto> flux = Mono.just(
                Stream.concat(getQuotes(QuoteType.CURRENCY, Industry.NONE).stream(), getQuotes(QuoteType.INDEX, Industry.NONE).stream()).collect(Collectors.toList()))
                .flatMapMany(Flux::fromIterable);
        return flux.mergeWith(marketDataService.getLatestQuotes().filter(it -> it.getQuoteType() == QuoteType.INDEX || it.getQuoteType() == QuoteType.CURRENCY).map(this::getQuoteDto));
    }

    @RequestMapping(value="/stream/quotes/etf", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> getEtfQuotes() {
        Flux<QuoteDto> flux = Mono.just(getQuotes(QuoteType.ETF, Industry.NONE)).flatMapMany(Flux::fromIterable);
        return flux.mergeWith(marketDataService.getLatestQuotes().filter(it -> it.getQuoteType() == QuoteType.ETF).map(this::getQuoteDto));
    }

    @RequestMapping(value="/stream/quotes/{industry}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> getEcommerceQuotes(@PathVariable String industry) {
        Flux<QuoteDto> flux = Mono.just(getQuotes(QuoteType.EQUITY, Industry.valueOf(industry.toUpperCase()))).flatMapMany(Flux::fromIterable);
        return flux.mergeWith(marketDataService.getLatestQuotes()
                .filter(it -> it.getQuoteType() == QuoteType.EQUITY && appConfig.getSymbolNameMapping().get(it.getSymbol()).getIndustry() == Industry.valueOf(industry.toUpperCase())).map(this::getQuoteDto));
    }

    @RequestMapping(value="/24hOutPerformer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> getDailyOutPerformer() {
        Flux<QuoteDto> flux = Mono.just(appConfig.getSymbolNameMapping().keySet().stream().map(s -> marketDataService.getRealtimeStockRecords().get(s))
                .filter(x -> x.getQuoteType() == QuoteType.EQUITY)
                .sorted(Comparator.comparing(QuoteRecord::getRegularMarketChangePercent).reversed())
                .map(this::getQuoteDto).collect(Collectors.toList()).subList(0, 9)).flatMapMany(Flux::fromIterable);
        return flux;
    }

    @RequestMapping(value="/24hUnderPerformer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> getDailyUnderPerformer() {
        Flux<QuoteDto> flux = Mono.just(appConfig.getSymbolNameMapping().keySet().stream().map(s -> marketDataService.getRealtimeStockRecords().get(s))
                .filter(x -> x.getQuoteType() == QuoteType.EQUITY)
                .sorted(Comparator.comparing(QuoteRecord::getRegularMarketChangePercent))
                .map(this::getQuoteDto).collect(Collectors.toList()).subList(0, 9)).flatMapMany(Flux::fromIterable);
        return flux;
    }

    @RequestMapping(value="/50dOutPerformer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> get50dOutPerformer() {
        Flux<QuoteDto> flux = Mono.just(appConfig.getSymbolNameMapping().keySet().stream().map(s -> marketDataService.getRealtimeStockRecords().get(s))
                .filter(x -> x.getQuoteType() == QuoteType.EQUITY)
                .sorted(Comparator.comparing(QuoteRecord::getFiftyDayAverageChangePercent).reversed())
                .map(this::getQuoteDto).collect(Collectors.toList()).subList(0, 9)).flatMapMany(Flux::fromIterable);
        return flux;
    }

    @RequestMapping(value="/50dUnderPerformer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> get50dPerformer() {
        Flux<QuoteDto> flux = Mono.just(appConfig.getSymbolNameMapping().keySet().stream().map(s -> marketDataService.getRealtimeStockRecords().get(s))
                .filter(x -> x.getQuoteType() == QuoteType.EQUITY)
                .sorted(Comparator.comparing(QuoteRecord::getFiftyDayAverageChangePercent))
                .map(this::getQuoteDto).collect(Collectors.toList()).subList(0, 9)).flatMapMany(Flux::fromIterable);
        return flux;
    }

    @RequestMapping(value="/200dOutPerformer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> get200dOutPerformer() {
        Flux<QuoteDto> flux = Mono.just(appConfig.getSymbolNameMapping().keySet().stream().map(s -> marketDataService.getRealtimeStockRecords().get(s))
                .filter(x -> x.getQuoteType() == QuoteType.EQUITY)
                .sorted(Comparator.comparing(QuoteRecord::getTwoHundredDayAverageChangePercent).reversed())
                .map(this::getQuoteDto).collect(Collectors.toList()).subList(0, 9)).flatMapMany(Flux::fromIterable);
        return flux;
    }

    @RequestMapping(value="/200dUnderPerformer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<QuoteDto> get200dUnderPerformer() {
        Flux<QuoteDto> flux = Mono.just(appConfig.getSymbolNameMapping().keySet().stream().map(s -> marketDataService.getRealtimeStockRecords().get(s))
                .filter(x -> x.getQuoteType() == QuoteType.EQUITY)
                .sorted(Comparator.comparing(QuoteRecord::getTwoHundredDayAverageChangePercent))
                .map(this::getQuoteDto).collect(Collectors.toList()).subList(0, 9)).flatMapMany(Flux::fromIterable);
        return flux;
    }

    @RequestMapping(value="/allQuotes", method=RequestMethod.GET)
    public List<QuoteDto> getAllQuotes() {
        return appConfig.getSymbolNameMapping().keySet().stream().map(s -> marketDataService.getRealtimeStockRecords().get(s))
                .map(this::getQuoteDto).collect(Collectors.toList());
    }

    private List<QuoteDto> getQuotes(QuoteType quoteType, Industry industry){

        return appConfig.getSymbolNameMapping().keySet().stream().map(s -> marketDataService.getRealtimeStockRecords().get(s))
                .filter(x -> x.getQuoteType() == quoteType && appConfig.getSymbolNameMapping().get(x.getSymbol()).getIndustry() == industry)
                .map(this::getQuoteDto).collect(Collectors.toList());
    }

    private QuoteDto getQuoteDto(QuoteRecord quoteRecord) {

        ChartDataDto chartData = new ChartDataDto(
                marketDataService.getHistoryQuotes().containsKey(quoteRecord.getSymbol())
                        && marketDataService.getHistoryQuotes().get(quoteRecord.getSymbol()).size() > 10 ?
                        marketDataService.getHistoryQuotes().get(quoteRecord.getSymbol()).entrySet().stream().collect(lastN(10)).subList(0, 10)
                                .stream().map(x -> x.getValue().getClose().floatValue()).collect(Collectors.toList()) :
                        new ArrayList<Float>());

        if (chartData.getData().size() == 10 && chartData.getData().get(9) != quoteRecord.getRegularMarketPrice().floatValue())
        {
            chartData.getData().remove(0);
            chartData.getData().add(quoteRecord.getRegularMarketPrice().floatValue());
        }

        return new QuoteDto(
                quoteRecord.getSymbol(),
                appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getName(),
                appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getWkn(),
                quoteRecord.getRegularMarketPrice().floatValue(),
                quoteRecord.getRegularMarketChange(),
                quoteRecord.getRegularMarketChangePercent(),
                quoteRecord.getCurrency(),
                quoteRecord.getFullExchangeName(),
                quoteRecord.getMarketCap(),
                quoteRecord.getFiftyDayAverage(),
                quoteRecord.getFiftyDayAverageChangePercent(),
                quoteRecord.getTwoHundredDayAverage(),
                quoteRecord.getTwoHundredDayAverageChangePercent(),
                quoteRecord.getFiftyTwoWeekHigh(),
                quoteRecord.getFiftyTwoWeekHighChangePercent(),
                quoteRecord.getFiftyTwoWeekLow(),
                quoteRecord.getFiftyTwoWeekLowChangePercent(),
                quoteRecord.getQuoteType(),
                Collections.singletonList(chartData));
    }

    @RequestMapping(value="/quote/{symbol}", method=RequestMethod.GET)
    public QuoteDto getQuote(@PathVariable String symbol) {

        QuoteRecord quoteRecord = marketDataService.getRealtimeStockRecords().get(symbol);

        ChartDataDto chartData = new ChartDataDto(
                marketDataService.getHistoryQuotes().containsKey(symbol) &&
                        marketDataService.getHistoryQuotes().get(symbol).size() >= 200 ?
                        marketDataService.getHistoryQuotes().get(symbol).values().stream().collect(lastN(200)).subList(0, 200)
                                .stream().map(x -> x.getClose().floatValue()).collect(Collectors.toList()) :
                        new ArrayList<>());

        if (chartData.getData().size() == 200 && chartData.getData().get(199) != quoteRecord.getRegularMarketPrice().floatValue())
        {
            chartData.getData().remove(0);
            chartData.getData().add(quoteRecord.getRegularMarketPrice().floatValue());
        }

        return new QuoteDto(
                quoteRecord.getSymbol(),
                appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getName(),
                appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getWkn(),
                quoteRecord.getRegularMarketPrice().floatValue(),
                quoteRecord.getRegularMarketChange(),
                quoteRecord.getRegularMarketChangePercent(),
                quoteRecord.getCurrency(),
                quoteRecord.getFullExchangeName(),
                quoteRecord.getMarketCap(),
                quoteRecord.getFiftyDayAverage(),
                quoteRecord.getFiftyDayAverageChangePercent(),
                quoteRecord.getTwoHundredDayAverage(),
                quoteRecord.getTwoHundredDayAverageChangePercent(),
                quoteRecord.getFiftyTwoWeekHigh(),
                quoteRecord.getFiftyTwoWeekHighChangePercent(),
                quoteRecord.getFiftyTwoWeekLow(),
                quoteRecord.getFiftyTwoWeekLowChangePercent(),
                quoteRecord.getQuoteType(),
                Collections.singletonList(chartData));
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
}
