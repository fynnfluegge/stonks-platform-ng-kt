package org.stonkmonitor.config

import org.stonkmonitor.model.QuoteSymbolMetaData
import org.springframework.stereotype.Component
import org.stonkmonitor.config.quotes.*
import java.util.*

@Component
class AppConfig {

    val allQuoteSymbolsUrl: String
    val quoteSymbolMetaData: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

    private fun addSymbolNameMappings() {
        quoteSymbolMetaData.putAll(indicesQuotes)
        quoteSymbolMetaData.putAll(techQuotes)
        quoteSymbolMetaData.putAll(healthQuotes)
        quoteSymbolMetaData.putAll(foodQuotes)
        quoteSymbolMetaData.putAll(retailQuotes)
        quoteSymbolMetaData.putAll(financeQuotes)
        quoteSymbolMetaData.putAll(industrialQuotes)
        quoteSymbolMetaData.putAll(mobilityQuotes)
        quoteSymbolMetaData.putAll(energyQuotes)
        quoteSymbolMetaData.putAll(mediaQuotes)
        quoteSymbolMetaData.putAll(miscQuotes)
    }

    init {
        System.setProperty("yahoofinance.histquotes2.enabled", "false")
        addSymbolNameMappings()
        allQuoteSymbolsUrl = java.lang.String.join(",", quoteSymbolMetaData.keys)
    }
}