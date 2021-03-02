package org.algo.invest.core.quotes

import org.algo.invest.model.SubIndustry
import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

val miscQuotes: Map<String, QuoteSymbolMetaData>
    get() {
        val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

        symbolNameMapping["DOYU"] = QuoteSymbolMetaData("DOYU", "DouYou", "", Industry.OTHER, SubIndustry.CHINA)
        symbolNameMapping["HUYA"] = QuoteSymbolMetaData("HUYA", "HuYa", "", Industry.OTHER, SubIndustry.CHINA)
        symbolNameMapping["MPNGF"] = QuoteSymbolMetaData("MPNGF", "Meituan-Dianping", "", Industry.OTHER, SubIndustry.CHINA)
        symbolNameMapping["FNI.F"] = QuoteSymbolMetaData("FNI.F", "Fosun", "", Industry.OTHER, SubIndustry.CHINA)
        symbolNameMapping["PDD"] = QuoteSymbolMetaData("PDD", "Pinduoduo", "", Industry.OTHER, SubIndustry.CHINA)
        symbolNameMapping["BZUN"] = QuoteSymbolMetaData("BZUN", "Baozun", "", Industry.OTHER, SubIndustry.CHINA)

        return symbolNameMapping
    }