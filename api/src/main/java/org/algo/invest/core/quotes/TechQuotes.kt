package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object TechQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()
            symbolNameMapping["GOOG"] = QuoteSymbolMetaData("GOOG", "Google", "A14Y6F", Industry.FANG)
            symbolNameMapping["AAPL"] = QuoteSymbolMetaData("AAPL", "Apple", "865985", Industry.FANG)
            symbolNameMapping["FB"] = QuoteSymbolMetaData("FB", "Facebook", "A1JWVX", Industry.FANG)
            symbolNameMapping["AMZN"] = QuoteSymbolMetaData("AMZN", "Amazon", "906866", Industry.FANG)
            symbolNameMapping["MSFT"] = QuoteSymbolMetaData("MSFT", "Microsoft", "870747", Industry.FANG)
            symbolNameMapping["NFLX"] = QuoteSymbolMetaData("NFLX", "Netflix", "552484", Industry.MEDIA)
            symbolNameMapping["BABA"] = QuoteSymbolMetaData("BABA", "Alibaba", "A117ME", Industry.FANG)
            symbolNameMapping["TCEHY"] = QuoteSymbolMetaData("TCEHY", "Tencent", "A1138D", Industry.FANG)
            symbolNameMapping["BIDU"] = QuoteSymbolMetaData("BIDU", "Baidu", "A0F5DE", Industry.FANG)

            // Tech Manufacturing
            symbolNameMapping["SNE"] = QuoteSymbolMetaData("SNE", "SONY", "853688", Industry.TECH_MANUFACTURING)
            symbolNameMapping["3CP.F"] = QuoteSymbolMetaData("3CP.F", "Xiaomi", "A2JNY1", Industry.TECH_MANUFACTURING)
            symbolNameMapping["LGLG.F"] = QuoteSymbolMetaData("LGLG.F", "LG Electronics", "576798", Industry.TECH_MANUFACTURING)
            symbolNameMapping["SSUN.F"] = QuoteSymbolMetaData("SSUN.F", "Samsung", "881823", Industry.TECH_MANUFACTURING)
            symbolNameMapping["DELL"] = QuoteSymbolMetaData("DELL", "Dell", "A2N6WP", Industry.TECH_MANUFACTURING)
            symbolNameMapping["LHL.F"] = QuoteSymbolMetaData("LHL.F", "Lenovo", "894983", Industry.TECH_MANUFACTURING)
            symbolNameMapping["SIE.DE"] = QuoteSymbolMetaData("SIE.DE", "Siemens", "723610", Industry.TECH_MANUFACTURING)
            symbolNameMapping["PCRFY"] = QuoteSymbolMetaData("PCRFY", "Panasonic", "853666", Industry.TECH_MANUFACTURING)
            symbolNameMapping["IRBT"] = QuoteSymbolMetaData("IRBT", "iRobot", "A0F5CC", Industry.TECH_MANUFACTURING)
            symbolNameMapping["GRMN"] = QuoteSymbolMetaData("GRMN", "Garmin", "A1C06B", Industry.TECH_MANUFACTURING)
            symbolNameMapping["BSL.DE"] = QuoteSymbolMetaData("BSL.DE", "Basler", "510200", Industry.TECH_MANUFACTURING)

            // Semiconductor & FPGA
            symbolNameMapping["NVDA"] = QuoteSymbolMetaData("NVDA", "Nvidia", "918422", Industry.SEMICONDUCTOR)
            symbolNameMapping["TSFA.F"] = QuoteSymbolMetaData("TSFA.F", "TSMC", "909800", Industry.SEMICONDUCTOR)
            symbolNameMapping["AMD"] = QuoteSymbolMetaData("AMD", "AMD", "863186", Industry.SEMICONDUCTOR)
            symbolNameMapping["INTC"] = QuoteSymbolMetaData("INTC", "Intel", "855681", Industry.SEMICONDUCTOR)
            symbolNameMapping["QCOM"] = QuoteSymbolMetaData("QCOM", "Qualcomm", "883121", Industry.SEMICONDUCTOR)
            symbolNameMapping["XLNX"] = QuoteSymbolMetaData("XLNX", "Xilinx", "880135", Industry.SEMICONDUCTOR)
            symbolNameMapping["MPWR"] = QuoteSymbolMetaData("MPWR", "Monolithic Power Systems", "A0DLC4", Industry.SEMICONDUCTOR)
            symbolNameMapping["IFX.DE"] = QuoteSymbolMetaData("IFX.DE", "Infineon", "623100", Industry.SEMICONDUCTOR)
            symbolNameMapping["VNX.DE"] = QuoteSymbolMetaData("VNX.DE", "NXP", "A1C5WJ", Industry.SEMICONDUCTOR)
            symbolNameMapping["DLG.DE"] = QuoteSymbolMetaData("DLG.DE", "Dialog", "927200", Industry.SEMICONDUCTOR)
            symbolNameMapping["MU"] = QuoteSymbolMetaData("MU", "Micron", "869020", Industry.SEMICONDUCTOR)
            symbolNameMapping["AVGO"] = QuoteSymbolMetaData("AVGO", "Broadcom", "A2JG9Z", Industry.SEMICONDUCTOR)
            symbolNameMapping["QRVO"] = QuoteSymbolMetaData("QRVO", "Qorvo", "A12CY9", Industry.SEMICONDUCTOR)
            symbolNameMapping["ASME.DE"] = QuoteSymbolMetaData("ASME.DE", "ASML", "A1J4U4", Industry.SEMICONDUCTOR)

            // Cloud/SaaS
            symbolNameMapping["CRM"] = QuoteSymbolMetaData("CRM", "Salesforce", "A0B87V", Industry.CLOUD)
            symbolNameMapping["SPLK"] = QuoteSymbolMetaData("SPLK", "Splunk", "A1JV4H", Industry.CLOUD)
            symbolNameMapping["NOW"] = QuoteSymbolMetaData("NOW", "ServiceNow", "A1JX4P", Industry.CLOUD)
            symbolNameMapping["SNOW"] = QuoteSymbolMetaData("SNOW", "Snowflake", "A2QB38", Industry.CLOUD)
            symbolNameMapping["DOCU"] = QuoteSymbolMetaData("DOCU", "DocuSign", "A2JHLZ", Industry.CLOUD)
            symbolNameMapping["ZEN"] = QuoteSymbolMetaData("ZEN", "Zendesk", "A1115T", Industry.CLOUD)
            symbolNameMapping["TTD"] = QuoteSymbolMetaData("TTD", "Trade Desk", "A2ARCV", Industry.CLOUD)
            symbolNameMapping["NET"] = QuoteSymbolMetaData("NET", "CloudFlare", "A2PQMN", Industry.CLOUD)
            symbolNameMapping["TWLO"] = QuoteSymbolMetaData("TWLO", "Twilio", "A2ALP4", Industry.CLOUD)
            symbolNameMapping["APPF"] = QuoteSymbolMetaData("APPF", "Appfolio", "A14TU7", Industry.CLOUD)
            symbolNameMapping["HUBS"] = QuoteSymbolMetaData("HUBS", "HubSpot", "A12CWQ", Industry.CLOUD)
            symbolNameMapping["CLDR"] = QuoteSymbolMetaData("CLDR", "Cloudera", "A2DPXW", Industry.CLOUD)
            symbolNameMapping["VEEV"] = QuoteSymbolMetaData("VEEV", "Veeva", "A1W5SA", Industry.CLOUD)
            symbolNameMapping["AYX"] = QuoteSymbolMetaData("AYX", "Alteryx", "A2DME9", Industry.CLOUD)
            symbolNameMapping["DDOG"] = QuoteSymbolMetaData("DDOG", "Datadog", "A2PSFR", Industry.CLOUD)
            symbolNameMapping["PD"] = QuoteSymbolMetaData("PD", "Pagerduty", "A2PF9K", Industry.CLOUD)
            symbolNameMapping["DT"] = QuoteSymbolMetaData("DT", "Dynatrace", "A2PPPE", Industry.CLOUD)
            symbolNameMapping["DCT"] = QuoteSymbolMetaData("DCT", "Duck Creek", "A2QA4K", Industry.CLOUD)
            symbolNameMapping["PLAN"] = QuoteSymbolMetaData("PLAN", "Anaplan", "A2N7B1", Industry.CLOUD)
            symbolNameMapping["WDAY"] = QuoteSymbolMetaData("WDAY", "Workday", "A1J39P", Industry.CLOUD)
            symbolNameMapping["433.F"] = QuoteSymbolMetaData("433.F", "Appen", "A12HVN", Industry.CLOUD)
            symbolNameMapping["MDLA"] = QuoteSymbolMetaData("MDLA", "Medallia", "A2PL9R", Industry.CLOUD)
            symbolNameMapping["FROG"] = QuoteSymbolMetaData("FROG", "JFrog", "A2QCJN", Industry.CLOUD)

            // Software
            symbolNameMapping["SAP.DE"] = QuoteSymbolMetaData("SAP.DE", "SAP", "716460", Industry.SOFTWARE)
            symbolNameMapping["ADBE"] = QuoteSymbolMetaData("ADBE", "Adobe", "871981", Industry.SOFTWARE)
            symbolNameMapping["ORCL"] = QuoteSymbolMetaData("ORCL", "Oracle", "871460", Industry.SOFTWARE)
            symbolNameMapping["INTU"] = QuoteSymbolMetaData("INTU", "Intuit", "886053", Industry.SOFTWARE)
            symbolNameMapping["FICO"] = QuoteSymbolMetaData("FICO", "Fico", "873369", Industry.SOFTWARE)
            symbolNameMapping["TEAM"] = QuoteSymbolMetaData("TEAM", "Atlassian", "A2ABYA", Industry.SOFTWARE)
            symbolNameMapping["TYL"] = QuoteSymbolMetaData("TYL", "Tyler Technologies", "917099", Industry.SOFTWARE)
            symbolNameMapping["FAA.DE"] = QuoteSymbolMetaData("FAA.DE", "Fabasoft", "922985", Industry.SOFTWARE)
            symbolNameMapping["A5V.F"] = QuoteSymbolMetaData("A5V.F", "Altium", "924627", Industry.SOFTWARE)
            symbolNameMapping["AOF.DE"] = QuoteSymbolMetaData("AOF.DE", "Atoss", "510440", Industry.SOFTWARE)
            symbolNameMapping["AVLR"] = QuoteSymbolMetaData("AVLR", "Avalara", "A2JNYN", Industry.SOFTWARE)
            symbolNameMapping["MDB"] = QuoteSymbolMetaData("MDB", "MongoDB", "A2DYB1", Industry.SOFTWARE)

            // Security
            symbolNameMapping["FTNT"] = QuoteSymbolMetaData("FTNT", "FortiNet", "A0YEFE", Industry.SECURITY)
            symbolNameMapping["CYBR"] = QuoteSymbolMetaData("CYBR", "Cyberark", "A12CPP", Industry.SECURITY)
            symbolNameMapping["CTXS"] = QuoteSymbolMetaData("CTXS", "Citrix", "898407", Industry.SECURITY)
            symbolNameMapping["CHKP"] = QuoteSymbolMetaData("CHKP", "Check Point Software", "901638", Industry.SECURITY)
            symbolNameMapping["YSN.DE"] = QuoteSymbolMetaData("YSN.DE", "Secunet", "727650", Industry.SECURITY)
            symbolNameMapping["ZS"] = QuoteSymbolMetaData("ZS", "ZScaler", "A2JF28", Industry.SECURITY)
            symbolNameMapping["CRWD"] = QuoteSymbolMetaData("CRWD", "Crowdstrike", "A2PK2R", Industry.SECURITY)
            symbolNameMapping["QLYS"] = QuoteSymbolMetaData("QLYS", "Qualys", "A1J423", Industry.SECURITY)

            // IT-Services
            symbolNameMapping["IBM"] = QuoteSymbolMetaData("IBM", "IBM", "851399", Industry.ITSERVICES)
            symbolNameMapping["MHH"] = QuoteSymbolMetaData("MHH", "Mastech Digital", "A0Q9V2", Industry.ITSERVICES)
            symbolNameMapping["BC8.DE"] = QuoteSymbolMetaData("BC8.DE", "Bechtle", "515870", Industry.ITSERVICES)
            symbolNameMapping["PS"] = QuoteSymbolMetaData("PS", "Pluralsight", "A2JL45", Industry.ITSERVICES)
            symbolNameMapping["TWOU"] = QuoteSymbolMetaData("TWOU", "2U", "A1XEYD", Industry.ITSERVICES)

            return symbolNameMapping
        }
}