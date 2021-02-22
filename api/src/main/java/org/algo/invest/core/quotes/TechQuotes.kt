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
            symbolNameMapping["NFLX"] = QuoteSymbolMetaData("NFLX", "Netflix", "552484", Industry.FANG)
            symbolNameMapping["BABA"] = QuoteSymbolMetaData("BABA", "Alibaba", "A117ME", Industry.FANG)
            symbolNameMapping["TCEHY"] = QuoteSymbolMetaData("TCEHY", "Tencent", "A1138D", Industry.FANG)
            symbolNameMapping["BIDU"] = QuoteSymbolMetaData("BIDU", "Baidu", "A0F5DE", Industry.FANG)

            // Tech Manufacturing
            symbolNameMapping["SNE"] = QuoteSymbolMetaData("SNE", "SONY", "853688", Industry.FANG)
            symbolNameMapping["3CP.F"] = QuoteSymbolMetaData("3CP.F", "Xiaomi", "A2JNY1", Industry.FANG)
            symbolNameMapping["LGLG.F"] = QuoteSymbolMetaData("LGLG.F", "LG Electronics", "576798", Industry.FANG)
            symbolNameMapping["SSUN.F"] = QuoteSymbolMetaData("SSUN.F", "Samsung", "881823", Industry.FANG)
            symbolNameMapping["DELL"] = QuoteSymbolMetaData("DELL", "Dell", "A2N6WP", Industry.FANG)
            symbolNameMapping["LHL.F"] = QuoteSymbolMetaData("LHL.F", "Lenovo", "894983", Industry.FANG)
            symbolNameMapping["SIE.DE"] = QuoteSymbolMetaData("SIE.DE", "Siemens", "723610", Industry.FANG)
            symbolNameMapping["PCRFY"] = QuoteSymbolMetaData("PCRFY", "Panasonic", "853666", Industry.FANG)
            symbolNameMapping["IRBT"] = QuoteSymbolMetaData("IRBT", "iRobot", "A0F5CC", Industry.FANG)
            symbolNameMapping["GRMN"] = QuoteSymbolMetaData("GRMN", "Garmin", "A1C06B", Industry.FANG)
            symbolNameMapping["BSL.DE"] = QuoteSymbolMetaData("BSL.DE", "Basler", "510200", Industry.FANG)

            //.FANG & FPGA
            symbolNameMapping["NVDA"] = QuoteSymbolMetaData("NVDA", "Nvidia", "918422", Industry.FANG)
            symbolNameMapping["TSFA.F"] = QuoteSymbolMetaData("TSFA.F", "TSMC", "909800", Industry.FANG)
            symbolNameMapping["AMD"] = QuoteSymbolMetaData("AMD", "AMD", "863186", Industry.FANG)
            symbolNameMapping["INTC"] = QuoteSymbolMetaData("INTC", "Intel", "855681", Industry.FANG)
            symbolNameMapping["QCOM"] = QuoteSymbolMetaData("QCOM", "Qualcomm", "883121", Industry.FANG)
            symbolNameMapping["XLNX"] = QuoteSymbolMetaData("XLNX", "Xilinx", "880135", Industry.FANG)
            symbolNameMapping["MPWR"] = QuoteSymbolMetaData("MPWR", "Monolithic Power Systems", "A0DLC4", Industry.FANG)
            symbolNameMapping["IFX.DE"] = QuoteSymbolMetaData("IFX.DE", "Infineon", "623100", Industry.FANG)
            symbolNameMapping["VNX.DE"] = QuoteSymbolMetaData("VNX.DE", "NXP", "A1C5WJ", Industry.FANG)
            symbolNameMapping["DLG.DE"] = QuoteSymbolMetaData("DLG.DE", "Dialog", "927200", Industry.FANG)
            symbolNameMapping["MU"] = QuoteSymbolMetaData("MU", "Micron", "869020", Industry.FANG)
            symbolNameMapping["AVGO"] = QuoteSymbolMetaData("AVGO", "Broadcom", "A2JG9Z", Industry.FANG)
            symbolNameMapping["QRVO"] = QuoteSymbolMetaData("QRVO", "Qorvo", "A12CY9", Industry.FANG)
            symbolNameMapping["ASME.DE"] = QuoteSymbolMetaData("ASME.DE", "ASML", "A1J4U4", Industry.FANG)

            //.FANG/SaaS
            symbolNameMapping["CRM"] = QuoteSymbolMetaData("CRM", "Salesforce", "A0B87V", Industry.FANG)
            symbolNameMapping["SPLK"] = QuoteSymbolMetaData("SPLK", "Splunk", "A1JV4H", Industry.FANG)
            symbolNameMapping["NOW"] = QuoteSymbolMetaData("NOW", "ServiceNow", "A1JX4P", Industry.FANG)
            symbolNameMapping["SNOW"] = QuoteSymbolMetaData("SNOW", "Snowflake", "A2QB38", Industry.FANG)
            symbolNameMapping["DOCU"] = QuoteSymbolMetaData("DOCU", "DocuSign", "A2JHLZ", Industry.FANG)
            symbolNameMapping["ZEN"] = QuoteSymbolMetaData("ZEN", "Zendesk", "A1115T", Industry.FANG)
            symbolNameMapping["TTD"] = QuoteSymbolMetaData("TTD", "Trade Desk", "A2ARCV", Industry.FANG)
            symbolNameMapping["NET"] = QuoteSymbolMetaData("NET", "CloudFlare", "A2PQMN", Industry.FANG)
            symbolNameMapping["TWLO"] = QuoteSymbolMetaData("TWLO", "Twilio", "A2ALP4", Industry.FANG)
            symbolNameMapping["APPF"] = QuoteSymbolMetaData("APPF", "Appfolio", "A14TU7", Industry.FANG)
            symbolNameMapping["HUBS"] = QuoteSymbolMetaData("HUBS", "HubSpot", "A12CWQ", Industry.FANG)
            symbolNameMapping["CLDR"] = QuoteSymbolMetaData("CLDR", "Cloudera", "A2DPXW", Industry.FANG)
            symbolNameMapping["VEEV"] = QuoteSymbolMetaData("VEEV", "Veeva", "A1W5SA", Industry.FANG)
            symbolNameMapping["AYX"] = QuoteSymbolMetaData("AYX", "Alteryx", "A2DME9", Industry.FANG)
            symbolNameMapping["DDOG"] = QuoteSymbolMetaData("DDOG", "Datadog", "A2PSFR", Industry.FANG)
            symbolNameMapping["PD"] = QuoteSymbolMetaData("PD", "Pagerduty", "A2PF9K", Industry.FANG)
            symbolNameMapping["DT"] = QuoteSymbolMetaData("DT", "Dynatrace", "A2PPPE", Industry.FANG)
            symbolNameMapping["DCT"] = QuoteSymbolMetaData("DCT", "Duck Creek", "A2QA4K", Industry.FANG)
            symbolNameMapping["PLAN"] = QuoteSymbolMetaData("PLAN", "Anaplan", "A2N7B1", Industry.FANG)
            symbolNameMapping["WDAY"] = QuoteSymbolMetaData("WDAY", "Workday", "A1J39P", Industry.FANG)
            symbolNameMapping["433.F"] = QuoteSymbolMetaData("433.F", "Appen", "A12HVN", Industry.FANG)
            symbolNameMapping["MDLA"] = QuoteSymbolMetaData("MDLA", "Medallia", "A2PL9R", Industry.FANG)
            symbolNameMapping["FROG"] = QuoteSymbolMetaData("FROG", "JFrog", "A2QCJN", Industry.FANG)

            //.FANG
            symbolNameMapping["SAP.DE"] = QuoteSymbolMetaData("SAP.DE", "SAP", "716460", Industry.FANG)
            symbolNameMapping["ADBE"] = QuoteSymbolMetaData("ADBE", "Adobe", "871981", Industry.FANG)
            symbolNameMapping["ORCL"] = QuoteSymbolMetaData("ORCL", "Oracle", "871460", Industry.FANG)
            symbolNameMapping["INTU"] = QuoteSymbolMetaData("INTU", "Intuit", "886053", Industry.FANG)
            symbolNameMapping["FICO"] = QuoteSymbolMetaData("FICO", "Fico", "873369", Industry.FANG)
            symbolNameMapping["TEAM"] = QuoteSymbolMetaData("TEAM", "Atlassian", "A2ABYA", Industry.FANG)
            symbolNameMapping["TYL"] = QuoteSymbolMetaData("TYL", "Tyler Technologies", "917099", Industry.FANG)
            symbolNameMapping["FAA.DE"] = QuoteSymbolMetaData("FAA.DE", "Fabasoft", "922985", Industry.FANG)
            symbolNameMapping["A5V.F"] = QuoteSymbolMetaData("A5V.F", "Altium", "924627", Industry.FANG)
            symbolNameMapping["AOF.DE"] = QuoteSymbolMetaData("AOF.DE", "Atoss", "510440", Industry.FANG)
            symbolNameMapping["AVLR"] = QuoteSymbolMetaData("AVLR", "Avalara", "A2JNYN", Industry.FANG)
            symbolNameMapping["MDB"] = QuoteSymbolMetaData("MDB", "MongoDB", "A2DYB1", Industry.FANG)

            // FANG
            symbolNameMapping["FTNT"] = QuoteSymbolMetaData("FTNT", "FortiNet", "A0YEFE", Industry.FANG)
            symbolNameMapping["CYBR"] = QuoteSymbolMetaData("CYBR", "Cyberark", "A12CPP", Industry.FANG)
            symbolNameMapping["CTXS"] = QuoteSymbolMetaData("CTXS", "Citrix", "898407", Industry.FANG)
            symbolNameMapping["CHKP"] = QuoteSymbolMetaData("CHKP", "Check Point Software", "901638", Industry.FANG)
            symbolNameMapping["YSN.DE"] = QuoteSymbolMetaData("YSN.DE", "Secunet", "727650", Industry.FANG)
            symbolNameMapping["ZS"] = QuoteSymbolMetaData("ZS", "ZScaler", "A2JF28", Industry.FANG)
            symbolNameMapping["CRWD"] = QuoteSymbolMetaData("CRWD", "Crowdstrike", "A2PK2R", Industry.FANG)
            symbolNameMapping["QLYS"] = QuoteSymbolMetaData("QLYS", "Qualys", "A1J423", Industry.FANG)

            // IT-Services
            symbolNameMapping["IBM"] = QuoteSymbolMetaData("IBM", "IBM", "851399", Industry.FANG)
            symbolNameMapping["MHH"] = QuoteSymbolMetaData("MHH", "Mastech Digital", "A0Q9V2", Industry.FANG)
            symbolNameMapping["BC8.DE"] = QuoteSymbolMetaData("BC8.DE", "Bechtle", "515870", Industry.FANG)
            symbolNameMapping["PS"] = QuoteSymbolMetaData("PS", "Pluralsight", "A2JL45", Industry.FANG)
            symbolNameMapping["TWOU"] = QuoteSymbolMetaData("TWOU", "2U", "A1XEYD", Industry.FANG)

            return symbolNameMapping
        }
}