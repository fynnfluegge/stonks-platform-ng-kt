package org.stonkmonitor.config.quotes

import org.stonkmonitor.model.SubIndustry
import org.stonkmonitor.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.stonkmonitor.model.Industry

val energyQuotes: Map<String, QuoteSymbolMetaData>
    get() {
        val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

        symbolNameMapping["RWE.DE"] = QuoteSymbolMetaData("RWE.DE", "RWE", "703712", Industry.ENERGY, SubIndustry.CONVENTIONAL)
        symbolNameMapping["ENR.DE"] = QuoteSymbolMetaData("ENR.DE", "Siemens Energy", "ENER6Y", Industry.ENERGY, SubIndustry.CONVENTIONAL)
        symbolNameMapping["ED"] = QuoteSymbolMetaData("ED", "Consolidated Edison", "911563", Industry.ENERGY, SubIndustry.CONVENTIONAL)

        symbolNameMapping["NEE"] = QuoteSymbolMetaData("NEE", "Nextera Energy", "A1CZ4H", Industry.ENERGY, SubIndustry.RENEWABLE)
        symbolNameMapping["D2G.F"] = QuoteSymbolMetaData("D2G.F", "Ørsted", "A0NBLH", Industry.ENERGY, SubIndustry.RENEWABLE)
        symbolNameMapping["VWS.DE"] = QuoteSymbolMetaData("VWS.DE", "Vestas Wind Systems", "A0MRJJ", Industry.ENERGY, SubIndustry.RENEWABLE)
        symbolNameMapping["SEDG"] = QuoteSymbolMetaData("SEDG", "Solaredge", "A14QVM", Industry.ENERGY, SubIndustry.RENEWABLE)
        symbolNameMapping["GTQ1.DE"] = QuoteSymbolMetaData("GTQ1.DE", "Siemens Gamesa", "A0B5Z8", Industry.ENERGY, SubIndustry.RENEWABLE)
        symbolNameMapping["BYW6.DE"] = QuoteSymbolMetaData("BYW6.DE", "BayWa", "519406", Industry.RETAIL, SubIndustry.RENEWABLE)
        symbolNameMapping["ECV.DE"] = QuoteSymbolMetaData("ECV.DE", "Encavis", "609500", Industry.ENERGY, SubIndustry.RENEWABLE)
        symbolNameMapping["ENPH"] = QuoteSymbolMetaData("ENPH", "Enphase Energy", "A1JC82", Industry.ENERGY, SubIndustry.RENEWABLE)
        symbolNameMapping["2208.HK"] = QuoteSymbolMetaData("2208.HK", "Goldwind", "A1C0QD", Industry.ENERGY, SubIndustry.RENEWABLE)
        symbolNameMapping["BLDP"] = QuoteSymbolMetaData("BLDP", "Ballard Power Systems", "A0RENB", Industry.ENERGY, SubIndustry.RENEWABLE)
        symbolNameMapping["D7G.F"] = QuoteSymbolMetaData("D7G.F", "Nel Asa", "A0B733", Industry.ENERGY, SubIndustry.RENEWABLE)
        symbolNameMapping["27W.F"] = QuoteSymbolMetaData("27W.F", "Powercell", "A14TK6", Industry.ENERGY, SubIndustry.RENEWABLE)
        symbolNameMapping["PLUG"] = QuoteSymbolMetaData("PLUG", "Plug Power", "A1JA81", Industry.ENERGY, SubIndustry.RENEWABLE)

        return symbolNameMapping
    }