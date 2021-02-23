package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object TechQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()
            symbolNameMapping["GOOG"] = QuoteSymbolMetaData("GOOG", "Google", "A14Y6F", Industry.TECH)
            symbolNameMapping["AAPL"] = QuoteSymbolMetaData("AAPL", "Apple", "865985", Industry.TECH)
            symbolNameMapping["FB"] = QuoteSymbolMetaData("FB", "Facebook", "A1JWVX", Industry.TECH)
            symbolNameMapping["AMZN"] = QuoteSymbolMetaData("AMZN", "Amazon", "906866", Industry.TECH)
            symbolNameMapping["MSFT"] = QuoteSymbolMetaData("MSFT", "Microsoft", "870747", Industry.TECH)
            symbolNameMapping["NFLX"] = QuoteSymbolMetaData("NFLX", "Netflix", "552484", Industry.TECH)
            symbolNameMapping["BABA"] = QuoteSymbolMetaData("BABA", "Alibaba", "A117ME", Industry.TECH)
            symbolNameMapping["TCEHY"] = QuoteSymbolMetaData("TCEHY", "Tencent", "A1138D", Industry.TECH)
            symbolNameMapping["BIDU"] = QuoteSymbolMetaData("BIDU", "Baidu", "A0F5DE", Industry.TECH)

            // Tech Manufacturing
            symbolNameMapping["SNE"] = QuoteSymbolMetaData("SNE", "SONY", "853688", Industry.TECH)
            symbolNameMapping["3CP.F"] = QuoteSymbolMetaData("3CP.F", "Xiaomi", "A2JNY1", Industry.TECH)
            symbolNameMapping["LGLG.F"] = QuoteSymbolMetaData("LGLG.F", "LG Electronics", "576798", Industry.TECH)
            symbolNameMapping["SSUN.F"] = QuoteSymbolMetaData("SSUN.F", "Samsung", "881823", Industry.TECH)
            symbolNameMapping["DELL"] = QuoteSymbolMetaData("DELL", "Dell", "A2N6WP", Industry.TECH)
            symbolNameMapping["LHL.F"] = QuoteSymbolMetaData("LHL.F", "Lenovo", "894983", Industry.TECH)
            symbolNameMapping["SIE.DE"] = QuoteSymbolMetaData("SIE.DE", "Siemens", "723610", Industry.TECH)
            symbolNameMapping["PCRFY"] = QuoteSymbolMetaData("PCRFY", "Panasonic", "853666", Industry.TECH)
            symbolNameMapping["IRBT"] = QuoteSymbolMetaData("IRBT", "iRobot", "A0F5CC", Industry.TECH)
            symbolNameMapping["GRMN"] = QuoteSymbolMetaData("GRMN", "Garmin", "A1C06B", Industry.TECH)
            symbolNameMapping["BSL.DE"] = QuoteSymbolMetaData("BSL.DE", "Basler", "510200", Industry.TECH)

            //.TECH& FPGA
            symbolNameMapping["NVDA"] = QuoteSymbolMetaData("NVDA", "Nvidia", "918422", Industry.TECH)
            symbolNameMapping["TSFA.F"] = QuoteSymbolMetaData("TSFA.F", "TSMC", "909800", Industry.TECH)
            symbolNameMapping["AMD"] = QuoteSymbolMetaData("AMD", "AMD", "863186", Industry.TECH)
            symbolNameMapping["INTC"] = QuoteSymbolMetaData("INTC", "Intel", "855681", Industry.TECH)
            symbolNameMapping["QCOM"] = QuoteSymbolMetaData("QCOM", "Qualcomm", "883121", Industry.TECH)
            symbolNameMapping["XLNX"] = QuoteSymbolMetaData("XLNX", "Xilinx", "880135", Industry.TECH)
            symbolNameMapping["MPWR"] = QuoteSymbolMetaData("MPWR", "Monolithic Power Systems", "A0DLC4", Industry.TECH)
            symbolNameMapping["IFX.DE"] = QuoteSymbolMetaData("IFX.DE", "Infineon", "623100", Industry.TECH)
            symbolNameMapping["VNX.DE"] = QuoteSymbolMetaData("VNX.DE", "NXP", "A1C5WJ", Industry.TECH)
            symbolNameMapping["DLG.DE"] = QuoteSymbolMetaData("DLG.DE", "Dialog", "927200", Industry.TECH)
            symbolNameMapping["MU"] = QuoteSymbolMetaData("MU", "Micron", "869020", Industry.TECH)
            symbolNameMapping["AVGO"] = QuoteSymbolMetaData("AVGO", "Broadcom", "A2JG9Z", Industry.TECH)
            symbolNameMapping["QRVO"] = QuoteSymbolMetaData("QRVO", "Qorvo", "A12CY9", Industry.TECH)
            symbolNameMapping["ASME.DE"] = QuoteSymbolMetaData("ASME.DE", "ASML", "A1J4U4", Industry.TECH)

            //.TECH/SaaS
            symbolNameMapping["CRM"] = QuoteSymbolMetaData("CRM", "Salesforce", "A0B87V", Industry.TECH)
            symbolNameMapping["SPLK"] = QuoteSymbolMetaData("SPLK", "Splunk", "A1JV4H", Industry.TECH)
            symbolNameMapping["NOW"] = QuoteSymbolMetaData("NOW", "ServiceNow", "A1JX4P", Industry.TECH)
            symbolNameMapping["SNOW"] = QuoteSymbolMetaData("SNOW", "Snowflake", "A2QB38", Industry.TECH)
            symbolNameMapping["DOCU"] = QuoteSymbolMetaData("DOCU", "DocuSign", "A2JHLZ", Industry.TECH)
            symbolNameMapping["ZEN"] = QuoteSymbolMetaData("ZEN", "Zendesk", "A1115T", Industry.TECH)
            symbolNameMapping["TTD"] = QuoteSymbolMetaData("TTD", "Trade Desk", "A2ARCV", Industry.TECH)
            symbolNameMapping["NET"] = QuoteSymbolMetaData("NET", "CloudFlare", "A2PQMN", Industry.TECH)
            symbolNameMapping["TWLO"] = QuoteSymbolMetaData("TWLO", "Twilio", "A2ALP4", Industry.TECH)
            symbolNameMapping["APPF"] = QuoteSymbolMetaData("APPF", "Appfolio", "A14TU7", Industry.TECH)
            symbolNameMapping["HUBS"] = QuoteSymbolMetaData("HUBS", "HubSpot", "A12CWQ", Industry.TECH)
            symbolNameMapping["CLDR"] = QuoteSymbolMetaData("CLDR", "Cloudera", "A2DPXW", Industry.TECH)
            symbolNameMapping["VEEV"] = QuoteSymbolMetaData("VEEV", "Veeva", "A1W5SA", Industry.TECH)
            symbolNameMapping["AYX"] = QuoteSymbolMetaData("AYX", "Alteryx", "A2DME9", Industry.TECH)
            symbolNameMapping["DDOG"] = QuoteSymbolMetaData("DDOG", "Datadog", "A2PSFR", Industry.TECH)
            symbolNameMapping["PD"] = QuoteSymbolMetaData("PD", "Pagerduty", "A2PF9K", Industry.TECH)
            symbolNameMapping["DT"] = QuoteSymbolMetaData("DT", "Dynatrace", "A2PPPE", Industry.TECH)
            symbolNameMapping["DCT"] = QuoteSymbolMetaData("DCT", "Duck Creek", "A2QA4K", Industry.TECH)
            symbolNameMapping["PLAN"] = QuoteSymbolMetaData("PLAN", "Anaplan", "A2N7B1", Industry.TECH)
            symbolNameMapping["WDAY"] = QuoteSymbolMetaData("WDAY", "Workday", "A1J39P", Industry.TECH)
            symbolNameMapping["433.F"] = QuoteSymbolMetaData("433.F", "Appen", "A12HVN", Industry.TECH)
            symbolNameMapping["MDLA"] = QuoteSymbolMetaData("MDLA", "Medallia", "A2PL9R", Industry.TECH)
            symbolNameMapping["FROG"] = QuoteSymbolMetaData("FROG", "JFrog", "A2QCJN", Industry.TECH)

            //.TECH
            symbolNameMapping["SAP.DE"] = QuoteSymbolMetaData("SAP.DE", "SAP", "716460", Industry.TECH)
            symbolNameMapping["ADBE"] = QuoteSymbolMetaData("ADBE", "Adobe", "871981", Industry.TECH)
            symbolNameMapping["ORCL"] = QuoteSymbolMetaData("ORCL", "Oracle", "871460", Industry.TECH)
            symbolNameMapping["INTU"] = QuoteSymbolMetaData("INTU", "Intuit", "886053", Industry.TECH)
            symbolNameMapping["FICO"] = QuoteSymbolMetaData("FICO", "Fico", "873369", Industry.TECH)
            symbolNameMapping["TEAM"] = QuoteSymbolMetaData("TEAM", "Atlassian", "A2ABYA", Industry.TECH)
            symbolNameMapping["TYL"] = QuoteSymbolMetaData("TYL", "Tyler Technologies", "917099", Industry.TECH)
            symbolNameMapping["FAA.DE"] = QuoteSymbolMetaData("FAA.DE", "Fabasoft", "922985", Industry.TECH)
            symbolNameMapping["A5V.F"] = QuoteSymbolMetaData("A5V.F", "Altium", "924627", Industry.TECH)
            symbolNameMapping["AOF.DE"] = QuoteSymbolMetaData("AOF.DE", "Atoss", "510440", Industry.TECH)
            symbolNameMapping["AVLR"] = QuoteSymbolMetaData("AVLR", "Avalara", "A2JNYN", Industry.TECH)
            symbolNameMapping["MDB"] = QuoteSymbolMetaData("MDB", "MongoDB", "A2DYB1", Industry.TECH)

            // FANG
            symbolNameMapping["FTNT"] = QuoteSymbolMetaData("FTNT", "FortiNet", "A0YEFE", Industry.TECH)
            symbolNameMapping["CYBR"] = QuoteSymbolMetaData("CYBR", "Cyberark", "A12CPP", Industry.TECH)
            symbolNameMapping["CTXS"] = QuoteSymbolMetaData("CTXS", "Citrix", "898407", Industry.TECH)
            symbolNameMapping["CHKP"] = QuoteSymbolMetaData("CHKP", "Check Point Software", "901638", Industry.TECH)
            symbolNameMapping["YSN.DE"] = QuoteSymbolMetaData("YSN.DE", "Secunet", "727650", Industry.TECH)
            symbolNameMapping["ZS"] = QuoteSymbolMetaData("ZS", "ZScaler", "A2JF28", Industry.TECH)
            symbolNameMapping["CRWD"] = QuoteSymbolMetaData("CRWD", "Crowdstrike", "A2PK2R", Industry.TECH)
            symbolNameMapping["QLYS"] = QuoteSymbolMetaData("QLYS", "Qualys", "A1J423", Industry.TECH)

            // IT-Services
            symbolNameMapping["IBM"] = QuoteSymbolMetaData("IBM", "IBM", "851399", Industry.TECH)
            symbolNameMapping["MHH"] = QuoteSymbolMetaData("MHH", "Mastech Digital", "A0Q9V2", Industry.TECH)
            symbolNameMapping["BC8.DE"] = QuoteSymbolMetaData("BC8.DE", "Bechtle", "515870", Industry.TECH)
            symbolNameMapping["PS"] = QuoteSymbolMetaData("PS", "Pluralsight", "A2JL45", Industry.TECH)
            symbolNameMapping["TWOU"] = QuoteSymbolMetaData("TWOU", "2U", "A1XEYD", Industry.TECH)

            return symbolNameMapping
        }
}