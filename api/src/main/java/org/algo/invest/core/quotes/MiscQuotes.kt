package org.algo.invest.core.quotes

import org.algo.invest.model.Category
import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object MiscQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            symbolNameMapping["DOYU"] = QuoteSymbolMetaData("DOYU", "DouYou", "", Industry.OTHER, Category.CHINA)
            symbolNameMapping["HUYA"] = QuoteSymbolMetaData("HUYA", "HuYa", "", Industry.OTHER, Category.CHINA)
            symbolNameMapping["MPNGF"] = QuoteSymbolMetaData("MPNGF", "Meituan-Dianping", "", Industry.OTHER, Category.CHINA)
            symbolNameMapping["FNI.F"] = QuoteSymbolMetaData("FNI.F", "Fosun", "", Industry.OTHER, Category.CHINA)
            symbolNameMapping["PDD"] = QuoteSymbolMetaData("PDD", "Pinduoduo", "", Industry.OTHER, Category.CHINA)
            symbolNameMapping["BZUN"] = QuoteSymbolMetaData("BZUN", "Baozun", "", Industry.OTHER, Category.CHINA)

            return symbolNameMapping
        }
}