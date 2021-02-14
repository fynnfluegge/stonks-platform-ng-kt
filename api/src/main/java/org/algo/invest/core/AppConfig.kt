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
        symbolNameMapping.putAll(IndicesQuotes.getQuotes())
        symbolNameMapping.putAll(EtfQuotes.getQuotes())
        symbolNameMapping.putAll(TechQuotes.getQuotes())
        symbolNameMapping.putAll(HealthQuotes.getQuotes())
        symbolNameMapping.putAll(FoodQuotes.getQuotes())
        symbolNameMapping.putAll(RetailQuotes.getQuotes())
        symbolNameMapping.putAll(FinanceQuotes.getQuotes())
        symbolNameMapping.putAll(IndustryQuotes.getQuotes())
        symbolNameMapping.putAll(MobilityQuotes.getQuotes())
        symbolNameMapping.putAll(EnergyQuotes.getQuotes())
        symbolNameMapping.putAll(MediaQuotes.getQuotes())
        symbolNameMapping.putAll(ChinaQuotes.getQuotes())
    }

    init {
        System.setProperty("yahoofinance.histquotes2.enabled", "false")
        addSymbolNameMappings()
        allQuoteSymbolsUrl = java.lang.String.join(",", symbolNameMapping.keys)
    }
}