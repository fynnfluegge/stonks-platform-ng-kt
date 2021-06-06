package org.stonkmonitor.config

import org.stonkmonitor.model.QuoteSymbolMetaData
import org.springframework.stereotype.Component
import java.util.*

@Component
class AppConfig {

    val allQuoteSymbolsUrl: String
    val quoteSymbolMetaData: Map<String, QuoteSymbolMetaData> = LinkedHashMap<String, QuoteSymbolMetaData>()

    init {
        allQuoteSymbolsUrl = java.lang.String.join(",", quoteSymbolMetaData.keys)
    }
}