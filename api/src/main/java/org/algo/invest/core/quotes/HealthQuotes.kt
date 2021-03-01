package org.algo.invest.core.quotes

import org.algo.invest.model.SubIndustry
import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object HealthQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            symbolNameMapping["JNJ"] = QuoteSymbolMetaData("JNJ", "Johnson & Johnson", "853260", Industry.HEALTH, SubIndustry.PHARMA)
            symbolNameMapping["NOTA.F"] = QuoteSymbolMetaData("NOTA.F", "Novartis", "904278", Industry.HEALTH, SubIndustry.PHARMA)
            symbolNameMapping["RHO6.F"] = QuoteSymbolMetaData("RHO6.F", "Roche", "851311", Industry.HEALTH, SubIndustry.PHARMA)
            symbolNameMapping["PFE"] = QuoteSymbolMetaData("PFE", "Pfizer", "852009", Industry.HEALTH, SubIndustry.PHARMA)
            symbolNameMapping["AZN"] = QuoteSymbolMetaData("AZN", "AstraZeneca", "886455", Industry.HEALTH, SubIndustry.PHARMA)
            symbolNameMapping["GILD"] = QuoteSymbolMetaData("GILD", "Gilead", "885823", Industry.HEALTH, SubIndustry.PHARMA)
            symbolNameMapping["BAYN.DE"] = QuoteSymbolMetaData("BAYN.DE", "Bayer", "BAY001", Industry.HEALTH, SubIndustry.PHARMA)
            symbolNameMapping["ABT"] = QuoteSymbolMetaData("ABT", "Abbott Laboratories", "850103", Industry.HEALTH, SubIndustry.PHARMA)
            symbolNameMapping["NOVC.DE"] = QuoteSymbolMetaData("NOVC.DE", "Novo Nordisk", "A1XA8R", Industry.HEALTH, SubIndustry.PHARMA)
            symbolNameMapping["MRK.DE"] = QuoteSymbolMetaData("MRK.DE", "Merck", "659990", Industry.HEALTH, SubIndustry.PHARMA)
            symbolNameMapping["PA8.DE"] = QuoteSymbolMetaData("PA8.DE", "Paion", "A0B65S", Industry.HEALTH, SubIndustry.PHARMA)
            symbolNameMapping["ATRS"] = QuoteSymbolMetaData("ATRS", "Antares Pharma", "903128", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["OPK"] = QuoteSymbolMetaData("OPK", "Opko Health", "A0MUUJ", Industry.HEALTH, SubIndustry.MEDTECH)

            symbolNameMapping["TMO"] = QuoteSymbolMetaData("TMO", "Thermo Fisher Scientific", "857209", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["DHR"] = QuoteSymbolMetaData("DHR", "Danaher", "866197", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["ISRG"] = QuoteSymbolMetaData("ISRG", "Intuitive Surgical", "888024", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["ILMN"] = QuoteSymbolMetaData("ILMN", "Illumina", "927079", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["DXCM"] = QuoteSymbolMetaData("DXCM", "Dexcom", "A0D9T1", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["QDEL"] = QuoteSymbolMetaData("QDEL", "Quidel", "867261", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["SYK"] = QuoteSymbolMetaData("SYK", "Stryker", "864952", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["BSX"] = QuoteSymbolMetaData("BSX", "Boston Scientific", "884113", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["2359.HK"] = QuoteSymbolMetaData("SRT3.DE", "Sartorius", "716563", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["WX8.F"] = QuoteSymbolMetaData("2359.HK", "Wuxi AppTec", "A2PAJG", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["SHL.DE"] = QuoteSymbolMetaData("SHL.DE", "Siemens Healthineers", "SHL100", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["PHIA.F"] = QuoteSymbolMetaData("PHIA.F", "Philips", "940602", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["MDT"] = QuoteSymbolMetaData("MDT", "Medtronic", "A14M2J", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["DRW3.DE"] = QuoteSymbolMetaData("DRW3.DE", "Drägerwerk", "555063", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["EUZ.DE"] = QuoteSymbolMetaData("EUZ.DE", "Eckert & Ziegler", "565970", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["ZBH"] = QuoteSymbolMetaData("ZBH", "Zimmer Biomet", "753718", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["EW"] = QuoteSymbolMetaData("EW", "Edwards Lifesciences", "936853", Industry.HEALTH, SubIndustry.MEDTECH)
            symbolNameMapping["49Z.F"] = QuoteSymbolMetaData("49Z.F", "Cellink", "A2PX00", Industry.HEALTH, SubIndustry.MEDTECH)

            symbolNameMapping["TDOC"] = QuoteSymbolMetaData("TDOC", "Teladoc Health", "A14VPK", Industry.HEALTH, SubIndustry.SOFTWARE)
            symbolNameMapping["1833.HK"] = QuoteSymbolMetaData("1833.HK", "Ping An Health Tech", "A2JKHM", Industry.HEALTH, SubIndustry.SOFTWARE)

            symbolNameMapping["AMGN"] = QuoteSymbolMetaData("AMGN", "Amgen", "867900", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["300676.SZ"] = QuoteSymbolMetaData("300676.SZ", "BGI Genomics", "", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["ABBV"] = QuoteSymbolMetaData("ABBV", "AbbVie", "A1J84E", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["NVTA"] = QuoteSymbolMetaData("NVTA", "Invitae", "A14NKG", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["BIO"] = QuoteSymbolMetaData("BIO", "Bio-Rad Laboratories", "865406", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["ASMB"] = QuoteSymbolMetaData("ASMB", "Assembly Biosciences", "A117S1", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["CRSP"] = QuoteSymbolMetaData("CRSP", "CRISPR Therapeutics", "A2AT0Z", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["22UA.F"] = QuoteSymbolMetaData("22UA.F", "Biontech", "A2PSR2", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["MRNA"] = QuoteSymbolMetaData("MRNA", "Moderna", "A2N9D9", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["CVAC"] = QuoteSymbolMetaData("CVAC", "Curevac", "A2P71U", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["EDIT"] = QuoteSymbolMetaData("EDIT", "Editas", "A2AC4K", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["CGEN"] = QuoteSymbolMetaData("CGEN", "Compugen", "553001", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["2269.HK"] = QuoteSymbolMetaData("2269.HK", "Wuxi Biologics", "A2QJCN", Industry.HEALTH, SubIndustry.BIOTECH)
            symbolNameMapping["DNLI"] = QuoteSymbolMetaData("DNLI", "Denali", "A2H9G8", Industry.HEALTH, SubIndustry.BIOTECH)

            return symbolNameMapping
        }
}