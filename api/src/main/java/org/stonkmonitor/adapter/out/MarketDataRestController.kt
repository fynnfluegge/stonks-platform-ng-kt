package org.stonkmonitor.adapter.out

import org.stonkmonitor.adapter.`in`.yahoo.MarketDataService
import org.stonkmonitor.config.AppConfig
import org.stonkmonitor.config.watchlistQuotes
import org.stonkmonitor.model.ChartDataDto
import org.stonkmonitor.model.HistoricalDayCandle
import reactor.core.publisher.Flux
import org.stonkmonitor.model.QuoteDto
import reactor.core.publisher.Mono
import java.util.stream.Collectors
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import org.stonkmonitor.model.*
import yahoofinance.histquotes.HistoricalQuote
import java.io.FileInputStream
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.lang.IndexOutOfBoundsException
import java.util.*

@RestController
@CrossOrigin("http://localhost:4200", "http://47.91.78.219:3000")
class MarketDataRestController(
        private val marketDataService: MarketDataService,
        private val appConfig: AppConfig)
{
    private val pagesize: Int = 30

    @RequestMapping(value = ["/stream/quotes/{industry}"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun quotesByIndustry(@PathVariable industry: String): Flux<QuoteDto> =
        Mono.just(getQuotes(Industry.valueOf(industry.toUpperCase())))
            .flatMapMany { Flux.fromIterable(it) }
            .mergeWith(marketDataService.latestQuotes
                .filter { appConfig.quoteSymbolMetaData[it.symbol]!!.industry == Industry.valueOf(industry.toUpperCase()) }
                .map { getQuoteDto(it) })

    @RequestMapping(value = ["/stream/quotes/{industry}/{category}"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun quotesByCategory(@PathVariable industry: String, @PathVariable category: String): Flux<QuoteDto> =
        Mono.just(getQuotes(Industry.valueOf(industry.toUpperCase())))
            .flatMapMany { Flux.fromIterable(it) }
            .mergeWith(marketDataService.latestQuotes
                .filter { it.quoteType == QuoteType.EQUITY
                    && appConfig.quoteSymbolMetaData[it.symbol]!!.industry == Industry.valueOf(industry.toUpperCase())
                    && appConfig.quoteSymbolMetaData[it.symbol]!!.subIndustry == SubIndustry.valueOf(category.toUpperCase())
                }
                .map { getQuoteDto(it) })

    @RequestMapping(value = ["/stream/quotes/{industry}/{page}"])
    fun page(@PathVariable industry: String, @PathVariable page: Int,
             @RequestParam(required = false) sortProperty: String?, @RequestParam(required = false) sortDirection: String?) =
        getQuotes(Industry.valueOf(industry.toUpperCase()), page, sortProperty, sortDirection)

    @RequestMapping(value = ["/24hOutPerformer"])
    fun dailyOutPerformer() =
        marketDataService.realtimeStockRecords.values.asSequence()
            .filter { it.quoteType == QuoteType.EQUITY }
            .sortedByDescending { it.regularMarketChangePercent }
            .map{ getQuoteDto(it) }
            .take(10)
            .toList()

    @RequestMapping(value = ["/24hUnderPerformer"])
    fun dailyUnderPerformer() =
        marketDataService.realtimeStockRecords.values.asSequence()
            .filter { it.quoteType == QuoteType.EQUITY }
            .sortedBy { it.regularMarketChangePercent }
            .map{ getQuoteDto(it) }
            .take(10)
            .toList()

    @RequestMapping(value = ["/50dOutPerformer"])
    fun get50dOutPerformer() =
        marketDataService.realtimeStockRecords.values.asSequence()
            .filter { it.quoteType == QuoteType.EQUITY }
            .sortedByDescending { it.fiftyDayAverageChangePercent }
            .map{ getQuoteDto(it) }
            .take(10)
            .toList()

    @RequestMapping(value = ["/50dUnderPerformer"])
    fun get50dPerformer() =
        marketDataService.realtimeStockRecords.values.asSequence()
            .filter { it.quoteType == QuoteType.EQUITY }
            .sortedBy { it.fiftyDayAverageChangePercent }
            .map{ getQuoteDto(it) }
            .take(10)
            .toList()

    @RequestMapping(value = ["/200dOutPerformer"])
    fun get200dOutPerformer() =
        marketDataService.realtimeStockRecords.values.asSequence()
            .filter { it.quoteType === QuoteType.EQUITY }
            .sortedByDescending { it.twoHundredDayAverageChangePercent }
            .map{ getQuoteDto(it) }
            .take(10)
            .toList()

    @RequestMapping(value = ["/200dUnderPerformer"])
    fun get200dUnderPerformer() =
        marketDataService.realtimeStockRecords.values.asSequence()
            .filter { it.quoteType === QuoteType.EQUITY }
            .sortedBy { it.twoHundredDayAverageChangePercent }
            .map{ getQuoteDto(it) }
            .take(10)
            .toList()

    private fun getQuotes(industry: Industry): List<QuoteDto> =
        appConfig.quoteSymbolMetaData.filter{ it.value.industry === industry }.keys
            .asSequence()
            .map { getQuoteDto(marketDataService.realtimeStockRecords.getValue(it)) }
            .toList()

    private fun getQuotes(industry: Industry, page: Int, sortProperty: String?, sortDirection: String?): List<QuoteDto> =
        try {
            appConfig.quoteSymbolMetaData.filter{ it.value.industry === industry }.keys
                .asSequence()
                .map { marketDataService.realtimeStockRecords.getValue(it) }
                .sortedWith { a, b -> compare(a,b, sortProperty, sortDirection) }
                .chunked(pagesize)
                .elementAt(page)
                .map{ getQuoteDto(it) }
                .toList()
        } catch (exception: IndexOutOfBoundsException){
            emptyList()
        }

    private fun getQuoteDto(quoteRecord: QuoteRecord): QuoteDto {
        val chartData = ChartDataDto(
            if (marketDataService.historyQuotes.containsKey(quoteRecord.symbol) && marketDataService.historyQuotes.getValue(quoteRecord.symbol).size > 10)
                marketDataService.historyQuotes[quoteRecord.symbol]!!.entries.toList().takeLast(10)
                    .stream().map { x: Map.Entry<Calendar?, HistoricalQuote>
                        -> HistoricalDayCandle(x.value.open.toFloat(), x.value.low.toFloat(), x.value.high.toFloat(), x.value.close.toFloat()) }
                    .collect(Collectors.toList())
            else ArrayList())
        if (chartData.data?.size == 10 && chartData.data[9].close == quoteRecord.regularMarketPreviousClose) {
            Collections.rotate(chartData.data, -1)
            chartData.data.removeLast()
            chartData.data.add(HistoricalDayCandle(quoteRecord.regularMarketOpen, quoteRecord.regularMarketDayLow, quoteRecord.regularMarketDayHigh, quoteRecord.regularMarketPrice.toFloat()))
        }
        return quoteRecord.toDto(chartData, appConfig.quoteSymbolMetaData.getValue(quoteRecord.symbol!!))
    }

    @RequestMapping(value = ["/quote/{symbol}"], method = [RequestMethod.GET])
    fun getQuote(@PathVariable symbol: String): QuoteDto {
        val quoteRecord = marketDataService.realtimeStockRecords.getValue(symbol)
        val chartData = ChartDataDto(
            if (marketDataService.historyQuotes.containsKey(symbol) && marketDataService.historyQuotes.getValue(symbol).size >= 200)
                marketDataService.historyQuotes.getValue(symbol).values.toList().takeLast(200)
                    .stream().map { HistoricalDayCandle(it.open.toFloat(), it.low.toFloat(), it.high.toFloat(), it.close.toFloat()) }
                    .collect(Collectors.toList())
            else ArrayList()
        )
        if (chartData.data?.size == 200 && chartData.data[199].close == quoteRecord.regularMarketPreviousClose) {
            Collections.rotate(chartData.data, -1)
            chartData.data.removeLast()
            chartData.data.add(HistoricalDayCandle(quoteRecord.regularMarketOpen, quoteRecord.regularMarketDayLow, quoteRecord.regularMarketDayHigh, quoteRecord.regularMarketPrice))
        }
        return quoteRecord.toDto(chartData, appConfig.quoteSymbolMetaData.getValue(quoteRecord.symbol!!))
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

    private fun compare(a: QuoteRecord, b: QuoteRecord, sortProperty: String?, sortDirection: String?) =
        when (sortProperty){
            "name" ->
                when {
                    a.symbol.toString() > b.symbol.toString() -> if (sortDirection == "desc") -1 else 1
                    a.symbol.toString() < b.symbol.toString() -> if (sortDirection == "desc") 1 else -1
                    else -> 0
                }
            "dayChangePercent" ->
                when {
                    a.regularMarketChangePercent > b.regularMarketChangePercent -> if (sortDirection == "desc") -1 else 1
                    a.regularMarketChangePercent < b.regularMarketChangePercent -> if (sortDirection == "desc") 1 else -1
                    else -> 0
                }
            "fiftyDayAverageChangePercent" ->
                when {
                    a.fiftyDayAverageChangePercent > b.fiftyDayAverageChangePercent -> if (sortDirection == "desc") -1 else 1
                    a.fiftyDayAverageChangePercent < b.fiftyDayAverageChangePercent -> if (sortDirection == "desc") 1 else -1
                    else -> 0
                }
            "twoHundredDayAverageChangePercent" ->
                when {
                    a.twoHundredDayAverageChangePercent > b.twoHundredDayAverageChangePercent -> if (sortDirection == "desc") -1 else 1
                    a.twoHundredDayAverageChangePercent < b.twoHundredDayAverageChangePercent -> if (sortDirection == "desc") 1 else -1
                    else -> 0
                }
            "fiftyTwoWeekLowChangePercent" ->
                when {
                    a.fiftyTwoWeekLowChangePercent > b.fiftyTwoWeekLowChangePercent -> if (sortDirection == "desc") -1 else 1
                    a.fiftyTwoWeekLowChangePercent < b.fiftyTwoWeekLowChangePercent -> if (sortDirection == "desc") 1 else -1
                    else -> 0
                }
            "fiftyTwoWeekHighChangePercent" ->
                when {
                    a.fiftyTwoWeekHighChangePercent > b.fiftyTwoWeekHighChangePercent -> if (sortDirection == "desc") -1 else 1
                    a.fiftyTwoWeekHighChangePercent < b.fiftyTwoWeekHighChangePercent -> if (sortDirection == "desc") 1 else -1
                    else -> 0
                }
            "marketCap" ->
                when {
                    a.marketCap > b.marketCap -> if (sortDirection == "desc") -1 else 1
                    a.marketCap < b.marketCap -> if (sortDirection == "desc") 1 else -1
                    else -> 0
                }
            else -> 0
        }


    @RequestMapping(value = ["/stream/quotes/watchlist/Ae8m0X1h"])
    fun watchlist() =
        appConfig.quoteSymbolMetaData.keys
            .asSequence()
            .map { marketDataService.realtimeStockRecords.getValue(it) }
            .filter{ watchlistQuotes.containsKey(appConfig.quoteSymbolMetaData[it.symbol]!!.symbol) }
            .map{ getQuoteDto(it) }
            .toList()
}