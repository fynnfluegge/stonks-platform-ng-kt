package org.stonkmonitor.adapter.`in`.yahoo

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.ExchangeStrategies
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.util.UriBuilder
import org.stonkmonitor.config.AppConfig
import org.stonkmonitor.model.HistoricalQuote
import org.stonkmonitor.model.QuoteRecord
import org.stonkmonitor.model.TickerAddedEvent
import org.stonkmonitor.model.YahooFinanceResponse
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.core.publisher.Sinks
import reactor.core.publisher.Sinks.Many
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.UnsupportedEncodingException
import java.math.BigDecimal
import java.net.*
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.util.function.Consumer

@Service
class MarketDataService(
    webClientBuilder: WebClient.Builder,
    exchangeStrategies: ExchangeStrategies,
    private val appConfig: AppConfig
): ApplicationListener<TickerAddedEvent> {
    var realtimeStockRecords: MutableMap<String, QuoteRecord> = ConcurrentHashMap()
    var historyQuotes: MutableMap<String, MutableMap<Calendar, HistoricalQuote>> = ConcurrentHashMap()
    var latestQuotes: Flux<QuoteRecord>
    var sink: Many<QuoteRecord> = Sinks.many().replay().latest()
    var mono: Mono<YahooFinanceResponse>

    private val webClient: WebClient = webClientBuilder
        .baseUrl("https://query1.finance.yahoo.com/v7/finance")
        .exchangeStrategies(exchangeStrategies)
        .build()

    init {
        latestQuotes = sink.asFlux()
        mono = webClient
            .get()
            .uri { uriBuilder: UriBuilder ->
                uriBuilder.path("/quote")
                    .queryParam("symbols", appConfig.allQuoteSymbolsUrl).build()
            }
            .retrieve()
            .bodyToMono(YahooFinanceResponse::class.java)
            .doOnError { throwable: Throwable? -> log.error("Failed for some reason", throwable) }
            .onErrorReturn(YahooFinanceResponse())

        // Init RealtimeMarketDataController.RealtimeStockRecords
        Objects.requireNonNull(mono.block()).quoteResponse.result.forEach(Consumer { quoteRecord: QuoteRecord ->
            realtimeStockRecords[quoteRecord.symbol!!] = quoteRecord
        })
    }

    @Scheduled(fixedRate = 2000, initialDelay = 1000)
    fun updateStockData() {
        try {
            mono.flatMapMany { (quoteResponse) -> Flux.fromIterable(quoteResponse.result) }
                .doOnNext { quoteRecord: QuoteRecord ->
                    if (realtimeStockRecords.containsKey(quoteRecord.symbol))
                        if (realtimeStockRecords[quoteRecord.symbol]!!.regularMarketPrice != quoteRecord.regularMarketPrice ||
                            realtimeStockRecords[quoteRecord.symbol]!!.preMarketChange != quoteRecord.preMarketChange ||
                            realtimeStockRecords[quoteRecord.symbol]!!.postMarketChange != quoteRecord.postMarketChange) {
                        realtimeStockRecords[quoteRecord.symbol!!] = quoteRecord
                        sink.tryEmitNext(quoteRecord)
                    }
                }.subscribe()
        } catch (e: Exception) {
            log.error(e.message)
        }
    }

    @Scheduled(cron = "0 0 0 * * *")
    fun updateHistoricalData() {
        for ((_, value) in getYahooHistoricalData(6.048e+8.toLong())) {
            for (quote in value) {
                historyQuotes[quote.symbol]!![quote.date!!] = quote
            }
        }
    }

    @Scheduled(initialDelay = 1000, fixedDelay = Long.MAX_VALUE)
    fun initHistoricalData() {
        for ((key, value) in getYahooHistoricalData(2.592e+10.toLong())) {
            historyQuotes[key] = LinkedHashMap()
            for (quote in value) {
                historyQuotes[key]!![quote.date!!] = quote
            }
        }
    }

    private fun getYahooHistoricalData(timeMillis: Long): Map<String, List<HistoricalQuote>> {
        val cal = Calendar.getInstance(Locale.GERMAN)
        cal.time = Date(System.currentTimeMillis() - timeMillis)
        val result: MutableMap<String, List<HistoricalQuote>> = HashMap()
        for (symbol in appConfig.quoteSymbolMetaData.keys) {
            var historicalQuotes: List<HistoricalQuote> = ArrayList()
            try {
                Thread.sleep(1000)
                historicalQuotes = getHistory(symbol, cal)
            } catch (e: Exception) {
                log.error(e.message)
            }
            result[symbol] = historicalQuotes
        }
        return result
    }

    @Throws(IOException::class)
    private fun getHistory(vSymbol: String, vFrom: Calendar): List<HistoricalQuote> {
        log.info("history date: $vSymbol")
        val result: MutableList<HistoricalQuote> = ArrayList()
        val dateTo = Calendar.getInstance()
        if (vFrom.after(dateTo)) {
            log.warn(
                "Unable to retrieve historical quotes. "
                    + "From-date should not be after to-date. From: "
                    + vFrom.time + ", to: " + dateTo.time
            )
            return result
        }
        val params: MutableMap<String, String> = LinkedHashMap()
        params["period1"] = (vFrom.timeInMillis / 1000).toString()
        params["period2"] = (dateTo.timeInMillis / 1000).toString()
        params["interval"] = "1d"
        val url = "https://query1.finance.yahoo.com/v7/finance/download/" + URLEncoder.encode(vSymbol, "UTF-8") + "?" + getURLParameters(params)
        val request = RedirectableRequest(URL(url), 5)
        request.connectTimeout = 10000
        request.readTimeout = 10000
        val requestProperties: Map<String, String> = HashMap()
        val connection = request.openConnection(requestProperties)
        val `is` = InputStreamReader(connection.getInputStream())
        val br = BufferedReader(`is`)
        br.readLine() // skip the first line
        // Parse CSV
        var line = br.readLine()
        while (line != null) {
            val quote = parseCSVLine(line, vSymbol)
            if (quote.close != null && quote.date != null) {
                result.add(quote)
            }
            line = br.readLine()
        }
        return result
    }

    private fun parseCSVLine(line: String, vSymbol: String): HistoricalQuote {
        val data = line.split(",").toTypedArray()
        return HistoricalQuote(
            vSymbol,
            parseHistDate(data[0]),
            getBigDecimal(data[1]),
            getBigDecimal(data[3]),
            getBigDecimal(data[2]),
            getBigDecimal(data[4]),
            getBigDecimal(data[5]),
            getLong(data[6])
        )
    }

    override fun onApplicationEvent(event: TickerAddedEvent) {
        appConfig.allQuoteSymbolsUrl += ",${event.ticker.symbol}"

        val newMono = webClient
            .get()
            .uri { uriBuilder: UriBuilder ->
                uriBuilder.path("/quote")
                    .queryParam("symbols", appConfig.allQuoteSymbolsUrl).build()
            }
            .retrieve()
            .bodyToMono(YahooFinanceResponse::class.java)
            .doOnError { throwable: Throwable? -> log.error("Failed for some reason", throwable) }
            .onErrorReturn(YahooFinanceResponse())

        // Init RealtimeMarketDataController.RealtimeStockRecords
        Objects.requireNonNull(newMono.block()).quoteResponse.result.forEach(Consumer { quoteRecord: QuoteRecord ->
            realtimeStockRecords[quoteRecord.symbol!!] = quoteRecord
        })

        appConfig.quoteSymbolMetaData.putIfAbsent(event.ticker.symbol, event.ticker)
        mono = newMono
    }
}

class RedirectableRequest @JvmOverloads constructor(var request: URL, private var protocolRedirectLimit: Int = 2) {
    var connectTimeout = 10000
    var readTimeout = 10000

    @JvmOverloads
    @Throws(IOException::class)
    fun openConnection(requestProperties: Map<String, String> = HashMap<String, String>()): URLConnection {
        var redirectCount = 0
        var hasResponse = false
        var connection: HttpURLConnection? = null
        var currentRequest = request
        while (!hasResponse && redirectCount <= protocolRedirectLimit) {
            connection = currentRequest.openConnection() as HttpURLConnection
            connection.connectTimeout = connectTimeout
            connection.readTimeout = readTimeout
            val var6: Iterator<*> = requestProperties.keys.iterator()
            while (var6.hasNext()) {
                val requestProperty = var6.next() as String
                connection.addRequestProperty(requestProperty, requestProperties[requestProperty])
            }
            connection.instanceFollowRedirects = true
            when (connection.responseCode) {
                301, 302 -> {
                    ++redirectCount
                    val location = connection.getHeaderField("Location")
                    currentRequest = URL(request, location)
                }
                else -> hasResponse = true
            }
        }
        return if (redirectCount > protocolRedirectLimit) {
            throw IOException("Protocol redirect count exceeded for url: " + request.toExternalForm())
        } else connection ?: throw IOException("Unexpected error while opening connection")
    }

    companion object {
        init {
            CookieHandler.setDefault(CookieManager(null as CookieStore?, CookiePolicy.ACCEPT_ALL))
        }
    }
}

fun parseHistDate(date: String): Calendar? {
    val format = SimpleDateFormat("yyyy-MM-dd", Locale.US)
    try {
        if (isParseable(date)) {
            val c = Calendar.getInstance()
            c.time = format.parse(date)
            return c
        }
    } catch (var3: ParseException) {
        log.debug("Failed to parse hist date: $date", var3)
    }
    return null
}

private fun isParseable(data: String?): Boolean {
    return data != null && data != "N/A" && data != "-" && data != "" && data != "nan"
}

fun getLong(data: String): Long? {
    var result: Long? = null
    return if (!isParseable(data)) {
        result
    } else {
        try {
            result = cleanNumberString(data).toLong()
        } catch (var3: NumberFormatException) {
            log.debug("Failed to parse: $data", var3)
        }
        result
    }
}

fun getBigDecimal(data: String): BigDecimal? {
    var result: BigDecimal? = null
    return if (!isParseable(data)) {
        result
    } else {
        try {
            var value = cleanNumberString(data)
            val lastChar = value[value.length - 1]
            var multiplier = BigDecimal.ONE
            when (lastChar) {
                'B' -> {
                    value = value.substring(0, value.length - 1)
                    multiplier = BigDecimal(1000000000)
                }
                'K' -> {
                    value = value.substring(0, value.length - 1)
                    multiplier = BigDecimal(1000)
                }
                'M' -> {
                    value = value.substring(0, value.length - 1)
                    multiplier = BigDecimal(1000000)
                }
            }
            result = BigDecimal(value).multiply(multiplier)
        } catch (var4: NumberFormatException) {
            log.debug("Failed to parse: $data", var4)
        }
        result
    }
}

private fun cleanNumberString(data: String): String {
    return join(data.trim { it <= ' ' }.split(",").toTypedArray(), "")
}

fun getURLParameters(params: Map<String, String>): String {
    val sb = StringBuilder()
    var key: String?
    var value: String?
    val var2: Iterator<*> = params.entries.iterator()
    while (var2.hasNext()) {
        val (key1, value1) = var2.next() as Map.Entry<*, *>
        if (sb.isNotEmpty()) {
            sb.append("&")
        }
        key = key1 as String
        value = value1 as String
        try {
            key = URLEncoder.encode(key, "UTF-8")
            value = URLEncoder.encode(value, "UTF-8")
        } catch (var7: UnsupportedEncodingException) {
            log.error(var7.message, var7)
        }
        sb.append(String.format("%s=%s", key, value))
    }
    return sb.toString()
}

fun join(data: Array<String>, d: String): String {
    return if (data.isEmpty()) {
        ""
    } else {
        val sb = java.lang.StringBuilder()
        var i = 0
        while (i < data.size - 1) {
            sb.append(data[i]).append(d)
            ++i
        }
        sb.append(data[i]).toString()
    }
}

val log: Logger = LoggerFactory.getLogger(MarketDataService::class.java)