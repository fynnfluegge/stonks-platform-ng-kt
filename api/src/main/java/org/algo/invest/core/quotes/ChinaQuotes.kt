package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object ChinaQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()
            symbolNameMapping["DOYU"] = QuoteSymbolMetaData("DOYU", "DouYou", "", Industry.CHINA)
            symbolNameMapping["HUYA"] = QuoteSymbolMetaData("HUYA", "HuYa", "", Industry.CHINA)
            symbolNameMapping["MPNGF"] = QuoteSymbolMetaData("MPNGF", "Meituan-Dianping", "", Industry.CHINA)
            symbolNameMapping["FNI.F"] = QuoteSymbolMetaData("FNI.F", "Fosun", "", Industry.CHINA)
            symbolNameMapping["JD"] = QuoteSymbolMetaData("JD", "JD.com", "", Industry.CHINA)
            symbolNameMapping["PDD"] = QuoteSymbolMetaData("PDD", "Pinduoduo", "", Industry.CHINA)
            symbolNameMapping["HMI"] = QuoteSymbolMetaData("HMI", "Huami", "", Industry.CHINA)
            symbolNameMapping["BZUN"] = QuoteSymbolMetaData("BZUN", "Baozun", "", Industry.CHINA)

            return symbolNameMapping
        }
}