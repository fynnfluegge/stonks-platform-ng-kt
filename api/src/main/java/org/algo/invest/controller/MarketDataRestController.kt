package org.algo.invest.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.CrossOrigin
import org.algo.invest.service.MarketDataService
import org.algo.invest.core.AppConfig
import org.springframework.web.bind.annotation.RequestMapping
import reactor.core.publisher.Flux
import org.algo.invest.dto.QuoteDto
import reactor.core.publisher.Mono
import org.algo.invest.model.QuoteType
import org.algo.invest.model.Industry
import java.util.stream.Collectors
import org.algo.invest.model.QuoteRecord
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMethod
import org.algo.invest.dto.ChartDataDto
import org.springframework.http.MediaType
import yahoofinance.histquotes.HistoricalQuote
import java.io.FileInputStream
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.util.*
import kotlin.streams.asSequence

@RestController
@CrossOrigin("http://localhost:4200", "http://47.91.78.219:3000")
class MarketDataRestController(
    private val marketDataService: MarketDataService,
    private val appConfig: AppConfig)
{
    @get:RequestMapping(value = ["/stream/quotes/indices"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    val indicesQuotes: Flux<QuoteDto> =
        Mono.just(listOf(getQuotes(QuoteType.CURRENCY, Industry.NONE), getQuotes(QuoteType.INDEX, Industry.NONE)).flatten())
            .flatMapMany { Flux.fromIterable(it) }
            .mergeWith(marketDataService.latestQuotes.filter { it.quoteType == QuoteType.INDEX || it.quoteType == QuoteType.CURRENCY }
            .map { getQuoteDto(it) })

    @get:RequestMapping(value = ["/stream/quotes/etf"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    val etfQuotes: Flux<QuoteDto> =
        Mono.just(getQuotes(QuoteType.ETF, Industry.NONE))
            .flatMapMany { Flux.fromIterable(it) }
            .mergeWith(marketDataService.latestQuotes.filter { it.quoteType === QuoteType.ETF }
            .map { getQuoteDto(it) })

    @RequestMapping(value = ["/stream/quotes/{industry}"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun ecommerceQuotes(@PathVariable industry: String): Flux<QuoteDto> =
        Mono.just(getQuotes(QuoteType.EQUITY, Industry.valueOf(industry.toUpperCase())))
            .flatMapMany { Flux.fromIterable(it) }
            .mergeWith(marketDataService.latestQuotes
                .filter { it.quoteType == QuoteType.EQUITY && appConfig.symbolNameMapping[it.symbol]!!.industry == Industry.valueOf(industry.toUpperCase())
                }
                .map { getQuoteDto(it) })

    @get:RequestMapping(value = ["/24hOutPerformer"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    val dailyOutPerformer: Flux<QuoteDto> =
        Mono.just(appConfig.symbolNameMapping.keys
            .asSequence()
            .map { marketDataService.realtimeStockRecords.getValue(it) }
            .filter { it.quoteType == QuoteType.EQUITY }
            .sortedByDescending { it.regularMarketChangePercent }
            .map{ getQuoteDto(it) }
            .take(10)
            .toList()
        ).flatMapMany { Flux.fromIterable(it) }

    @get:RequestMapping(value = ["/24hUnderPerformer"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    val dailyUnderPerformer: Flux<QuoteDto> =
        Mono.just(appConfig.symbolNameMapping.keys
            .asSequence()
            .map { marketDataService.realtimeStockRecords.getValue(it) }
            .filter { it.quoteType == QuoteType.EQUITY }
            .sortedBy { it.regularMarketChangePercent }
            .map{ getQuoteDto(it) }
            .take(10)
            .toList()
        ).flatMapMany { Flux.fromIterable(it) }

    @RequestMapping(value = ["/50dOutPerformer"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun get50dOutPerformer(): Flux<QuoteDto> =
        Mono.just(appConfig.symbolNameMapping.keys
            .asSequence()
            .map { marketDataService.realtimeStockRecords.getValue(it) }
            .filter { it.quoteType == QuoteType.EQUITY }
            .sortedByDescending { it.fiftyDayAverageChangePercent }
            .map{ getQuoteDto(it) }
            .take(10)
            .toList()
        ).flatMapMany { Flux.fromIterable(it) }

    @RequestMapping(value = ["/50dUnderPerformer"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun get50dPerformer(): Flux<QuoteDto> =
        Mono.just(appConfig.symbolNameMapping.keys
                .asSequence()
                .map { marketDataService.realtimeStockRecords.getValue(it) }
                .filter { it.quoteType == QuoteType.EQUITY }
                .sortedBy { it.fiftyDayAverageChangePercent }
                .map{ getQuoteDto(it) }
                .take(10)
                .toList()
        ).flatMapMany { Flux.fromIterable(it) }

    @RequestMapping(value = ["/200dOutPerformer"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun get200dOutPerformer(): Flux<QuoteDto> =
        Mono.just(appConfig.symbolNameMapping.keys
            .asSequence()
            .map { marketDataService.realtimeStockRecords.getValue(it) }
            .filter { it.quoteType === QuoteType.EQUITY }
            .sortedByDescending { it.twoHundredDayAverageChangePercent }
            .map{ getQuoteDto(it) }
            .take(10)
            .toList()
        ).flatMapMany { Flux.fromIterable(it) }

    @RequestMapping(value = ["/200dUnderPerformer"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun get200dUnderPerformer(): Flux<QuoteDto> =
        Mono.just(appConfig.symbolNameMapping.keys.stream()
            .asSequence()
            .map { marketDataService.realtimeStockRecords.getValue(it) }
            .filter { it.quoteType === QuoteType.EQUITY }
            .sortedBy { it.twoHundredDayAverageChangePercent }
            .map{ getQuoteDto(it) }
            .take(10)
            .toList()
        ).flatMapMany { Flux.fromIterable(it) }

    private fun getQuotes(quoteType: QuoteType, industry: Industry): List<QuoteDto> =
        appConfig.symbolNameMapping.keys
            .asSequence()
            .map { marketDataService.realtimeStockRecords.getValue(it) }
            .filter{ it.quoteType === quoteType && appConfig.symbolNameMapping.getValue(it.symbol!!).industry === industry }
            .map{ getQuoteDto(it) }
            .toList()

    private fun getQuoteDto(quoteRecord: QuoteRecord): QuoteDto {
        val chartData = ChartDataDto(
            if (marketDataService.historyQuotes.containsKey(quoteRecord.symbol) && marketDataService.historyQuotes.getValue(quoteRecord.symbol).size > 10)
                marketDataService.historyQuotes[quoteRecord.symbol]!!.entries.toList().takeLast(10).subList(0, 10)
                    .stream().map { x: Map.Entry<Calendar?, HistoricalQuote> -> x.value.close.toFloat() }
                    .collect(Collectors.toList())
            else ArrayList())
        if (chartData.data?.size == 10 && chartData.data[9] != quoteRecord.regularMarketPrice.toFloat()) {
            Collections.rotate(chartData.data, -1)
            chartData.data.mapIndexed { index, _ -> if (index == 9) quoteRecord.regularMarketPrice.toFloat() }
        }
        return quoteDto(quoteRecord, chartData)
    }

    @RequestMapping(value = ["/quote/{symbol}"], method = [RequestMethod.GET])
    fun getQuote(@PathVariable symbol: String): QuoteDto {
        val quoteRecord = marketDataService.realtimeStockRecords.getValue(symbol)
        val chartData = ChartDataDto(
            if (marketDataService.historyQuotes.containsKey(symbol) && marketDataService.historyQuotes.getValue(symbol).size >= 200)
                marketDataService.historyQuotes.getValue(symbol).values.toList().takeLast(200).subList(0, 200)
                    .stream().map { it.close.toFloat() }
                    .collect(Collectors.toList())
            else ArrayList()
        )
        if (chartData.data?.size == 200 && chartData.data[199] != quoteRecord.regularMarketPrice.toFloat()) {
            Collections.rotate(chartData.data, -1)
            chartData.data.mapIndexed { index, _ -> if (index == 199) quoteRecord.regularMarketPrice.toFloat() }
        }
        return quoteDto(quoteRecord!!, chartData)
    }

    @get:RequestMapping(value = ["/log"], method = [RequestMethod.GET])
    val log: List<String>
        get() {
            val sLog: MutableList<String> = ArrayList()
            try {
                val stream = FileInputStream("logs/bot-app.log")
                val br = BufferedReader(InputStreamReader(stream))
                var strLine: String
                while (br.readLine().also { strLine = it } != null) {
                    sLog.add(strLine)
                }
                stream.close()
            } catch (ignored: Exception) {
            }
            return sLog
        }

    private fun quoteDto(quoteRecord: QuoteRecord, chartData: ChartDataDto) =
        QuoteDto(
            quoteRecord.symbol,
            appConfig.symbolNameMapping.getValue(quoteRecord.symbol!!).name,
            appConfig.symbolNameMapping.getValue(quoteRecord.symbol).wkn,
            quoteRecord.regularMarketPrice.toFloat(),
            quoteRecord.regularMarketChange,
            quoteRecord.regularMarketChangePercent,
            quoteRecord.currency,
            quoteRecord.fullExchangeName,
            quoteRecord.marketCap,
            quoteRecord.fiftyDayAverage,
            quoteRecord.fiftyDayAverageChangePercent,
            quoteRecord.twoHundredDayAverage,
            quoteRecord.twoHundredDayAverageChangePercent,
            quoteRecord.fiftyTwoWeekHigh,
            quoteRecord.fiftyTwoWeekHighChangePercent,
            quoteRecord.fiftyTwoWeekLow,
            quoteRecord.fiftyTwoWeekLowChangePercent,
            quoteRecord.quoteType,
            listOf(chartData)
        )
}