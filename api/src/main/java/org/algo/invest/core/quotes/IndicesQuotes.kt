package org.algo.invest.core.quotes

import org.algo.invest.model.Category
import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object IndicesQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            symbolNameMapping["EURUSD=X"] = QuoteSymbolMetaData("EURUSD=X", "EUR/USD", "", Industry.INDICES)
            symbolNameMapping["USDCNY=X"] = QuoteSymbolMetaData("USDCNY=X", "USD/CNY", "", Industry.INDICES)
            symbolNameMapping["^TNX"] = QuoteSymbolMetaData("^TNX", "Treasury 10y", "", Industry.INDICES)
            symbolNameMapping["BTC-USD"] = QuoteSymbolMetaData("BTC-USD", "BTC/USD", "", Industry.INDICES)
            symbolNameMapping["GC=F"] = QuoteSymbolMetaData("GC=F", "GOLD/USD", "", Industry.INDICES)
            symbolNameMapping["CL=F"] = QuoteSymbolMetaData("CL=F", "Crude Oil/USD", "", Industry.INDICES)
            symbolNameMapping["^VIX"] = QuoteSymbolMetaData("^VIX", "Volatility Index", "", Industry.INDICES)
            symbolNameMapping["^GDAXI"] = QuoteSymbolMetaData("^GDAXI", "DAX", "", Industry.INDICES)
            symbolNameMapping["^MDAXI"] = QuoteSymbolMetaData("^MDAXI", "MDAX", "", Industry.INDICES)
            symbolNameMapping["^SDAXI"] = QuoteSymbolMetaData("^SDAXI", "SDAX", "", Industry.INDICES)
            symbolNameMapping["^TECDAX"] = QuoteSymbolMetaData("^TECDAX", "TecDAX", "", Industry.INDICES)
            symbolNameMapping["^DJI"] = QuoteSymbolMetaData("^DJI", "Dow Jones", "", Industry.INDICES)
            symbolNameMapping["^IXIC"] = QuoteSymbolMetaData("^IXIC", "Nasdaq Comp", "", Industry.INDICES)
            symbolNameMapping["^NDX"] = QuoteSymbolMetaData("^NDX", "Nasdaq 100", "", Industry.INDICES)
            symbolNameMapping["^NDXT"] = QuoteSymbolMetaData("^NDXT", "Nasdaq 100 Tech", "", Industry.INDICES)
            symbolNameMapping["^GSPC"] = QuoteSymbolMetaData("^GSCP", "S&P 500", "", Industry.INDICES)
            symbolNameMapping["NQ=F"] = QuoteSymbolMetaData("NQ=F", "Nasdaq 100 Future", "", Industry.INDICES)
            symbolNameMapping["YM=F"] = QuoteSymbolMetaData("YM=F", "Dow Jones Future", "", Industry.INDICES)
            symbolNameMapping["ES=F"] = QuoteSymbolMetaData("ES=F", "S&P 500 Future", "", Industry.INDICES)
            symbolNameMapping["^N225"] = QuoteSymbolMetaData("^N225", "Nikkei", "", Industry.INDICES)
            symbolNameMapping["000001.SS"] = QuoteSymbolMetaData("000001.SS", "Shanghai Comp", "", Industry.INDICES)
            symbolNameMapping["^HSI"] = QuoteSymbolMetaData("^HSI", "Hang Seng HK", "", Industry.INDICES)
            symbolNameMapping["^HSCE"] = QuoteSymbolMetaData("^HSCE", "Hang Seng China", "", Industry.INDICES)

            symbolNameMapping["EUNL.DE"] = QuoteSymbolMetaData("EUNL.DE", "iShares Core MSCI World", "A0RPWH", Industry.INDICES, Category.ETF)
            symbolNameMapping["L0CK.DE"] = QuoteSymbolMetaData("L0CK.DE", "iShares Digital Security", "A2JMGE", Industry.INDICES, Category.ETF)
            symbolNameMapping["IQQ6.DE"] = QuoteSymbolMetaData("IQQ6.DE", "iShares Developed Markets Property Yield", "A0LEW8", Industry.INDICES, Category.ETF)
            symbolNameMapping["2B78.DE"] = QuoteSymbolMetaData("2B78.DE", "iShares Healthcare Innovation", "A2ANH2", Industry.INDICES, Category.ETF)
            symbolNameMapping["IBB"] = QuoteSymbolMetaData("IBB", "iShares Nasdaq Biotechnology", "A2DWAW", Industry.INDICES, Category.ETF)
            symbolNameMapping["ICLN"] = QuoteSymbolMetaData("ICLN", "iShares Global Clean Energy", "", Industry.INDICES, Category.ETF)
            symbolNameMapping["ESPO"] = QuoteSymbolMetaData("ESPO", "VanEck Vectors Video Gaming and eSports", "", Industry.INDICES, Category.ETF)

            return symbolNameMapping
        }
}