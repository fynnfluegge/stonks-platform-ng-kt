package org.algo.invest.core.quotes

import org.algo.invest.model.SubIndustry
import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

val mobilityQuotes: Map<String, QuoteSymbolMetaData>
    get() {
        val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

        symbolNameMapping["MTX.F"] = QuoteSymbolMetaData("MTX.F", "MTU", "A0D9PT", Industry.MOBILITY, SubIndustry.AEROSPACE)
        symbolNameMapping["FRA.DE"] = QuoteSymbolMetaData("FRA.DE", "Fraport", "577330", Industry.MOBILITY, SubIndustry.AEROSPACE)
        symbolNameMapping["AIR.DE"] = QuoteSymbolMetaData("AIR.DE", "Airbus", "938914", Industry.MOBILITY, SubIndustry.AEROSPACE)
        symbolNameMapping["BA"] = QuoteSymbolMetaData("BA", "Boeing", "850471", Industry.MOBILITY, SubIndustry.AEROSPACE)
        symbolNameMapping["AAL"] = QuoteSymbolMetaData("AAL", "American Airlines", "A1W97M", Industry.MOBILITY, SubIndustry.AEROSPACE)
        symbolNameMapping["EH"] = QuoteSymbolMetaData("EH", "Ehang", "A2PWWB", Industry.MOBILITY, SubIndustry.AEROSPACE)

        symbolNameMapping["BKNG"] = QuoteSymbolMetaData("BKNG", "Booking Holdings", "A2JEXP", Industry.MOBILITY, SubIndustry.TRAVEL)
        symbolNameMapping["TUI1.DE"] = QuoteSymbolMetaData("TUI1.DE", "TUI", "TUAG00", Industry.MOBILITY, SubIndustry.TRAVEL)

        symbolNameMapping["UBER"] = QuoteSymbolMetaData("UBER", "Uber", "A2PHHG", Industry.MOBILITY, SubIndustry.SERVICES)
        symbolNameMapping["LYFT"] = QuoteSymbolMetaData("LYFT", "Lyft", "A2PE38", Industry.MOBILITY, SubIndustry.SERVICES)
        symbolNameMapping["SIX3.DE"] = QuoteSymbolMetaData("SIX3.DE", "Sixt", "723132", Industry.MOBILITY, SubIndustry.SERVICES)
        symbolNameMapping["1GU.F"] = QuoteSymbolMetaData("1GU.F", "Grubhub", "A1XE9Z", Industry.MOBILITY, SubIndustry.SERVICES)

        symbolNameMapping["TSLA"] = QuoteSymbolMetaData("TSLA", "Tesla", "A1CX3T", Industry.MOBILITY, SubIndustry.AUTOMOBILE)
        symbolNameMapping["VOW3.DE"] = QuoteSymbolMetaData("VOW3.DE", "VW", "766403", Industry.MOBILITY, SubIndustry.AUTOMOBILE)
        symbolNameMapping["DAI.DE"] = QuoteSymbolMetaData("DAI.DE", "Daimler", "710000", Industry.MOBILITY, SubIndustry.AUTOMOBILE)
        symbolNameMapping["BMW3.DE"] = QuoteSymbolMetaData("BMW3.DE", "BMW", "519000", Industry.MOBILITY, SubIndustry.AUTOMOBILE)
        symbolNameMapping["NIO"] = QuoteSymbolMetaData("NIO", "Nio", "A2N4PB", Industry.MOBILITY, SubIndustry.AUTOMOBILE)
        symbolNameMapping["NIU"] = QuoteSymbolMetaData("NIU", "Niu", "867147", Industry.MOBILITY, SubIndustry.AUTOMOBILE)
        symbolNameMapping["TM"] = QuoteSymbolMetaData("TM", "Toyota", "853510", Industry.MOBILITY, SubIndustry.AUTOMOBILE)
        symbolNameMapping["VOL1.F"] = QuoteSymbolMetaData("VOL1.F", "Volvo", "871229", Industry.MOBILITY, SubIndustry.AUTOMOBILE)
        symbolNameMapping["GELYF"] = QuoteSymbolMetaData("GELYF", "Geely", "A0CACX", Industry.MOBILITY, SubIndustry.AUTOMOBILE)

        return symbolNameMapping
    }