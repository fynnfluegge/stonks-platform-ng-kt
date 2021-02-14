package org.algo.invest.core.quotes;

import java.util.LinkedHashMap;
import java.util.Map;

import org.algo.invest.model.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;

public class IndustryQuotes {

	public static Map<String, QuoteSymbolMetaData> getQuotes(){
		
		Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<String, QuoteSymbolMetaData>();
		
		// Industrial Manufacturing
		symbolNameMapping.put("RAA.DE", new QuoteSymbolMetaData("RAA.DE","Rational","701080",  Industry.INDUSTRIAL_MANUFACTURING));
		symbolNameMapping.put("JUN3.DE", new QuoteSymbolMetaData("JUN3.DE","Jungheinrich","621993", Industry.INDUSTRIAL_MANUFACTURING));
		symbolNameMapping.put("CAT", new QuoteSymbolMetaData("CAT","Caterpillar","850598", Industry.INDUSTRIAL_MANUFACTURING));
		symbolNameMapping.put("SWK", new QuoteSymbolMetaData("SWK","Stanley Black & Decker","A1CTQA", Industry.INDUSTRIAL_MANUFACTURING));
		symbolNameMapping.put("KBX.DE", new QuoteSymbolMetaData("KBX.DE","Knorr Bremse","KBX100", Industry.INDUSTRIAL_MANUFACTURING));
		symbolNameMapping.put("HNL.DE", new QuoteSymbolMetaData("HNL.DE","Hönle UV Technology","515710", Industry.INDUSTRIAL_MANUFACTURING));
		symbolNameMapping.put("TREX", new QuoteSymbolMetaData("TREX","Trex","938716", Industry.INDUSTRIAL_MANUFACTURING));
		symbolNameMapping.put("PRLB", new QuoteSymbolMetaData("PRLB","Protolabs","A1JUHT", Industry.INDUSTRIAL_MANUFACTURING));
		
		// Roh-/Baustoffe & Chemie
		symbolNameMapping.put("RIO", new QuoteSymbolMetaData("RIO","Rio Tinto","852147", Industry.MATERIALS_CHEMICALS));
		symbolNameMapping.put("BAS.DE", new QuoteSymbolMetaData("BAS.DE","BASF","BASF11", Industry.MATERIALS_CHEMICALS));
		symbolNameMapping.put("HEI.DE", new QuoteSymbolMetaData("HEI.DE","Heidelberg Cement","604700", Industry.MATERIALS_CHEMICALS));
		symbolNameMapping.put("STLD", new QuoteSymbolMetaData("STLD","Steel Dynamics","903772", Industry.MATERIALS_CHEMICALS));
		symbolNameMapping.put("RPL.F", new QuoteSymbolMetaData("RPL.F","UPM-Kymmene","881026", Industry.MATERIALS_CHEMICALS));
		symbolNameMapping.put("GOLD", new QuoteSymbolMetaData("GOLD","Barrick Gold","870450", Industry.MATERIALS_CHEMICALS));
		symbolNameMapping.put("G14.F", new QuoteSymbolMetaData("G14.F","Signify","A2AJ7T", Industry.MATERIALS_CHEMICALS));
		symbolNameMapping.put("AIL.DE", new QuoteSymbolMetaData("AIL.DE","Air Liquide","850133", Industry.MATERIALS_CHEMICALS));
		symbolNameMapping.put("LIN.DE", new QuoteSymbolMetaData("LIN.DE","Linde","A2DSYC", Industry.MATERIALS_CHEMICALS));
		symbolNameMapping.put("1COV.DE", new QuoteSymbolMetaData("1COV.DE","Covestro","606214", Industry.MATERIALS_CHEMICALS));
		symbolNameMapping.put("MZX.DE", new QuoteSymbolMetaData("MZX.DE","Masterflex","549293", Industry.MATERIALS_CHEMICALS));
		symbolNameMapping.put("TTR1.DE", new QuoteSymbolMetaData("TTR1.DE","Technotrans","A0XYGA", Industry.MATERIALS_CHEMICALS));
		
		// Recycling
		symbolNameMapping.put("TMR.F", new QuoteSymbolMetaData("TMR.F","Tomra Systems","872535", Industry.RECYCLING));
		symbolNameMapping.put("WM", new QuoteSymbolMetaData("WM","Waste Management","893579", Industry.RECYCLING));
		symbolNameMapping.put("27V.F", new QuoteSymbolMetaData("27V.F","Avantium","A2DM1P", Industry.RECYCLING));
		symbolNameMapping.put("3C1.F", new QuoteSymbolMetaData("3C1.F","Carbios","A1XA4J", Industry.RECYCLING));
		
		// Immobilien und Baugewerbe
		symbolNameMapping.put("Z", new QuoteSymbolMetaData("Z","Zillow","A14XZY", Industry.REALESTATE_CONSTRUCTION));
		symbolNameMapping.put("LEN", new QuoteSymbolMetaData("LEN","Lennar","851022", Industry.REALESTATE_CONSTRUCTION));
		symbolNameMapping.put("RDFN", new QuoteSymbolMetaData("RDFN","Redfin","A2DU22", Industry.REALESTATE_CONSTRUCTION));
		symbolNameMapping.put("WPC", new QuoteSymbolMetaData("WPC","W.P. Carey","A1J5SB", Industry.REALESTATE_CONSTRUCTION));
		symbolNameMapping.put("VNA.DE", new QuoteSymbolMetaData("VNA.DE","Vonovia","A1ML7", Industry.REALESTATE_CONSTRUCTION));
		symbolNameMapping.put("DWNI.DE", new QuoteSymbolMetaData("DWNI.DE","Deutsche Wohnen","A0HN5C", Industry.REALESTATE_CONSTRUCTION));
		symbolNameMapping.put("HHC", new QuoteSymbolMetaData("HHC","Howard Hughes","A1C7ML", Industry.REALESTATE_CONSTRUCTION));
		
		// Kommunikation
		symbolNameMapping.put("DTE.DE", new QuoteSymbolMetaData("DTE.DE","Telekom","555750", Industry.COMMUNICATION));
		symbolNameMapping.put("VZ", new QuoteSymbolMetaData("VZ","Verizon","868402", Industry.COMMUNICATION));
		symbolNameMapping.put("CSCO", new QuoteSymbolMetaData("CSCO","Cisco","878841", Industry.COMMUNICATION));
		symbolNameMapping.put("T", new QuoteSymbolMetaData("T","AT&T","A0HL9Z", Industry.COMMUNICATION));
		symbolNameMapping.put("MPWR", new QuoteSymbolMetaData("MPWR","Monolithic Power Systems","A0DLC4", Industry.COMMUNICATION));
		symbolNameMapping.put("M0Y.DE", new QuoteSymbolMetaData("M0Y.DE","Mynaric","A0JCY1", Industry.COMMUNICATION));
		symbolNameMapping.put("AMT", new QuoteSymbolMetaData("AMT","American Tower","A1JRLA", Industry.COMMUNICATION));
		symbolNameMapping.put("JNPR", new QuoteSymbolMetaData("JNPR","Juniper Networks","923889", Industry.COMMUNICATION));

		return symbolNameMapping;
	}
}
