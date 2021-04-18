package org.stonkmonitor.config

import org.stonkmonitor.model.Industry
import org.stonkmonitor.model.QuoteSymbolMetaData
import org.stonkmonitor.model.SubIndustry

val watchlistQuotes: Map<String, QuoteSymbolMetaData> =
    linkedMapOf(
        "GOOG" to QuoteSymbolMetaData("GOOG", "Google", "A14Y6F", Industry.TECH, SubIndustry.FANG),
        "FB" to QuoteSymbolMetaData("FB", "Facebook", "A1JWVX", Industry.TECH, SubIndustry.FANG),
        "AMZN" to QuoteSymbolMetaData("AMZN", "Amazon", "906866", Industry.TECH, SubIndustry.FANG),
        "MSFT" to QuoteSymbolMetaData("MSFT", "Microsoft", "870747", Industry.TECH, SubIndustry.FANG),
        "NFLX" to QuoteSymbolMetaData("NFLX", "Netflix", "552484", Industry.TECH, SubIndustry.FANG),
        "BABA" to QuoteSymbolMetaData("BABA", "Alibaba", "A117ME", Industry.TECH, SubIndustry.FANG),
        "TCEHY" to QuoteSymbolMetaData("TCEHY", "Tencent", "A1138D", Industry.TECH, SubIndustry.FANG),
        "NVDA" to QuoteSymbolMetaData("NVDA", "Nvidia", "918422", Industry.TECH, SubIndustry.SEMICONDUCTOR),
        "TSFA.F" to QuoteSymbolMetaData("TSFA.F", "TSMC", "909800", Industry.TECH, SubIndustry.SEMICONDUCTOR),
        "AMD" to QuoteSymbolMetaData("AMD", "AMD", "863186", Industry.TECH, SubIndustry.SEMICONDUCTOR),
        "CRM" to QuoteSymbolMetaData("CRM", "Salesforce", "A0B87V", Industry.TECH, SubIndustry.SAAS),
        "NOW" to QuoteSymbolMetaData("NOW", "ServiceNow", "A1JX4P", Industry.TECH, SubIndustry.SAAS),
        "SPLK" to QuoteSymbolMetaData("SPLK", "Splunk", "A1JV4H", Industry.TECH, SubIndustry.SAAS),
        "VEEV" to QuoteSymbolMetaData("VEEV", "Veeva System", "A1W5SA", Industry.HEALTH, SubIndustry.SAAS),
        "SAP.DE" to QuoteSymbolMetaData("SAP.DE", "SAP", "716460", Industry.TECH, SubIndustry.SOFTWARE),
        "AOF.DE" to QuoteSymbolMetaData("AOF.DE", "Atoss", "510440", Industry.TECH, SubIndustry.SOFTWARE),
        "1810.HK" to QuoteSymbolMetaData("1810.HK", "Xiaomi", "A2JNY1", Industry.TECH, SubIndustry.MANUFACTURING),
        "HMI" to QuoteSymbolMetaData("HMI", "Huami", "A2JC7A", Industry.TECH, SubIndustry.MANUFACTURING),
        "DIS" to QuoteSymbolMetaData("DIS", "Walt Disney", "855686", Industry.MEDIA, SubIndustry.TELEVISION),
        "7CD.F" to QuoteSymbolMetaData("7CD.F", "CD Project Red", "534356", Industry.MEDIA, SubIndustry.GAMES),
        "PYPL" to QuoteSymbolMetaData("PYPL", "PayPal", "A14R7U", Industry.FINANCE, SubIndustry.PAYMENT),
        "SQ" to QuoteSymbolMetaData("SQ", "Square", "A143D6", Industry.FINANCE, SubIndustry.PAYMENT),
        "HFG.DE" to QuoteSymbolMetaData("HFG.DE", "Hello Fresh", "A16140", Industry.FOOD, SubIndustry.DELIVERY),
        "TMO" to QuoteSymbolMetaData("TMO", "Thermo Fisher Scientific", "857209", Industry.HEALTH, SubIndustry.MEDTECH),
        "ISRG" to QuoteSymbolMetaData("ISRG", "Intuitive Surgical", "888024", Industry.HEALTH, SubIndustry.MEDTECH),
        "ILMN" to QuoteSymbolMetaData("ILMN", "Illumina", "927079", Industry.HEALTH, SubIndustry.MEDTECH),
        "DXCM" to QuoteSymbolMetaData("DXCM", "Dexcom", "A0D9T1", Industry.HEALTH, SubIndustry.MEDTECH),
        "QDEL" to QuoteSymbolMetaData("QDEL", "Quidel", "867261", Industry.HEALTH, SubIndustry.MEDTECH),
        "2359.HK" to QuoteSymbolMetaData("2359.HK", "Wuxi AppTec", "A2PAJG", Industry.HEALTH, SubIndustry.MEDTECH),
        "TDOC" to QuoteSymbolMetaData("TDOC", "Teladoc Health", "A14VPK", Industry.HEALTH, SubIndustry.SOFTWARE),
        "1833.HK" to QuoteSymbolMetaData("1833.HK", "Ping An Health Tech", "A2JKHM", Industry.HEALTH, SubIndustry.SOFTWARE),
        "AMGN" to QuoteSymbolMetaData("AMGN", "Amgen", "867900", Industry.HEALTH, SubIndustry.BIOTECH),
        "ABBV" to QuoteSymbolMetaData("ABBV", "AbbVie", "A1J84E", Industry.HEALTH, SubIndustry.BIOTECH),
        "NVTA" to QuoteSymbolMetaData("NVTA", "Invitae", "A14NKG", Industry.HEALTH, SubIndustry.BIOTECH),
        "EDIT" to QuoteSymbolMetaData("EDIT", "Editas", "A2AC4K", Industry.HEALTH, SubIndustry.BIOTECH),
        "DNLI" to QuoteSymbolMetaData("DNLI", "Denali", "A2H9G8", Industry.HEALTH, SubIndustry.BIOTECH),
        "ATRS" to QuoteSymbolMetaData("ATRS", "Antares Pharma", "903128", Industry.HEALTH, SubIndustry.MEDTECH),
        "SE" to QuoteSymbolMetaData("SE", "Sea", "A2H5LX", Industry.RETAIL, SubIndustry.ECOMMERCE),
        "ZAL.DE" to QuoteSymbolMetaData("ZAL.DE", "Zalando", "ZAL111", Industry.RETAIL, SubIndustry.ECOMMERCE),
        "UA" to QuoteSymbolMetaData("UA", "Under Armour", "A0HL4V", Industry.RETAIL, SubIndustry.APPAREL),
        "NEE" to QuoteSymbolMetaData("NEE", "Nextera Energy", "A1CZ4H", Industry.ENERGY, SubIndustry.RENEWABLE),
        "VAR1.DE" to QuoteSymbolMetaData("VAR1.DE", "Varta", "A0TGJ5", Industry.ENERGY, SubIndustry.AKKU)
    )