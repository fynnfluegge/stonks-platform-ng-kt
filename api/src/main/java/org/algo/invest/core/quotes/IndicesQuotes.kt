package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object IndicesQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            symbolNameMapping["EURUSD=X"] = QuoteSymbolMetaData("EURUSD=X", "EUR/USD", "", Industry.NONE)
            symbolNameMapping["USDCNY=X"] = QuoteSymbolMetaData("USDCNY=X", "USD/CNY", "", Industry.NONE)
            symbolNameMapping["BTC-USD"] = QuoteSymbolMetaData("BTC-USD", "BTC/USD", "", Industry.NONE)
            symbolNameMapping["GC=F"] = QuoteSymbolMetaData("GC=F", "GOLD/USD", "", Industry.NONE)
            symbolNameMapping["CL=F"] = QuoteSymbolMetaData("CL=F", "Crude Oil/USD", "", Industry.NONE)
            symbolNameMapping["^VIX"] = QuoteSymbolMetaData("^VIX", "Volatility Index", "", Industry.NONE)
            symbolNameMapping["^GDAXI"] = QuoteSymbolMetaData("^GDAXI", "DAX", "", Industry.NONE)
            symbolNameMapping["^MDAXI"] = QuoteSymbolMetaData("^MDAXI", "MDAX", "", Industry.NONE)
            symbolNameMapping["^SDAXI"] = QuoteSymbolMetaData("^SDAXI", "SDAX", "", Industry.NONE)
            symbolNameMapping["^TECDAX"] = QuoteSymbolMetaData("^TECDAX", "TecDAX", "", Industry.NONE)
            symbolNameMapping["^DJI"] = QuoteSymbolMetaData("^DJI", "Dow Jones", "", Industry.NONE)
            symbolNameMapping["^IXIC"] = QuoteSymbolMetaData("^IXIC", "Nasdaq Comp", "", Industry.NONE)
            symbolNameMapping["^NDX"] = QuoteSymbolMetaData("^NDX", "Nasdaq 100", "", Industry.NONE)
            symbolNameMapping["^NDXT"] = QuoteSymbolMetaData("^NDXT", "Nasdaq 100 Tech", "", Industry.NONE)
            symbolNameMapping["^GSPC"] = QuoteSymbolMetaData("^GSCP", "S&P 500", "", Industry.NONE)
            symbolNameMapping["NQ=F"] = QuoteSymbolMetaData("NQ=F", "Nasdaq 100 Future", "", Industry.NONE)
            symbolNameMapping["YM=F"] = QuoteSymbolMetaData("YM=F", "Dow Jones Future", "", Industry.NONE)
            symbolNameMapping["ES=F"] = QuoteSymbolMetaData("ES=F", "S&P 500 Future", "", Industry.NONE)
            symbolNameMapping["^N225"] = QuoteSymbolMetaData("^N225", "Nikkei", "", Industry.NONE)
            symbolNameMapping["000001.SS"] = QuoteSymbolMetaData("000001.SS", "Shanghai Comp", "", Industry.NONE)
            symbolNameMapping["^HSI"] = QuoteSymbolMetaData("^HSI", "Hang Seng HK", "", Industry.NONE)
            symbolNameMapping["^HSCE"] = QuoteSymbolMetaData("^HSCE", "Hang Seng China", "", Industry.NONE)

            return symbolNameMapping
        }
}