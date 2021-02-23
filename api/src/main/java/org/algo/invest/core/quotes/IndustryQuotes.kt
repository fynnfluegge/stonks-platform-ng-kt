package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object IndustryQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            // Industrial Manufacturing
            symbolNameMapping["RAA.DE"] = QuoteSymbolMetaData("RAA.DE", "Rational", "701080", Industry.INDUSTRIAL)
            symbolNameMapping["JUN3.DE"] = QuoteSymbolMetaData("JUN3.DE", "Jungheinrich", "621993", Industry.INDUSTRIAL)
            symbolNameMapping["CAT"] = QuoteSymbolMetaData("CAT", "Caterpillar", "850598", Industry.INDUSTRIAL)
            symbolNameMapping["SWK"] = QuoteSymbolMetaData("SWK", "Stanley Black & Decker", "A1CTQA", Industry.INDUSTRIAL)
            symbolNameMapping["KBX.DE"] = QuoteSymbolMetaData("KBX.DE", "Knorr Bremse", "KBX100", Industry.INDUSTRIAL)
            symbolNameMapping["HNL.DE"] = QuoteSymbolMetaData("HNL.DE", "Hönle UV Technology", "515710", Industry.INDUSTRIAL)
            symbolNameMapping["TREX"] = QuoteSymbolMetaData("TREX", "Trex", "938716", Industry.INDUSTRIAL)
            symbolNameMapping["PRLB"] = QuoteSymbolMetaData("PRLB", "Protolabs", "A1JUHT", Industry.INDUSTRIAL)

            // Roh-/Baustoffe & Chemie
            symbolNameMapping["RIO"] = QuoteSymbolMetaData("RIO", "Rio Tinto", "852147", Industry.INDUSTRIAL)
            symbolNameMapping["BAS.DE"] = QuoteSymbolMetaData("BAS.DE", "BASF", "BASF11", Industry.INDUSTRIAL)
            symbolNameMapping["HEI.DE"] = QuoteSymbolMetaData("HEI.DE", "Heidelberg Cement", "604700", Industry.INDUSTRIAL)
            symbolNameMapping["STLD"] = QuoteSymbolMetaData("STLD", "Steel Dynamics", "903772", Industry.INDUSTRIAL)
            symbolNameMapping["RPL.F"] = QuoteSymbolMetaData("RPL.F", "UPM-Kymmene", "881026", Industry.INDUSTRIAL)
            symbolNameMapping["GOLD"] = QuoteSymbolMetaData("GOLD", "Barrick Gold", "870450", Industry.INDUSTRIAL)
            symbolNameMapping["G14.F"] = QuoteSymbolMetaData("G14.F", "Signify", "A2AJ7T", Industry.INDUSTRIAL)
            symbolNameMapping["AIL.DE"] = QuoteSymbolMetaData("AIL.DE", "Air Liquide", "850133", Industry.INDUSTRIAL)
            symbolNameMapping["LIN.DE"] = QuoteSymbolMetaData("LIN.DE", "Linde", "A2DSYC", Industry.INDUSTRIAL)
            symbolNameMapping["1COV.DE"] = QuoteSymbolMetaData("1COV.DE", "Covestro", "606214", Industry.INDUSTRIAL)
            symbolNameMapping["MZX.DE"] = QuoteSymbolMetaData("MZX.DE", "Masterflex", "549293", Industry.INDUSTRIAL)
            symbolNameMapping["TTR1.DE"] = QuoteSymbolMetaData("TTR1.DE", "Technotrans", "A0XYGA", Industry.INDUSTRIAL)

            // Recycling
            symbolNameMapping["TMR.F"] = QuoteSymbolMetaData("TMR.F", "Tomra Systems", "872535", Industry.INDUSTRIAL)
            symbolNameMapping["WM"] = QuoteSymbolMetaData("WM", "Waste Management", "893579", Industry.INDUSTRIAL)
            symbolNameMapping["27V.F"] = QuoteSymbolMetaData("27V.F", "Avantium", "A2DM1P", Industry.INDUSTRIAL)
            symbolNameMapping["3C1.F"] = QuoteSymbolMetaData("3C1.F", "Carbios", "A1XA4J", Industry.INDUSTRIAL)

            // Immobilien und Baugewerbe
            symbolNameMapping["Z"] = QuoteSymbolMetaData("Z", "Zillow", "A14XZY", Industry.INDUSTRIAL)
            symbolNameMapping["LEN"] = QuoteSymbolMetaData("LEN", "Lennar", "851022", Industry.INDUSTRIAL)
            symbolNameMapping["RDFN"] = QuoteSymbolMetaData("RDFN", "Redfin", "A2DU22", Industry.INDUSTRIAL)
            symbolNameMapping["WPC"] = QuoteSymbolMetaData("WPC", "W.P. Carey", "A1J5SB", Industry.INDUSTRIAL)
            symbolNameMapping["VNA.DE"] = QuoteSymbolMetaData("VNA.DE", "Vonovia", "A1ML7", Industry.INDUSTRIAL)
            symbolNameMapping["DWNI.DE"] = QuoteSymbolMetaData("DWNI.DE", "Deutsche Wohnen", "A0HN5C", Industry.INDUSTRIAL)
            symbolNameMapping["HHC"] = QuoteSymbolMetaData("HHC", "Howard Hughes", "A1C7ML", Industry.INDUSTRIAL)

            // Kommunikation
            symbolNameMapping["DTE.DE"] = QuoteSymbolMetaData("DTE.DE", "Telekom", "555750", Industry.INDUSTRIAL)
            symbolNameMapping["VZ"] = QuoteSymbolMetaData("VZ", "Verizon", "868402", Industry.INDUSTRIAL)
            symbolNameMapping["CSCO"] = QuoteSymbolMetaData("CSCO", "Cisco", "878841", Industry.INDUSTRIAL)
            symbolNameMapping["T"] = QuoteSymbolMetaData("T", "AT&T", "A0HL9Z", Industry.INDUSTRIAL)
            symbolNameMapping["MPWR"] = QuoteSymbolMetaData("MPWR", "Monolithic Power Systems", "A0DLC4", Industry.INDUSTRIAL)
            symbolNameMapping["M0Y.DE"] = QuoteSymbolMetaData("M0Y.DE", "Mynaric", "A0JCY1", Industry.INDUSTRIAL)
            symbolNameMapping["AMT"] = QuoteSymbolMetaData("AMT", "American Tower", "A1JRLA", Industry.INDUSTRIAL)
            symbolNameMapping["JNPR"] = QuoteSymbolMetaData("JNPR", "Juniper Networks", "923889", Industry.INDUSTRIAL)

            return symbolNameMapping
        }
}