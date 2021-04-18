package org.stonkmonitor.model

import java.util.ArrayList

data class YahooFinanceResponse (
    val quoteResponse: QuoteResponse = QuoteResponse()
)

data class QuoteResponse (
    val result: List<QuoteRecord> = ArrayList()
)