package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object MobilityQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            // Raum-/Luftfahrt & Reise
            symbolNameMapping["MTX.F"] = QuoteSymbolMetaData("MTX.F", "MTU", "A0D9PT", Industry.AEROSPACE_TRAVEL)
            symbolNameMapping["FRA.DE"] = QuoteSymbolMetaData("FRA.DE", "Fraport", "577330", Industry.AEROSPACE_TRAVEL)
            symbolNameMapping["AIR.DE"] = QuoteSymbolMetaData("AIR.DE", "Airbus", "938914", Industry.AEROSPACE_TRAVEL)
            symbolNameMapping["BA"] = QuoteSymbolMetaData("BA", "Boeing", "850471", Industry.AEROSPACE_TRAVEL)
            symbolNameMapping["AAL"] = QuoteSymbolMetaData("AAL", "American Airlines", "A1W97M", Industry.AEROSPACE_TRAVEL)
            symbolNameMapping["BKNG"] = QuoteSymbolMetaData("BKNG", "Booking Holdings", "A2JEXP", Industry.AEROSPACE_TRAVEL)
            symbolNameMapping["TUI1.DE"] = QuoteSymbolMetaData("TUI1.DE", "TUI", "TUAG00", Industry.AEROSPACE_TRAVEL)

            // Car Rental
            symbolNameMapping["UBER"] = QuoteSymbolMetaData("UBER", "Uber", "A2PHHG", Industry.CAR_RENTAL)
            symbolNameMapping["LYFT"] = QuoteSymbolMetaData("LYFT", "Lyft", "A2PE38", Industry.CAR_RENTAL)
            symbolNameMapping["SIX3.DE"] = QuoteSymbolMetaData("SIX3.DE", "Sixt", "723132", Industry.CAR_RENTAL)
            symbolNameMapping["1GU.F"] = QuoteSymbolMetaData("1GU.F", "Grubhub", "A1XE9Z", Industry.CAR_RENTAL)

            // Automobil
            symbolNameMapping["TSLA"] = QuoteSymbolMetaData("TSLA", "Tesla", "A1CX3T", Industry.AUTOMOBILE)
            symbolNameMapping["VOW3.DE"] = QuoteSymbolMetaData("VOW3.DE", "VW", "766403", Industry.AUTOMOBILE)
            symbolNameMapping["DAI.DE"] = QuoteSymbolMetaData("DAI.DE", "Daimler", "710000", Industry.AUTOMOBILE)
            symbolNameMapping["BMW3.DE"] = QuoteSymbolMetaData("BMW3.DE", "BMW", "519000", Industry.AUTOMOBILE)
            symbolNameMapping["NIO"] = QuoteSymbolMetaData("NIO", "Nio", "A2N4PB", Industry.AUTOMOBILE)
            symbolNameMapping["NIU"] = QuoteSymbolMetaData("NIU", "Niu", "867147", Industry.AUTOMOBILE)
            symbolNameMapping["TM"] = QuoteSymbolMetaData("TM", "Toyota", "853510", Industry.AUTOMOBILE)
            symbolNameMapping["VOL1.F"] = QuoteSymbolMetaData("VOL1.F", "Volvo", "871229", Industry.AUTOMOBILE)

            return symbolNameMapping
        }
}