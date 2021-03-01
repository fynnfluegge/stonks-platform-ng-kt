package org.algo.invest.core.quotes

import org.algo.invest.model.Category
import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object EnergyQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            symbolNameMapping["RWE.DE"] = QuoteSymbolMetaData("RWE.DE", "RWE", "703712", Industry.ENERGY, Category.CONVENTIONAL)
            symbolNameMapping["ED"] = QuoteSymbolMetaData("ED", "Consolidated Edison", "911563", Industry.ENERGY, Category.CONVENTIONAL)
            symbolNameMapping["BLDP"] = QuoteSymbolMetaData("BLDP", "Ballard Power Systems", "A0RENB", Industry.ENERGY, Category.CONVENTIONAL)
            symbolNameMapping["D7G.F"] = QuoteSymbolMetaData("D7G.F", "Nel Asa", "A0B733", Industry.ENERGY, Category.CONVENTIONAL)
            symbolNameMapping["27W.F"] = QuoteSymbolMetaData("27W.F", "Powercell", "A14TK6", Industry.ENERGY, Category.CONVENTIONAL)
            symbolNameMapping["PLUG"] = QuoteSymbolMetaData("PLUG", "Plug Power", "A1JA81", Industry.ENERGY, Category.CONVENTIONAL)

            symbolNameMapping["NEE"] = QuoteSymbolMetaData("NEE", "Nextera Energy", "A1CZ4H", Industry.ENERGY, Category.RENEWABLE)
            symbolNameMapping["D2G.F"] = QuoteSymbolMetaData("D2G.F", "Ørsted", "A0NBLH", Industry.ENERGY, Category.RENEWABLE)
            symbolNameMapping["VWS.DE"] = QuoteSymbolMetaData("VWS.DE", "Vestas Wind Systems", "A0MRJJ", Industry.ENERGY, Category.RENEWABLE)
            symbolNameMapping["SEDG"] = QuoteSymbolMetaData("SEDG", "Solaredge", "A14QVM", Industry.ENERGY, Category.RENEWABLE)
            symbolNameMapping["ECV.DE"] = QuoteSymbolMetaData("ECV.DE", "Encavis", "609500", Industry.ENERGY, Category.RENEWABLE)
            symbolNameMapping["ENPH"] = QuoteSymbolMetaData("ENPH", "Enphase Energy", "A1JC82", Industry.ENERGY, Category.RENEWABLE)
            symbolNameMapping["CXGH.F"] = QuoteSymbolMetaData("CXGH.F", "Goldwind", "A1C0QD", Industry.ENERGY, Category.RENEWABLE)

            symbolNameMapping["VAR1.DE"] = QuoteSymbolMetaData("VAR1.DE", "Varta", "A0TGJ5", Industry.ENERGY, Category.AKKU)
            symbolNameMapping["BY6.F"] = QuoteSymbolMetaData("BY6.F", "BYD", "A0M4W9", Industry.ENERGY, Category.AKKU)

            return symbolNameMapping
        }
}