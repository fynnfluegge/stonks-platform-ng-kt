package org.algo.invest.core

import org.algo.invest.model.Industry
import org.algo.invest.model.QuoteSymbolMetaData
import org.algo.invest.core.quotes.TechQuotes
import org.algo.invest.core.quotes.IndicesQuotes
import org.algo.invest.core.quotes.EtfQuotes
import org.algo.invest.core.quotes.HealthQuotes
import org.algo.invest.core.quotes.FoodQuotes
import org.algo.invest.core.quotes.RetailQuotes
import org.algo.invest.core.quotes.FinanceQuotes
import org.algo.invest.core.quotes.IndustryQuotes
import org.algo.invest.core.quotes.MobilityQuotes
import org.algo.invest.core.quotes.EnergyQuotes
import org.algo.invest.core.quotes.MediaQuotes
import org.algo.invest.core.quotes.ChinaQuotes
import org.springframework.stereotype.Component
import java.util.*

@Component
class AppConfig {

    val yahooFinanceQuoteUrl = "https://query1.finance.yahoo.com/v7/finance/quote"
    val allQuoteSymbolsUrl: String
    val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()
    val quoteSymbolUrls: Map<Industry, String> = EnumMap(Industry::class.java)

    private fun addSymbolNameMappings() {
        symbolNameMapping.putAll(IndicesQuotes.quotes)
        symbolNameMapping.putAll(EtfQuotes.quotes)
        symbolNameMapping.putAll(TechQuotes.quotes)
        symbolNameMapping.putAll(HealthQuotes.quotes)
        symbolNameMapping.putAll(FoodQuotes.quotes)
        symbolNameMapping.putAll(RetailQuotes.quotes)
        symbolNameMapping.putAll(FinanceQuotes.quotes)
        symbolNameMapping.putAll(IndustryQuotes.quotes)
        symbolNameMapping.putAll(MobilityQuotes.quotes)
        symbolNameMapping.putAll(EnergyQuotes.quotes)
        symbolNameMapping.putAll(MediaQuotes.quotes)
        symbolNameMapping.putAll(ChinaQuotes.quotes)
    }

    init {
        System.setProperty("yahoofinance.histquotes2.enabled", "false")
        addSymbolNameMappings()
        allQuoteSymbolsUrl = java.lang.String.join(",", symbolNameMapping.keys)
    }
}