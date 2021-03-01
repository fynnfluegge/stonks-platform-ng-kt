package org.algo.invest.core.quotes

import org.algo.invest.model.Category
import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object MobilityQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            symbolNameMapping["MTX.F"] = QuoteSymbolMetaData("MTX.F", "MTU", "A0D9PT", Industry.MOBILITY, Category.AEROSPACE)
            symbolNameMapping["FRA.DE"] = QuoteSymbolMetaData("FRA.DE", "Fraport", "577330", Industry.MOBILITY, Category.AEROSPACE)
            symbolNameMapping["AIR.DE"] = QuoteSymbolMetaData("AIR.DE", "Airbus", "938914", Industry.MOBILITY, Category.AEROSPACE)
            symbolNameMapping["BA"] = QuoteSymbolMetaData("BA", "Boeing", "850471", Industry.MOBILITY, Category.AEROSPACE)
            symbolNameMapping["AAL"] = QuoteSymbolMetaData("AAL", "American Airlines", "A1W97M", Industry.MOBILITY, Category.AEROSPACE)
            symbolNameMapping["EH"] = QuoteSymbolMetaData("EH", "Ehang", "A2PWWB", Industry.MOBILITY, Category.AEROSPACE)

            symbolNameMapping["BKNG"] = QuoteSymbolMetaData("BKNG", "Booking Holdings", "A2JEXP", Industry.MOBILITY, Category.TRAVEL)
            symbolNameMapping["TUI1.DE"] = QuoteSymbolMetaData("TUI1.DE", "TUI", "TUAG00", Industry.MOBILITY, Category.TRAVEL)

            symbolNameMapping["UBER"] = QuoteSymbolMetaData("UBER", "Uber", "A2PHHG", Industry.MOBILITY, Category.SERVICES)
            symbolNameMapping["LYFT"] = QuoteSymbolMetaData("LYFT", "Lyft", "A2PE38", Industry.MOBILITY, Category.SERVICES)
            symbolNameMapping["SIX3.DE"] = QuoteSymbolMetaData("SIX3.DE", "Sixt", "723132", Industry.MOBILITY, Category.SERVICES)
            symbolNameMapping["1GU.F"] = QuoteSymbolMetaData("1GU.F", "Grubhub", "A1XE9Z", Industry.MOBILITY, Category.SERVICES)

            symbolNameMapping["TSLA"] = QuoteSymbolMetaData("TSLA", "Tesla", "A1CX3T", Industry.MOBILITY, Category.AUTOMOBILE)
            symbolNameMapping["VOW3.DE"] = QuoteSymbolMetaData("VOW3.DE", "VW", "766403", Industry.MOBILITY, Category.AUTOMOBILE)
            symbolNameMapping["DAI.DE"] = QuoteSymbolMetaData("DAI.DE", "Daimler", "710000", Industry.MOBILITY, Category.AUTOMOBILE)
            symbolNameMapping["BMW3.DE"] = QuoteSymbolMetaData("BMW3.DE", "BMW", "519000", Industry.MOBILITY, Category.AUTOMOBILE)
            symbolNameMapping["NIO"] = QuoteSymbolMetaData("NIO", "Nio", "A2N4PB", Industry.MOBILITY, Category.AUTOMOBILE)
            symbolNameMapping["NIU"] = QuoteSymbolMetaData("NIU", "Niu", "867147", Industry.MOBILITY, Category.AUTOMOBILE)
            symbolNameMapping["TM"] = QuoteSymbolMetaData("TM", "Toyota", "853510", Industry.MOBILITY, Category.AUTOMOBILE)
            symbolNameMapping["VOL1.F"] = QuoteSymbolMetaData("VOL1.F", "Volvo", "871229", Industry.MOBILITY, Category.AUTOMOBILE)
            symbolNameMapping["GELYF"] = QuoteSymbolMetaData("GELYF", "Geely", "A0CACX", Industry.MOBILITY, Category.AUTOMOBILE)

            return symbolNameMapping
        }
}