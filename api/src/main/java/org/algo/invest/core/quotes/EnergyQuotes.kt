package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object EnergyQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            // Energie
            symbolNameMapping["RWE.DE"] = QuoteSymbolMetaData("RWE.DE", "RWE", "703712", Industry.ENERGY)
            symbolNameMapping["ED"] = QuoteSymbolMetaData("ED", "Consolidated Edison", "911563", Industry.ENERGY)
            symbolNameMapping["BLDP"] = QuoteSymbolMetaData("BLDP", "Ballard Power Systems", "A0RENB", Industry.ENERGY)
            symbolNameMapping["D7G.F"] = QuoteSymbolMetaData("D7G.F", "Nel Asa", "A0B733", Industry.ENERGY)
            symbolNameMapping["27W.F"] = QuoteSymbolMetaData("27W.F", "Powercell", "A14TK6", Industry.ENERGY)
            symbolNameMapping["PLUG"] = QuoteSymbolMetaData("PLUG", "Plug Power", "A1JA81", Industry.ENERGY)

            // Erneuerbare Energien
            symbolNameMapping["NEE"] = QuoteSymbolMetaData("NEE", "Nextera Energy", "A1CZ4H", Industry.ENERGY)
            symbolNameMapping["D2G.F"] = QuoteSymbolMetaData("D2G.F", "Ørsted", "A0NBLH", Industry.ENERGY)
            symbolNameMapping["VWS.DE"] = QuoteSymbolMetaData("VWS.DE", "Vestas Wind Systems", "A0MRJJ", Industry.ENERGY)
            symbolNameMapping["SEDG"] = QuoteSymbolMetaData("SEDG", "Solaredge", "A14QVM", Industry.ENERGY)
            symbolNameMapping["ECV.DE"] = QuoteSymbolMetaData("ECV.DE", "Encavis", "609500", Industry.ENERGY)
            symbolNameMapping["ENPH"] = QuoteSymbolMetaData("ENPH", "Enphase Energy", "A1JC82", Industry.ENERGY)
            symbolNameMapping["CXGH.F"] = QuoteSymbolMetaData("CXGH.F", "Goldwind", "A1C0QD", Industry.ENERGY)

            //AKKU
            symbolNameMapping["VAR1.DE"] = QuoteSymbolMetaData("VAR1.DE", "Varta", "A0TGJ5", Industry.ENERGY)
            symbolNameMapping["BY6.F"] = QuoteSymbolMetaData("BY6.F", "BYD", "A0M4W9", Industry.ENERGY)

            return symbolNameMapping
        }
}