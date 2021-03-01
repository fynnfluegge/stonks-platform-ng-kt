package org.algo.invest.core.quotes

import org.algo.invest.model.Category
import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object TechQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            symbolNameMapping["GOOG"] = QuoteSymbolMetaData("GOOG", "Google", "A14Y6F", Industry.TECH, Category.FANG)
            symbolNameMapping["AAPL"] = QuoteSymbolMetaData("AAPL", "Apple", "865985", Industry.TECH, Category.FANG)
            symbolNameMapping["FB"] = QuoteSymbolMetaData("FB", "Facebook", "A1JWVX", Industry.TECH, Category.FANG)
            symbolNameMapping["AMZN"] = QuoteSymbolMetaData("AMZN", "Amazon", "906866", Industry.TECH, Category.FANG)
            symbolNameMapping["MSFT"] = QuoteSymbolMetaData("MSFT", "Microsoft", "870747", Industry.TECH, Category.FANG)
            symbolNameMapping["NFLX"] = QuoteSymbolMetaData("NFLX", "Netflix", "552484", Industry.TECH, Category.FANG)
            symbolNameMapping["BABA"] = QuoteSymbolMetaData("BABA", "Alibaba", "A117ME", Industry.TECH, Category.FANG)
            symbolNameMapping["TCEHY"] = QuoteSymbolMetaData("TCEHY", "Tencent", "A1138D", Industry.TECH, Category.FANG)
            symbolNameMapping["BIDU"] = QuoteSymbolMetaData("BIDU", "Baidu", "A0F5DE", Industry.TECH, Category.FANG)

            symbolNameMapping["NVDA"] = QuoteSymbolMetaData("NVDA", "Nvidia", "918422", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["TSFA.F"] = QuoteSymbolMetaData("TSFA.F", "TSMC", "909800", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["AMD"] = QuoteSymbolMetaData("AMD", "AMD", "863186", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["INTC"] = QuoteSymbolMetaData("INTC", "Intel", "855681", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["QCOM"] = QuoteSymbolMetaData("QCOM", "Qualcomm", "883121", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["XLNX"] = QuoteSymbolMetaData("XLNX", "Xilinx", "880135", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["MPWR"] = QuoteSymbolMetaData("MPWR", "Monolithic Power Systems", "A0DLC4", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["IFX.DE"] = QuoteSymbolMetaData("IFX.DE", "Infineon", "623100", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["VNX.DE"] = QuoteSymbolMetaData("VNX.DE", "NXP", "A1C5WJ", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["DLG.DE"] = QuoteSymbolMetaData("DLG.DE", "Dialog", "927200", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["MU"] = QuoteSymbolMetaData("MU", "Micron", "869020", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["AVGO"] = QuoteSymbolMetaData("AVGO", "Broadcom", "A2JG9Z", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["QRVO"] = QuoteSymbolMetaData("QRVO", "Qorvo", "A12CY9", Industry.TECH, Category.SEMICONDUCTOR)
            symbolNameMapping["ASME.DE"] = QuoteSymbolMetaData("ASME.DE", "ASML", "A1J4U4", Industry.TECH, Category.SEMICONDUCTOR)

            symbolNameMapping["CRM"] = QuoteSymbolMetaData("CRM", "Salesforce", "A0B87V", Industry.TECH, Category.SAAS)
            symbolNameMapping["NOW"] = QuoteSymbolMetaData("NOW", "ServiceNow", "A1JX4P", Industry.TECH, Category.SAAS)
            symbolNameMapping["SPLK"] = QuoteSymbolMetaData("SPLK", "Splunk", "A1JV4H", Industry.TECH, Category.SAAS)
            symbolNameMapping["SNOW"] = QuoteSymbolMetaData("SNOW", "Snowflake", "A2QB38", Industry.TECH, Category.SAAS)
            symbolNameMapping["DOCU"] = QuoteSymbolMetaData("DOCU", "DocuSign", "A2JHLZ", Industry.TECH, Category.SAAS)
            symbolNameMapping["VEEV"] = QuoteSymbolMetaData("VEEV", "Veeva System", "A1W5SA", Industry.HEALTH, Category.SAAS)
            symbolNameMapping["ZEN"] = QuoteSymbolMetaData("ZEN", "Zendesk", "A1115T", Industry.TECH, Category.SAAS)
            symbolNameMapping["TTD"] = QuoteSymbolMetaData("TTD", "Trade Desk", "A2ARCV", Industry.TECH, Category.SAAS)
            symbolNameMapping["NET"] = QuoteSymbolMetaData("NET", "CloudFlare", "A2PQMN", Industry.TECH, Category.SAAS)
            symbolNameMapping["TWLO"] = QuoteSymbolMetaData("TWLO", "Twilio", "A2ALP4", Industry.TECH, Category.SAAS)
            symbolNameMapping["APPF"] = QuoteSymbolMetaData("APPF", "Appfolio", "A14TU7", Industry.TECH, Category.SAAS)
            symbolNameMapping["HUBS"] = QuoteSymbolMetaData("HUBS", "HubSpot", "A12CWQ", Industry.TECH, Category.SAAS)
            symbolNameMapping["CLDR"] = QuoteSymbolMetaData("CLDR", "Cloudera", "A2DPXW", Industry.TECH, Category.SAAS)
            symbolNameMapping["VEEV"] = QuoteSymbolMetaData("VEEV", "Veeva", "A1W5SA", Industry.TECH, Category.SAAS)
            symbolNameMapping["AYX"] = QuoteSymbolMetaData("AYX", "Alteryx", "A2DME9", Industry.TECH, Category.SAAS)
            symbolNameMapping["DDOG"] = QuoteSymbolMetaData("DDOG", "Datadog", "A2PSFR", Industry.TECH, Category.SAAS)
            symbolNameMapping["PD"] = QuoteSymbolMetaData("PD", "Pagerduty", "A2PF9K", Industry.TECH, Category.SAAS)
            symbolNameMapping["DT"] = QuoteSymbolMetaData("DT", "Dynatrace", "A2PPPE", Industry.TECH, Category.SAAS)
            symbolNameMapping["DCT"] = QuoteSymbolMetaData("DCT", "Duck Creek", "A2QA4K", Industry.TECH, Category.SAAS)
            symbolNameMapping["PLAN"] = QuoteSymbolMetaData("PLAN", "Anaplan", "A2N7B1", Industry.TECH, Category.SAAS)
            symbolNameMapping["WDAY"] = QuoteSymbolMetaData("WDAY", "Workday", "A1J39P", Industry.TECH, Category.SAAS)
            symbolNameMapping["433.F"] = QuoteSymbolMetaData("433.F", "Appen", "A12HVN", Industry.TECH, Category.SAAS)
            symbolNameMapping["MDLA"] = QuoteSymbolMetaData("MDLA", "Medallia", "A2PL9R", Industry.TECH, Category.SAAS)
            symbolNameMapping["FROG"] = QuoteSymbolMetaData("FROG", "JFrog", "A2QCJN", Industry.TECH, Category.SAAS)
            symbolNameMapping["TWOU"] = QuoteSymbolMetaData("TWOU", "2U", "A1XEYD", Industry.TECH, Category.SAAS)
            symbolNameMapping["PS"] = QuoteSymbolMetaData("PS", "Pluralsight", "A2JL45", Industry.TECH, Category.SAAS)
            symbolNameMapping["XNET"] = QuoteSymbolMetaData("XNET", "Xunlei", "A1JJL2", Industry.TECH, Category.SAAS)

            symbolNameMapping["SAP.DE"] = QuoteSymbolMetaData("SAP.DE", "SAP", "716460", Industry.TECH, Category.SOFTWARE)
            symbolNameMapping["ADBE"] = QuoteSymbolMetaData("ADBE", "Adobe", "871981", Industry.TECH, Category.SOFTWARE)
            symbolNameMapping["ORCL"] = QuoteSymbolMetaData("ORCL", "Oracle", "871460", Industry.TECH, Category.SOFTWARE)
            symbolNameMapping["INTU"] = QuoteSymbolMetaData("INTU", "Intuit", "886053", Industry.TECH, Category.SOFTWARE)
            symbolNameMapping["PLTR"] = QuoteSymbolMetaData("PLTR", "Palantir", "A2QA4J", Industry.TECH, Category.SOFTWARE)
            symbolNameMapping["FICO"] = QuoteSymbolMetaData("FICO", "Fico", "873369", Industry.TECH, Category.SOFTWARE)
            symbolNameMapping["TEAM"] = QuoteSymbolMetaData("TEAM", "Atlassian", "A2ABYA", Industry.TECH, Category.SOFTWARE)
            symbolNameMapping["TYL"] = QuoteSymbolMetaData("TYL", "Tyler Technologies", "917099", Industry.TECH, Category.SOFTWARE)
            symbolNameMapping["FAA.DE"] = QuoteSymbolMetaData("FAA.DE", "Fabasoft", "922985", Industry.TECH, Category.SOFTWARE)
            symbolNameMapping["ALU.AX"] = QuoteSymbolMetaData("ALU.AX", "Altium Limited", "924627", Industry.TECH, Category.SOFTWARE)
            symbolNameMapping["AOF.DE"] = QuoteSymbolMetaData("AOF.DE", "Atoss", "510440", Industry.TECH, Category.SOFTWARE)
            symbolNameMapping["AVLR"] = QuoteSymbolMetaData("AVLR", "Avalara", "A2JNYN", Industry.TECH, Category.SOFTWARE)
            symbolNameMapping["MDB"] = QuoteSymbolMetaData("MDB", "MongoDB", "A2DYB1", Industry.TECH, Category.SOFTWARE)

            // Security
            symbolNameMapping["FTNT"] = QuoteSymbolMetaData("FTNT", "FortiNet", "A0YEFE", Industry.TECH, Category.SECURITY)
            symbolNameMapping["CYBR"] = QuoteSymbolMetaData("CYBR", "Cyberark", "A12CPP", Industry.TECH, Category.SECURITY)
            symbolNameMapping["CTXS"] = QuoteSymbolMetaData("CTXS", "Citrix", "898407", Industry.TECH, Category.SECURITY)
            symbolNameMapping["CHKP"] = QuoteSymbolMetaData("CHKP", "Check Point Software", "901638", Industry.TECH, Category.SECURITY)
            symbolNameMapping["YSN.DE"] = QuoteSymbolMetaData("YSN.DE", "Secunet", "727650", Industry.TECH, Category.SECURITY)
            symbolNameMapping["ZS"] = QuoteSymbolMetaData("ZS", "ZScaler", "A2JF28", Industry.TECH, Category.SECURITY)
            symbolNameMapping["CRWD"] = QuoteSymbolMetaData("CRWD", "Crowdstrike", "A2PK2R", Industry.TECH, Category.SECURITY)
            symbolNameMapping["QLYS"] = QuoteSymbolMetaData("QLYS", "Qualys", "A1J423", Industry.TECH, Category.SECURITY)

            // Tech Manufacturing
            symbolNameMapping["SNE"] = QuoteSymbolMetaData("SNE", "SONY", "853688", Industry.TECH, Category.MANUFACTURING)
            symbolNameMapping["3CP.F"] = QuoteSymbolMetaData("3CP.F", "Xiaomi", "A2JNY1", Industry.TECH, Category.MANUFACTURING)
            symbolNameMapping["LGLG.F"] = QuoteSymbolMetaData("LGLG.F", "LG Electronics", "576798", Industry.TECH, Category.MANUFACTURING)
            symbolNameMapping["SSUN.F"] = QuoteSymbolMetaData("SSUN.F", "Samsung", "881823", Industry.TECH, Category.MANUFACTURING)
            symbolNameMapping["DELL"] = QuoteSymbolMetaData("DELL", "Dell", "A2N6WP", Industry.TECH, Category.MANUFACTURING)
            symbolNameMapping["LHL.F"] = QuoteSymbolMetaData("LHL.F", "Lenovo", "894983", Industry.TECH, Category.MANUFACTURING)
            symbolNameMapping["SIE.DE"] = QuoteSymbolMetaData("SIE.DE", "Siemens", "723610", Industry.TECH, Category.MANUFACTURING)
            symbolNameMapping["PCRFY"] = QuoteSymbolMetaData("PCRFY", "Panasonic", "853666", Industry.TECH, Category.MANUFACTURING)
            symbolNameMapping["IRBT"] = QuoteSymbolMetaData("IRBT", "iRobot", "A0F5CC", Industry.TECH, Category.MANUFACTURING)
            symbolNameMapping["GRMN"] = QuoteSymbolMetaData("GRMN", "Garmin", "A1C06B", Industry.TECH, Category.MANUFACTURING)
            symbolNameMapping["HMI"] = QuoteSymbolMetaData("HMI", "Huami", "", Industry.OTHER, Category.CHINA)
            symbolNameMapping["BSL.DE"] = QuoteSymbolMetaData("BSL.DE", "Basler", "510200", Industry.TECH, Category.MANUFACTURING)

            return symbolNameMapping
        }
}