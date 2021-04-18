package org.stonkmonitor.model

import java.math.BigDecimal
import java.util.*

data class YahooFinanceResponse (
    val quoteResponse: QuoteResponse = QuoteResponse()
)

data class QuoteResponse (
    val result: List<QuoteRecord> = ArrayList()
)

data class HistoricalQuote (
    val symbol: String,
    val date: Calendar? = null,
    val open: BigDecimal? = null,
    val low: BigDecimal? = null,
    val high: BigDecimal? = null,
    val close: BigDecimal? = null,
    val adjClose: BigDecimal? = null,
    val volume: Long? = null
)