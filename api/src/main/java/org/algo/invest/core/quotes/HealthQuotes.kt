package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object HealthQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            // Pharma
            symbolNameMapping["PFE"] = QuoteSymbolMetaData("PFE", "Pfizer", "852009", Industry.HEALTH)
            symbolNameMapping["JNJ"] = QuoteSymbolMetaData("JNJ", "Johnson & Johnson", "853260", Industry.HEALTH)
            symbolNameMapping["AZN"] = QuoteSymbolMetaData("AZN", "AstraZeneca", "886455", Industry.HEALTH)
            symbolNameMapping["GILD"] = QuoteSymbolMetaData("GILD", "Gilead", "885823", Industry.HEALTH)
            symbolNameMapping["BAYN.DE"] = QuoteSymbolMetaData("BAYN.DE", "Bayer", "BAY001", Industry.HEALTH)
            symbolNameMapping["SRT3.DE"] = QuoteSymbolMetaData("SRT3.DE", "Sartorius", "716563", Industry.HEALTH)
            symbolNameMapping["RHO6.F"] = QuoteSymbolMetaData("RHO6.F", "Roche", "851311", Industry.HEALTH)
            symbolNameMapping["ABT"] = QuoteSymbolMetaData("ABT", "Abbott Laboratories", "850103", Industry.HEALTH)
            symbolNameMapping["NOVC.DE"] = QuoteSymbolMetaData("NOVC.DE", "Novo Nordisk", "A1XA8R", Industry.HEALTH)
            symbolNameMapping["NOTA.F"] = QuoteSymbolMetaData("NOTA.F", "Novartis", "904278", Industry.HEALTH)
            symbolNameMapping["MRK.DE"] = QuoteSymbolMetaData("MRK.DE", "Merck", "659990", Industry.HEALTH)
            symbolNameMapping["PA8.DE"] = QuoteSymbolMetaData("PA8.DE", "Paion", "A0B65S", Industry.HEALTH)

            // Medtech
            symbolNameMapping["TMO"] = QuoteSymbolMetaData("TMO", "Thermo Fisher Scientific", "857209", Industry.HEALTH)
            symbolNameMapping["ISRG"] = QuoteSymbolMetaData("ISRG", "Intuitive Surgical", "888024", Industry.HEALTH)
            symbolNameMapping["ILMN"] = QuoteSymbolMetaData("ILMN", "Illumina", "927079", Industry.HEALTH)
            symbolNameMapping["SYK"] = QuoteSymbolMetaData("SYK", "Stryker", "864952", Industry.HEALTH)
            symbolNameMapping["BSX"] = QuoteSymbolMetaData("BSX", "Boston Scientific", "884113", Industry.HEALTH)
            symbolNameMapping["DXCM"] = QuoteSymbolMetaData("DXCM", "Dexcom", "A0D9T1", Industry.HEALTH)
            symbolNameMapping["QDEL"] = QuoteSymbolMetaData("QDEL", "Quidel", "867261", Industry.HEALTH)
            symbolNameMapping["WX8.F"] = QuoteSymbolMetaData("WX8.F", "Wuxi AppTec", "A2PAJG", Industry.HEALTH)
            symbolNameMapping["SHL.DE"] = QuoteSymbolMetaData("SHL.DE", "Siemens Healthineers", "SHL100", Industry.HEALTH)
            symbolNameMapping["PHIA.F"] = QuoteSymbolMetaData("PHIA.F", "Philips", "940602", Industry.HEALTH)
            symbolNameMapping["MDT"] = QuoteSymbolMetaData("MDT", "Medtronic", "A14M2J", Industry.HEALTH)
            symbolNameMapping["DRW3.DE"] = QuoteSymbolMetaData("DRW3.DE", "Drägerwerk", "555063", Industry.HEALTH)
            symbolNameMapping["EUZ.DE"] = QuoteSymbolMetaData("EUZ.DE", "Eckert & Ziegler", "565970", Industry.HEALTH)
            symbolNameMapping["ZBH"] = QuoteSymbolMetaData("ZBH", "Zimmer Biomet", "753718", Industry.HEALTH)
            symbolNameMapping["EW"] = QuoteSymbolMetaData("EW", "Edwards Lifesciences", "936853", Industry.HEALTH)
            symbolNameMapping["49Z.F"] = QuoteSymbolMetaData("49Z.F", "Cellink", "A2PX00", Industry.HEALTH)

            // Medsoftware
            symbolNameMapping["TDOC"] = QuoteSymbolMetaData("TDOC", "Teladoc Health", "A14VPK", Industry.HEALTH)
            symbolNameMapping["VEEV"] = QuoteSymbolMetaData("VEEV", "Veeva System", "A1W5SA", Industry.HEALTH)

            // Biotechnology
            symbolNameMapping["AMGN"] = QuoteSymbolMetaData("AMGN", "Amgen", "867900", Industry.HEALTH)
            symbolNameMapping["NVTA"] = QuoteSymbolMetaData("NVTA", "Invitae", "A14NKG", Industry.HEALTH)
            symbolNameMapping["ABBV"] = QuoteSymbolMetaData("ABBV", "AbbVie", "A1J84E", Industry.HEALTH)
            symbolNameMapping["BIO"] = QuoteSymbolMetaData("BIO", "Bio-Rad Laboratories", "865406", Industry.HEALTH)
            symbolNameMapping["ASMB"] = QuoteSymbolMetaData("ASMB", "Assembly Biosciences", "A117S1", Industry.HEALTH)
            symbolNameMapping["CRSP"] = QuoteSymbolMetaData("CRSP", "CRISPR Therapeutics", "A2AT0Z", Industry.HEALTH)
            symbolNameMapping["22UA.F"] = QuoteSymbolMetaData("22UA.F", "Biontech", "A2PSR2", Industry.HEALTH)
            symbolNameMapping["MRNA"] = QuoteSymbolMetaData("MRNA", "Moderna", "A2N9D9", Industry.HEALTH)
            symbolNameMapping["CVAC"] = QuoteSymbolMetaData("CVAC", "Curevac", "A2P71U", Industry.HEALTH)
            symbolNameMapping["EDIT"] = QuoteSymbolMetaData("EDIT", "Editas", "A2AC4K", Industry.HEALTH)
            symbolNameMapping["CGEN"] = QuoteSymbolMetaData("CGEN", "Compugen", "553001", Industry.HEALTH)

            return symbolNameMapping
        }
}