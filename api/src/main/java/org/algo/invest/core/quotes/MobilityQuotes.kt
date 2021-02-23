package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object MobilityQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            // Raum-/Luftfahrt & Reise
            symbolNameMapping["MTX.F"] = QuoteSymbolMetaData("MTX.F", "MTU", "A0D9PT", Industry.MOBILITY)
            symbolNameMapping["FRA.DE"] = QuoteSymbolMetaData("FRA.DE", "Fraport", "577330", Industry.MOBILITY)
            symbolNameMapping["AIR.DE"] = QuoteSymbolMetaData("AIR.DE", "Airbus", "938914", Industry.MOBILITY)
            symbolNameMapping["BA"] = QuoteSymbolMetaData("BA", "Boeing", "850471", Industry.MOBILITY)
            symbolNameMapping["AAL"] = QuoteSymbolMetaData("AAL", "American Airlines", "A1W97M", Industry.MOBILITY)
            symbolNameMapping["BKNG"] = QuoteSymbolMetaData("BKNG", "Booking Holdings", "A2JEXP", Industry.MOBILITY)
            symbolNameMapping["TUI1.DE"] = QuoteSymbolMetaData("TUI1.DE", "TUI", "TUAG00", Industry.MOBILITY)

            // Car Rental
            symbolNameMapping["UBER"] = QuoteSymbolMetaData("UBER", "Uber", "A2PHHG", Industry.MOBILITY)
            symbolNameMapping["LYFT"] = QuoteSymbolMetaData("LYFT", "Lyft", "A2PE38", Industry.MOBILITY)
            symbolNameMapping["SIX3.DE"] = QuoteSymbolMetaData("SIX3.DE", "Sixt", "723132", Industry.MOBILITY)
            symbolNameMapping["1GU.F"] = QuoteSymbolMetaData("1GU.F", "Grubhub", "A1XE9Z", Industry.MOBILITY)

            // Automobil
            symbolNameMapping["TSLA"] = QuoteSymbolMetaData("TSLA", "Tesla", "A1CX3T", Industry.MOBILITY)
            symbolNameMapping["VOW3.DE"] = QuoteSymbolMetaData("VOW3.DE", "VW", "766403", Industry.MOBILITY)
            symbolNameMapping["DAI.DE"] = QuoteSymbolMetaData("DAI.DE", "Daimler", "710000", Industry.MOBILITY)
            symbolNameMapping["BMW3.DE"] = QuoteSymbolMetaData("BMW3.DE", "BMW", "519000", Industry.MOBILITY)
            symbolNameMapping["NIO"] = QuoteSymbolMetaData("NIO", "Nio", "A2N4PB", Industry.MOBILITY)
            symbolNameMapping["NIU"] = QuoteSymbolMetaData("NIU", "Niu", "867147", Industry.MOBILITY)
            symbolNameMapping["TM"] = QuoteSymbolMetaData("TM", "Toyota", "853510", Industry.MOBILITY)
            symbolNameMapping["VOL1.F"] = QuoteSymbolMetaData("VOL1.F", "Volvo", "871229", Industry.MOBILITY)

            return symbolNameMapping
        }
}