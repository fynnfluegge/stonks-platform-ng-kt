package org.algo.invest.core.quotes

import org.algo.invest.model.SubIndustry
import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object IndustryQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            symbolNameMapping["RAA.DE"] = QuoteSymbolMetaData("RAA.DE", "Rational", "701080", Industry.INDUSTRIAL, SubIndustry.MANUFACTURING)
            symbolNameMapping["JUN3.DE"] = QuoteSymbolMetaData("JUN3.DE", "Jungheinrich", "621993", Industry.INDUSTRIAL, SubIndustry.MANUFACTURING)
            symbolNameMapping["CAT"] = QuoteSymbolMetaData("CAT", "Caterpillar", "850598", Industry.INDUSTRIAL, SubIndustry.MANUFACTURING)
            symbolNameMapping["SWK"] = QuoteSymbolMetaData("SWK", "Stanley Black & Decker", "A1CTQA", Industry.INDUSTRIAL, SubIndustry.MANUFACTURING)
            symbolNameMapping["HNL.DE"] = QuoteSymbolMetaData("HNL.DE", "Hönle UV Technology", "515710", Industry.INDUSTRIAL, SubIndustry.MANUFACTURING)
            symbolNameMapping["TREX"] = QuoteSymbolMetaData("TREX", "Trex", "938716", Industry.INDUSTRIAL, SubIndustry.MANUFACTURING)
            symbolNameMapping["G14.F"] = QuoteSymbolMetaData("G14.F", "Signify", "A2AJ7T", Industry.INDUSTRIAL, SubIndustry.MANUFACTURING)
            symbolNameMapping["PRLB"] = QuoteSymbolMetaData("PRLB", "Protolabs", "A1JUHT", Industry.INDUSTRIAL, SubIndustry.MANUFACTURING)
            symbolNameMapping["DDD"] = QuoteSymbolMetaData("DDD", "3D Systems", "888346", Industry.INDUSTRIAL, SubIndustry.MANUFACTURING)

            symbolNameMapping["RIO"] = QuoteSymbolMetaData("RIO", "Rio Tinto", "852147", Industry.INDUSTRIAL, SubIndustry.MATERIALS)
            symbolNameMapping["HEI.DE"] = QuoteSymbolMetaData("HEI.DE", "Heidelberg Cement", "604700", Industry.INDUSTRIAL, SubIndustry.MATERIALS)
            symbolNameMapping["STLD"] = QuoteSymbolMetaData("STLD", "Steel Dynamics", "903772", Industry.INDUSTRIAL, SubIndustry.MATERIALS)
            symbolNameMapping["RPL.F"] = QuoteSymbolMetaData("RPL.F", "UPM-Kymmene", "881026", Industry.INDUSTRIAL, SubIndustry.MATERIALS)
            symbolNameMapping["GOLD"] = QuoteSymbolMetaData("GOLD", "Barrick Gold", "870450", Industry.INDUSTRIAL, SubIndustry.MATERIALS)
            symbolNameMapping["BAS.DE"] = QuoteSymbolMetaData("BAS.DE", "BASF", "BASF11", Industry.INDUSTRIAL, SubIndustry.CHEMICALS)
            symbolNameMapping["AIL.DE"] = QuoteSymbolMetaData("AIL.DE", "Air Liquide", "850133", Industry.INDUSTRIAL, SubIndustry.CHEMICALS)
            symbolNameMapping["LIN.DE"] = QuoteSymbolMetaData("LIN.DE", "Linde", "A2DSYC", Industry.INDUSTRIAL, SubIndustry.CHEMICALS)
            symbolNameMapping["1COV.DE"] = QuoteSymbolMetaData("1COV.DE", "Covestro", "606214", Industry.INDUSTRIAL, SubIndustry.CHEMICALS)

            symbolNameMapping["TMR.F"] = QuoteSymbolMetaData("TMR.F", "Tomra Systems", "872535", Industry.INDUSTRIAL, SubIndustry.RECYCLING)
            symbolNameMapping["WM"] = QuoteSymbolMetaData("WM", "Waste Management", "893579", Industry.INDUSTRIAL, SubIndustry.RECYCLING)
            symbolNameMapping["27V.F"] = QuoteSymbolMetaData("27V.F", "Avantium", "A2DM1P", Industry.INDUSTRIAL, SubIndustry.RECYCLING)
            symbolNameMapping["3C1.F"] = QuoteSymbolMetaData("3C1.F", "Carbios", "A1XA4J", Industry.INDUSTRIAL, SubIndustry.RECYCLING)

            symbolNameMapping["Z"] = QuoteSymbolMetaData("Z", "Zillow", "A14XZY", Industry.INDUSTRIAL, SubIndustry.REALESTATE)
            symbolNameMapping["LEN"] = QuoteSymbolMetaData("LEN", "Lennar", "851022", Industry.INDUSTRIAL, SubIndustry.REALESTATE)
            symbolNameMapping["RDFN"] = QuoteSymbolMetaData("RDFN", "Redfin", "A2DU22", Industry.INDUSTRIAL, SubIndustry.REALESTATE)
            symbolNameMapping["WPC"] = QuoteSymbolMetaData("WPC", "W.P. Carey", "A1J5SB", Industry.INDUSTRIAL, SubIndustry.REALESTATE)
            symbolNameMapping["VNA.DE"] = QuoteSymbolMetaData("VNA.DE", "Vonovia", "A1ML7", Industry.INDUSTRIAL, SubIndustry.REALESTATE)
            symbolNameMapping["DWNI.DE"] = QuoteSymbolMetaData("DWNI.DE", "Deutsche Wohnen", "A0HN5C", Industry.INDUSTRIAL, SubIndustry.REALESTATE)
            symbolNameMapping["HHC"] = QuoteSymbolMetaData("HHC", "Howard Hughes", "A1C7ML", Industry.INDUSTRIAL, SubIndustry.REALESTATE)

            symbolNameMapping["DTE.DE"] = QuoteSymbolMetaData("DTE.DE", "Telekom", "555750", Industry.INDUSTRIAL, SubIndustry.TELECOMMUNICATION)
            symbolNameMapping["VZ"] = QuoteSymbolMetaData("VZ", "Verizon", "868402", Industry.INDUSTRIAL, SubIndustry.TELECOMMUNICATION)
            symbolNameMapping["CSCO"] = QuoteSymbolMetaData("CSCO", "Cisco", "878841", Industry.INDUSTRIAL, SubIndustry.TELECOMMUNICATION)
            symbolNameMapping["T"] = QuoteSymbolMetaData("T", "AT&T", "A0HL9Z", Industry.INDUSTRIAL, SubIndustry.TELECOMMUNICATION)
            symbolNameMapping["MPWR"] = QuoteSymbolMetaData("MPWR", "Monolithic Power Systems", "A0DLC4", Industry.INDUSTRIAL, SubIndustry.TELECOMMUNICATION)
            symbolNameMapping["M0Y.DE"] = QuoteSymbolMetaData("M0Y.DE", "Mynaric", "A0JCY1", Industry.INDUSTRIAL, SubIndustry.TELECOMMUNICATION)
            symbolNameMapping["AMT"] = QuoteSymbolMetaData("AMT", "American Tower", "A1JRLA", Industry.INDUSTRIAL, SubIndustry.TELECOMMUNICATION)
            symbolNameMapping["JNPR"] = QuoteSymbolMetaData("JNPR", "Juniper Networks", "923889", Industry.INDUSTRIAL, SubIndustry.TELECOMMUNICATION)

            return symbolNameMapping
        }
}