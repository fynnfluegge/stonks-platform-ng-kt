package org.algo.invest.core.quotes;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.Getter;
import org.algo.invest.model.QuoteRecord.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;

public class TechQuotes {

	@Getter
	public Map<Industry, Map<String, QuoteSymbolMetaData>> quotes = new LinkedHashMap<>();
	@Getter
	Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<>();

	public TechQuotes() {

		quotes.put(Industry.FANG, new LinkedHashMap<>());
		quotes.get(Industry.FANG).put("GOOG", new QuoteSymbolMetaData("GOOG","Google","A14Y6F", "", Industry.FANG));
		quotes.get(Industry.FANG).put("AAPL", new QuoteSymbolMetaData("AAPL","Apple","865985", "", Industry.FANG));
		quotes.get(Industry.FANG).put("FB", new QuoteSymbolMetaData("FB","Facebook","A1JWVX", "", Industry.FANG));
		quotes.get(Industry.FANG).put("AMZN", new QuoteSymbolMetaData("AMZN","Amazon","906866", "", Industry.FANG));
		quotes.get(Industry.FANG).put("MSFT", new QuoteSymbolMetaData("MSFT","Microsoft","870747", "", Industry.FANG));
		quotes.get(Industry.FANG).put("NFLX", new QuoteSymbolMetaData("NFLX","Netflix","552484", "", Industry.MEDIA));
		quotes.get(Industry.FANG).put("BABA", new QuoteSymbolMetaData("BABA","Alibaba","A117ME", "", Industry.FANG));
		quotes.get(Industry.FANG).put("TCEHY", new QuoteSymbolMetaData("TCEHY","Tencent","A1138D", "", Industry.FANG));
		quotes.get(Industry.FANG).put("BIDU", new QuoteSymbolMetaData("BIDU","Baidu","A0F5DE", "", Industry.FANG));

		// Tech Manufacturing
		symbolNameMapping.put("SNE", new QuoteSymbolMetaData("SNE","SONY","853688", "", Industry.TECH_MANUFACTURING));
		symbolNameMapping.put("3CP.F", new QuoteSymbolMetaData("3CP.F","Xiaomi","A2JNY1", "", Industry.TECH_MANUFACTURING));
		symbolNameMapping.put("LGLG.F", new QuoteSymbolMetaData("LGLG.F","LG Electronics","576798", "", Industry.TECH_MANUFACTURING));
		symbolNameMapping.put("SSUN.F", new QuoteSymbolMetaData("SSUN.F","Samsung","881823", "", Industry.TECH_MANUFACTURING));
		symbolNameMapping.put("DELL", new QuoteSymbolMetaData("DELL","Dell","A2N6WP", "", Industry.TECH_MANUFACTURING));
		symbolNameMapping.put("LHL.F", new QuoteSymbolMetaData("LHL.F","Lenovo","894983", "", Industry.TECH_MANUFACTURING));
		symbolNameMapping.put("SIE.DE", new QuoteSymbolMetaData("SIE.DE","Siemens","723610", "", Industry.TECH_MANUFACTURING));
		symbolNameMapping.put("PCRFY", new QuoteSymbolMetaData("PCRFY","Panasonic","853666", "", Industry.TECH_MANUFACTURING));
		symbolNameMapping.put("IRBT", new QuoteSymbolMetaData("IRBT","iRobot","A0F5CC", "", Industry.TECH_MANUFACTURING));
		symbolNameMapping.put("GRMN", new QuoteSymbolMetaData("GRMN","Garmin","A1C06B", "", Industry.TECH_MANUFACTURING));
		symbolNameMapping.put("BSL.DE", new QuoteSymbolMetaData("BSL.DE","Basler","510200", "", Industry.TECH_MANUFACTURING));

		// Semiconductor & FPGA
		symbolNameMapping.put("NVDA", new QuoteSymbolMetaData("NVDA","Nvidia","918422", "", Industry.SEMICONDUCTOR));
		symbolNameMapping.put("TSFA.F", new QuoteSymbolMetaData("TSFA.F","TSMC","909800","",Industry.SEMICONDUCTOR));
		symbolNameMapping.put("AMD", new QuoteSymbolMetaData("AMD","AMD","863186", "", Industry.SEMICONDUCTOR));
		symbolNameMapping.put("INTC", new QuoteSymbolMetaData("INTC","Intel","855681", "", Industry.SEMICONDUCTOR));
		symbolNameMapping.put("QCOM", new QuoteSymbolMetaData("QCOM","Qualcomm","883121","",Industry.SEMICONDUCTOR));
		symbolNameMapping.put("XLNX", new QuoteSymbolMetaData("XLNX","Xilinx","880135","",Industry.SEMICONDUCTOR));
		symbolNameMapping.put("MPWR", new QuoteSymbolMetaData("MPWR","Monolithic Power Systems","A0DLC4","",Industry.SEMICONDUCTOR));
		symbolNameMapping.put("IFX.DE", new QuoteSymbolMetaData("IFX.DE","Infineon","623100", "", Industry.SEMICONDUCTOR));
		symbolNameMapping.put("VNX.DE", new QuoteSymbolMetaData("VNX.DE","NXP","A1C5WJ", "", Industry.SEMICONDUCTOR));
		symbolNameMapping.put("DLG.DE", new QuoteSymbolMetaData("DLG.DE","Dialog","927200","",Industry.SEMICONDUCTOR));
		symbolNameMapping.put("MU", new QuoteSymbolMetaData("MU","Micron","869020","",Industry.SEMICONDUCTOR));
		symbolNameMapping.put("AVGO", new QuoteSymbolMetaData("AVGO","Broadcom","A2JG9Z","",Industry.SEMICONDUCTOR));
		symbolNameMapping.put("QRVO", new QuoteSymbolMetaData("QRVO","Qorvo","A12CY9","",Industry.SEMICONDUCTOR));
		symbolNameMapping.put("ASME.DE", new QuoteSymbolMetaData("ASME.DE","ASML","A1J4U4","",Industry.SEMICONDUCTOR));

		// Cloud/SaaS
		symbolNameMapping.put("CRM", new QuoteSymbolMetaData("CRM","Salesforce","A0B87V","",Industry.CLOUD));
		symbolNameMapping.put("SPLK", new QuoteSymbolMetaData("SPLK","Splunk","A1JV4H","",Industry.CLOUD));
		symbolNameMapping.put("NOW", new QuoteSymbolMetaData("NOW","ServiceNow","A1JX4P","",Industry.CLOUD));
		symbolNameMapping.put("SNOW", new QuoteSymbolMetaData("SNOW","Snowflake","A2QB38","",Industry.CLOUD));
		symbolNameMapping.put("DOCU", new QuoteSymbolMetaData("DOCU","DocuSign","A2JHLZ","",Industry.CLOUD));
		symbolNameMapping.put("ZEN", new QuoteSymbolMetaData("ZEN","Zendesk","A1115T","",Industry.CLOUD));
		symbolNameMapping.put("TTD", new QuoteSymbolMetaData("TTD","Trade Desk","A2ARCV","",Industry.CLOUD));
		symbolNameMapping.put("NET", new QuoteSymbolMetaData("NET","CloudFlare","A2PQMN","",Industry.CLOUD));
		symbolNameMapping.put("TWLO", new QuoteSymbolMetaData("TWLO","Twilio","A2ALP4","",Industry.CLOUD));
		symbolNameMapping.put("APPF", new QuoteSymbolMetaData("APPF","Appfolio","A14TU7","",Industry.CLOUD));
		symbolNameMapping.put("HUBS", new QuoteSymbolMetaData("HUBS","HubSpot","A12CWQ","",Industry.CLOUD));
		symbolNameMapping.put("CLDR", new QuoteSymbolMetaData("CLDR","Cloudera","A2DPXW","",Industry.CLOUD));
		symbolNameMapping.put("VEEV", new QuoteSymbolMetaData("VEEV","Veeva","A1W5SA","",Industry.CLOUD));
		symbolNameMapping.put("AYX", new QuoteSymbolMetaData("AYX","Alteryx","A2DME9","",Industry.CLOUD));
		symbolNameMapping.put("DDOG", new QuoteSymbolMetaData("DDOG","Datadog","A2PSFR","",Industry.CLOUD));
		symbolNameMapping.put("PD", new QuoteSymbolMetaData("PD","Pagerduty","A2PF9K","",Industry.CLOUD));
		symbolNameMapping.put("DT", new QuoteSymbolMetaData("DT","Dynatrace","A2PPPE","",Industry.CLOUD));
		symbolNameMapping.put("DCT", new QuoteSymbolMetaData("DCT","Duck Creek","A2QA4K","",Industry.CLOUD));
		symbolNameMapping.put("PLAN", new QuoteSymbolMetaData("PLAN","Anaplan","A2N7B1","",Industry.CLOUD));
		symbolNameMapping.put("WDAY", new QuoteSymbolMetaData("WDAY","Workday","A1J39P","",Industry.CLOUD));
		symbolNameMapping.put("433.F", new QuoteSymbolMetaData("433.F","Appen","A12HVN","",Industry.CLOUD));
		symbolNameMapping.put("MDLA", new QuoteSymbolMetaData("MDLA","Medallia","A2PL9R","",Industry.CLOUD));
		symbolNameMapping.put("FROG", new QuoteSymbolMetaData("FROG","JFrog","A2QCJN","",Industry.CLOUD));

		// Software
		symbolNameMapping.put("SAP.DE", new QuoteSymbolMetaData("SAP.DE","SAP","716460","",Industry.SOFTWARE));
		symbolNameMapping.put("ADBE", new QuoteSymbolMetaData("ADBE","Adobe","871981","",Industry.SOFTWARE));
		symbolNameMapping.put("ORCL", new QuoteSymbolMetaData("ORCL","Oracle","871460","",Industry.SOFTWARE));
		symbolNameMapping.put("INTU", new QuoteSymbolMetaData("INTU","Intuit","886053","",Industry.SOFTWARE));
		symbolNameMapping.put("FICO", new QuoteSymbolMetaData("FICO","Fico","873369","",Industry.SOFTWARE));
		symbolNameMapping.put("TEAM", new QuoteSymbolMetaData("TEAM","Atlassian","A2ABYA","",Industry.SOFTWARE));
		symbolNameMapping.put("TYL", new QuoteSymbolMetaData("TYL","Tyler Technologies","917099","",Industry.SOFTWARE));
		symbolNameMapping.put("FAA.DE", new QuoteSymbolMetaData("FAA.DE","Fabasoft","922985","",Industry.SOFTWARE));
		symbolNameMapping.put("A5V.F", new QuoteSymbolMetaData("A5V.F","Altium","924627","",Industry.SOFTWARE));
		symbolNameMapping.put("AOF.DE", new QuoteSymbolMetaData("AOF.DE","Atoss","510440","",Industry.SOFTWARE));
		symbolNameMapping.put("AVLR", new QuoteSymbolMetaData("AVLR","Avalara","A2JNYN","",Industry.SOFTWARE));
		symbolNameMapping.put("MDB", new QuoteSymbolMetaData("MDB","MongoDB","A2DYB1","",Industry.SOFTWARE));

		// Security
		symbolNameMapping.put("FTNT", new QuoteSymbolMetaData("FTNT","FortiNet","A0YEFE","",Industry.SECURITY));
		symbolNameMapping.put("CYBR", new QuoteSymbolMetaData("CYBR","Cyberark","A12CPP","",Industry.SECURITY));
		symbolNameMapping.put("CTXS", new QuoteSymbolMetaData("CTXS","Citrix","898407","",Industry.SECURITY));
		symbolNameMapping.put("CHKP", new QuoteSymbolMetaData("CHKP","Check Point Software","901638","",Industry.SECURITY));
		symbolNameMapping.put("YSN.DE", new QuoteSymbolMetaData("YSN.DE","Secunet","727650","",Industry.SECURITY));
		symbolNameMapping.put("ZS", new QuoteSymbolMetaData("ZS","ZScaler","A2JF28","",Industry.SECURITY));
		symbolNameMapping.put("CRWD", new QuoteSymbolMetaData("CRWD","Crowdstrike","A2PK2R","",Industry.SECURITY));
		symbolNameMapping.put("QLYS", new QuoteSymbolMetaData("QLYS","Qualys","A1J423","",Industry.SECURITY));

		// IT-Services
		symbolNameMapping.put("IBM", new QuoteSymbolMetaData("IBM","IBM","851399","",Industry.ITSERVICES));
		symbolNameMapping.put("MHH", new QuoteSymbolMetaData("MHH","Mastech Digital","A0Q9V2","",Industry.ITSERVICES));
		symbolNameMapping.put("BC8.DE", new QuoteSymbolMetaData("BC8.DE","Bechtle","515870","",Industry.ITSERVICES));
		symbolNameMapping.put("PS", new QuoteSymbolMetaData("PS","Pluralsight","A2JL45","",Industry.ITSERVICES));
		symbolNameMapping.put("TWOU", new QuoteSymbolMetaData("TWOU","2U","A1XEYD","",Industry.ITSERVICES));
	}
}
