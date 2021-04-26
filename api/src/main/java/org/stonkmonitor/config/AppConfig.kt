package org.stonkmonitor.config

import org.stonkmonitor.model.QuoteSymbolMetaData
import org.springframework.stereotype.Component
import org.stonkmonitor.config.lists.wuchtlistQuotes
import org.stonkmonitor.config.quotes.*
import java.util.*

@Component
class AppConfig {

    val allQuoteSymbolsUrl: String
    val quoteSymbolMetaData: Map<String, QuoteSymbolMetaData> = LinkedHashMap<String, QuoteSymbolMetaData>().apply {
        putAll(indicesQuotes)
        putAll(indicesQuotes)
        putAll(techQuotes)
        putAll(healthQuotes)
        putAll(foodQuotes)
        putAll(retailQuotes)
        putAll(financeQuotes)
        putAll(industrialQuotes)
        putAll(mobilityQuotes)
        putAll(energyQuotes)
        putAll(mediaQuotes)
        putAll(miscQuotes)
        putAll(wuchtlistQuotes)
    }

    init {
        allQuoteSymbolsUrl = java.lang.String.join(",", quoteSymbolMetaData.keys)
    }
}