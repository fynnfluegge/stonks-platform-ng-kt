package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object IndustryQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            // Industrial Manufacturing
            symbolNameMapping["RAA.DE"] = QuoteSymbolMetaData("RAA.DE", "Rational", "701080", Industry.INDUSTRIAL_MANUFACTURING)
            symbolNameMapping["JUN3.DE"] = QuoteSymbolMetaData("JUN3.DE", "Jungheinrich", "621993", Industry.INDUSTRIAL_MANUFACTURING)
            symbolNameMapping["CAT"] = QuoteSymbolMetaData("CAT", "Caterpillar", "850598", Industry.INDUSTRIAL_MANUFACTURING)
            symbolNameMapping["SWK"] = QuoteSymbolMetaData("SWK", "Stanley Black & Decker", "A1CTQA", Industry.INDUSTRIAL_MANUFACTURING)
            symbolNameMapping["KBX.DE"] = QuoteSymbolMetaData("KBX.DE", "Knorr Bremse", "KBX100", Industry.INDUSTRIAL_MANUFACTURING)
            symbolNameMapping["HNL.DE"] = QuoteSymbolMetaData("HNL.DE", "Hönle UV Technology", "515710", Industry.INDUSTRIAL_MANUFACTURING)
            symbolNameMapping["TREX"] = QuoteSymbolMetaData("TREX", "Trex", "938716", Industry.INDUSTRIAL_MANUFACTURING)
            symbolNameMapping["PRLB"] = QuoteSymbolMetaData("PRLB", "Protolabs", "A1JUHT", Industry.INDUSTRIAL_MANUFACTURING)

            // Roh-/Baustoffe & Chemie
            symbolNameMapping["RIO"] = QuoteSymbolMetaData("RIO", "Rio Tinto", "852147", Industry.MATERIALS_CHEMICALS)
            symbolNameMapping["BAS.DE"] = QuoteSymbolMetaData("BAS.DE", "BASF", "BASF11", Industry.MATERIALS_CHEMICALS)
            symbolNameMapping["HEI.DE"] = QuoteSymbolMetaData("HEI.DE", "Heidelberg Cement", "604700", Industry.MATERIALS_CHEMICALS)
            symbolNameMapping["STLD"] = QuoteSymbolMetaData("STLD", "Steel Dynamics", "903772", Industry.MATERIALS_CHEMICALS)
            symbolNameMapping["RPL.F"] = QuoteSymbolMetaData("RPL.F", "UPM-Kymmene", "881026", Industry.MATERIALS_CHEMICALS)
            symbolNameMapping["GOLD"] = QuoteSymbolMetaData("GOLD", "Barrick Gold", "870450", Industry.MATERIALS_CHEMICALS)
            symbolNameMapping["G14.F"] = QuoteSymbolMetaData("G14.F", "Signify", "A2AJ7T", Industry.MATERIALS_CHEMICALS)
            symbolNameMapping["AIL.DE"] = QuoteSymbolMetaData("AIL.DE", "Air Liquide", "850133", Industry.MATERIALS_CHEMICALS)
            symbolNameMapping["LIN.DE"] = QuoteSymbolMetaData("LIN.DE", "Linde", "A2DSYC", Industry.MATERIALS_CHEMICALS)
            symbolNameMapping["1COV.DE"] = QuoteSymbolMetaData("1COV.DE", "Covestro", "606214", Industry.MATERIALS_CHEMICALS)
            symbolNameMapping["MZX.DE"] = QuoteSymbolMetaData("MZX.DE", "Masterflex", "549293", Industry.MATERIALS_CHEMICALS)
            symbolNameMapping["TTR1.DE"] = QuoteSymbolMetaData("TTR1.DE", "Technotrans", "A0XYGA", Industry.MATERIALS_CHEMICALS)

            // Recycling
            symbolNameMapping["TMR.F"] = QuoteSymbolMetaData("TMR.F", "Tomra Systems", "872535", Industry.RECYCLING)
            symbolNameMapping["WM"] = QuoteSymbolMetaData("WM", "Waste Management", "893579", Industry.RECYCLING)
            symbolNameMapping["27V.F"] = QuoteSymbolMetaData("27V.F", "Avantium", "A2DM1P", Industry.RECYCLING)
            symbolNameMapping["3C1.F"] = QuoteSymbolMetaData("3C1.F", "Carbios", "A1XA4J", Industry.RECYCLING)

            // Immobilien und Baugewerbe
            symbolNameMapping["Z"] = QuoteSymbolMetaData("Z", "Zillow", "A14XZY", Industry.REALESTATE_CONSTRUCTION)
            symbolNameMapping["LEN"] = QuoteSymbolMetaData("LEN", "Lennar", "851022", Industry.REALESTATE_CONSTRUCTION)
            symbolNameMapping["RDFN"] = QuoteSymbolMetaData("RDFN", "Redfin", "A2DU22", Industry.REALESTATE_CONSTRUCTION)
            symbolNameMapping["WPC"] = QuoteSymbolMetaData("WPC", "W.P. Carey", "A1J5SB", Industry.REALESTATE_CONSTRUCTION)
            symbolNameMapping["VNA.DE"] = QuoteSymbolMetaData("VNA.DE", "Vonovia", "A1ML7", Industry.REALESTATE_CONSTRUCTION)
            symbolNameMapping["DWNI.DE"] = QuoteSymbolMetaData("DWNI.DE", "Deutsche Wohnen", "A0HN5C", Industry.REALESTATE_CONSTRUCTION)
            symbolNameMapping["HHC"] = QuoteSymbolMetaData("HHC", "Howard Hughes", "A1C7ML", Industry.REALESTATE_CONSTRUCTION)

            // Kommunikation
            symbolNameMapping["DTE.DE"] = QuoteSymbolMetaData("DTE.DE", "Telekom", "555750", Industry.COMMUNICATION)
            symbolNameMapping["VZ"] = QuoteSymbolMetaData("VZ", "Verizon", "868402", Industry.COMMUNICATION)
            symbolNameMapping["CSCO"] = QuoteSymbolMetaData("CSCO", "Cisco", "878841", Industry.COMMUNICATION)
            symbolNameMapping["T"] = QuoteSymbolMetaData("T", "AT&T", "A0HL9Z", Industry.COMMUNICATION)
            symbolNameMapping["MPWR"] = QuoteSymbolMetaData("MPWR", "Monolithic Power Systems", "A0DLC4", Industry.COMMUNICATION)
            symbolNameMapping["M0Y.DE"] = QuoteSymbolMetaData("M0Y.DE", "Mynaric", "A0JCY1", Industry.COMMUNICATION)
            symbolNameMapping["AMT"] = QuoteSymbolMetaData("AMT", "American Tower", "A1JRLA", Industry.COMMUNICATION)
            symbolNameMapping["JNPR"] = QuoteSymbolMetaData("JNPR", "Juniper Networks", "923889", Industry.COMMUNICATION)

            return symbolNameMapping
        }
}