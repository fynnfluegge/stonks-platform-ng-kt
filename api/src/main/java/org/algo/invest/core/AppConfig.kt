package org.algo.invest.core

import org.algo.invest.model.Industry
import org.algo.invest.model.QuoteSymbolMetaData
import org.algo.invest.core.quotes.TechQuotes
import org.algo.invest.core.quotes.IndicesQuotes
import org.algo.invest.core.quotes.HealthQuotes
import org.algo.invest.core.quotes.FoodQuotes
import org.algo.invest.core.quotes.RetailQuotes
import org.algo.invest.core.quotes.FinanceQuotes
import org.algo.invest.core.quotes.IndustryQuotes
import org.algo.invest.core.quotes.MobilityQuotes
import org.algo.invest.core.quotes.EnergyQuotes
import org.algo.invest.core.quotes.MediaQuotes
import org.algo.invest.core.quotes.MiscQuotes
import org.springframework.stereotype.Component
import java.util.*

@Component
class AppConfig {

    val yahooFinanceQuoteUrl = "https://query1.finance.yahoo.com/v7/finance/quote"
    val allQuoteSymbolsUrl: String
    val quoteSymbolMetaData: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()
    val quoteSymbolUrls: Map<Industry, String> = EnumMap(Industry::class.java)

    private fun addSymbolNameMappings() {
        quoteSymbolMetaData.putAll(IndicesQuotes.quotes)
        quoteSymbolMetaData.putAll(TechQuotes.quotes)
        quoteSymbolMetaData.putAll(HealthQuotes.quotes)
        quoteSymbolMetaData.putAll(FoodQuotes.quotes)
        quoteSymbolMetaData.putAll(RetailQuotes.quotes)
        quoteSymbolMetaData.putAll(FinanceQuotes.quotes)
        quoteSymbolMetaData.putAll(IndustryQuotes.quotes)
        quoteSymbolMetaData.putAll(MobilityQuotes.quotes)
        quoteSymbolMetaData.putAll(EnergyQuotes.quotes)
        quoteSymbolMetaData.putAll(MediaQuotes.quotes)
        quoteSymbolMetaData.putAll(MiscQuotes.quotes)
    }

    init {
        System.setProperty("yahoofinance.histquotes2.enabled", "false")
        addSymbolNameMappings()
        allQuoteSymbolsUrl = java.lang.String.join(",", quoteSymbolMetaData.keys)
    }
}