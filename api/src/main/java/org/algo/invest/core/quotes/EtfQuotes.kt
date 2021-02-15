package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object EtfQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            symbolNameMapping["EUNL.DE"] = QuoteSymbolMetaData("EUNL.DE", "iShares Core MSCI World", "A0RPWH", Industry.NONE)
            symbolNameMapping["L0CK.DE"] = QuoteSymbolMetaData("L0CK.DE", "iShares Digital Security", "A2JMGE", Industry.NONE)
            symbolNameMapping["IQQ6.DE"] = QuoteSymbolMetaData("IQQ6.DE", "iShares Developed Markets Property Yield", "A0LEW8", Industry.NONE)
            symbolNameMapping["2B78.DE"] = QuoteSymbolMetaData("2B78.DE", "iShares Healthcare Innovation", "A2ANH2", Industry.NONE)
            symbolNameMapping["IBB"] = QuoteSymbolMetaData("IBB", "iShares Nasdaq Biotechnology", "A2DWAW", Industry.NONE)
            symbolNameMapping["ICLN"] = QuoteSymbolMetaData("ICLN", "iShares Global Clean Energy", "", Industry.NONE)
            symbolNameMapping["ESPO"] = QuoteSymbolMetaData("ESPO", "VanEck Vectors Video Gaming and eSports", "", Industry.NONE)

            return symbolNameMapping
        }
}