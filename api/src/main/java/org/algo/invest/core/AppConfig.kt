package org.algo.invest.core

import org.algo.invest.core.quotes.*
import org.algo.invest.model.Industry
import org.algo.invest.model.QuoteSymbolMetaData
import org.springframework.stereotype.Component
import java.util.*

@Component
class AppConfig {

    val yahooFinanceQuoteUrl = "https://query1.finance.yahoo.com/v7/finance/quote"
    val allQuoteSymbolsUrl: String
    val quoteSymbolMetaData: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()
    val quoteSymbolUrls: Map<Industry, String> = EnumMap(Industry::class.java)

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