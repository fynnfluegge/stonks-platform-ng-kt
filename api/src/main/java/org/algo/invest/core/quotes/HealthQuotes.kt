package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object HealthQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            // Pharma
            symbolNameMapping["PFE"] = QuoteSymbolMetaData("PFE", "Pfizer", "852009", Industry.PHARMA)
            symbolNameMapping["JNJ"] = QuoteSymbolMetaData("JNJ", "Johnson & Johnson", "853260", Industry.PHARMA)
            symbolNameMapping["AZN"] = QuoteSymbolMetaData("AZN", "AstraZeneca", "886455", Industry.PHARMA)
            symbolNameMapping["GILD"] = QuoteSymbolMetaData("GILD", "Gilead", "885823", Industry.PHARMA)
            symbolNameMapping["BAYN.DE"] = QuoteSymbolMetaData("BAYN.DE", "Bayer", "BAY001", Industry.PHARMA)
            symbolNameMapping["SRT3.DE"] = QuoteSymbolMetaData("SRT3.DE", "Sartorius", "716563", Industry.PHARMA)
            symbolNameMapping["RHO6.F"] = QuoteSymbolMetaData("RHO6.F", "Roche", "851311", Industry.PHARMA)
            symbolNameMapping["ABT"] = QuoteSymbolMetaData("ABT", "Abbott Laboratories", "850103", Industry.PHARMA)
            symbolNameMapping["NOVC.DE"] = QuoteSymbolMetaData("NOVC.DE", "Novo Nordisk", "A1XA8R", Industry.PHARMA)
            symbolNameMapping["NOTA.F"] = QuoteSymbolMetaData("NOTA.F", "Novartis", "904278", Industry.PHARMA)
            symbolNameMapping["MRK.DE"] = QuoteSymbolMetaData("MRK.DE", "Merck", "659990", Industry.PHARMA)
            symbolNameMapping["PA8.DE"] = QuoteSymbolMetaData("PA8.DE", "Paion", "A0B65S", Industry.PHARMA)

            // Medtech
            symbolNameMapping["TMO"] = QuoteSymbolMetaData("TMO", "Thermo Fisher Scientific", "857209", Industry.MEDTECH)
            symbolNameMapping["ISRG"] = QuoteSymbolMetaData("ISRG", "Intuitive Surgical", "888024", Industry.MEDTECH)
            symbolNameMapping["ILMN"] = QuoteSymbolMetaData("ILMN", "Illumina", "927079", Industry.MEDTECH)
            symbolNameMapping["SYK"] = QuoteSymbolMetaData("SYK", "Stryker", "864952", Industry.MEDTECH)
            symbolNameMapping["BSX"] = QuoteSymbolMetaData("BSX", "Boston Scientific", "884113", Industry.MEDTECH)
            symbolNameMapping["DXCM"] = QuoteSymbolMetaData("DXCM", "Dexcom", "A0D9T1", Industry.MEDTECH)
            symbolNameMapping["QDEL"] = QuoteSymbolMetaData("QDEL", "Quidel", "867261", Industry.PHARMA)
            symbolNameMapping["WX8.F"] = QuoteSymbolMetaData("WX8.F", "Wuxi AppTec", "A2PAJG", Industry.MEDTECH)
            symbolNameMapping["SHL.DE"] = QuoteSymbolMetaData("SHL.DE", "Siemens Healthineers", "SHL100", Industry.MEDTECH)
            symbolNameMapping["PHIA.F"] = QuoteSymbolMetaData("PHIA.F", "Philips", "940602", Industry.MEDTECH)
            symbolNameMapping["MDT"] = QuoteSymbolMetaData("MDT", "Medtronic", "A14M2J", Industry.MEDTECH)
            symbolNameMapping["DRW3.DE"] = QuoteSymbolMetaData("DRW3.DE", "Drägerwerk", "555063", Industry.MEDTECH)
            symbolNameMapping["EUZ.DE"] = QuoteSymbolMetaData("EUZ.DE", "Eckert & Ziegler", "565970", Industry.MEDTECH)
            symbolNameMapping["ZBH"] = QuoteSymbolMetaData("ZBH", "Zimmer Biomet", "753718", Industry.MEDTECH)
            symbolNameMapping["EW"] = QuoteSymbolMetaData("EW", "Edwards Lifesciences", "936853", Industry.MEDTECH)
            symbolNameMapping["49Z.F"] = QuoteSymbolMetaData("49Z.F", "Cellink", "A2PX00", Industry.MEDTECH)

            // Medsoftware
            symbolNameMapping["TDOC"] = QuoteSymbolMetaData("TDOC", "Teladoc Health", "A14VPK", Industry.MEDSOFTWARE)
            symbolNameMapping["VEEV"] = QuoteSymbolMetaData("VEEV", "Veeva System", "A1W5SA", Industry.MEDSOFTWARE)

            // Biotechnology
            symbolNameMapping["AMGN"] = QuoteSymbolMetaData("AMGN", "Amgen", "867900", Industry.BIOTECH)
            symbolNameMapping["NVTA"] = QuoteSymbolMetaData("NVTA", "Invitae", "A14NKG", Industry.BIOTECH)
            symbolNameMapping["ABBV"] = QuoteSymbolMetaData("ABBV", "AbbVie", "A1J84E", Industry.BIOTECH)
            symbolNameMapping["BIO"] = QuoteSymbolMetaData("BIO", "Bio-Rad Laboratories", "865406", Industry.BIOTECH)
            symbolNameMapping["ASMB"] = QuoteSymbolMetaData("ASMB", "Assembly Biosciences", "A117S1", Industry.BIOTECH)
            symbolNameMapping["CRSP"] = QuoteSymbolMetaData("CRSP", "CRISPR Therapeutics", "A2AT0Z", Industry.BIOTECH)
            symbolNameMapping["22UA.F"] = QuoteSymbolMetaData("22UA.F", "Biontech", "A2PSR2", Industry.BIOTECH)
            symbolNameMapping["MRNA"] = QuoteSymbolMetaData("MRNA", "Moderna", "A2N9D9", Industry.BIOTECH)
            symbolNameMapping["CVAC"] = QuoteSymbolMetaData("CVAC", "Curevac", "A2P71U", Industry.BIOTECH)
            symbolNameMapping["EDIT"] = QuoteSymbolMetaData("EDIT", "Editas", "A2AC4K", Industry.BIOTECH)
            symbolNameMapping["CGEN"] = QuoteSymbolMetaData("CGEN", "Compugen", "553001", Industry.BIOTECH)

            return symbolNameMapping
        }
}