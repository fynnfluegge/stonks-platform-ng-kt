package org.algo.invest.core.quotes;

import java.util.LinkedHashMap;
import java.util.Map;

import org.algo.invest.model.QuoteRecord.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;

public class EnergyQuotes {

	public static Map<String, QuoteSymbolMetaData> getQuotes(){
		
		Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<String, QuoteSymbolMetaData>();
		
		// Energie
		symbolNameMapping.put("RWE.DE", new QuoteSymbolMetaData("RWE.DE","RWE","703712","",Industry.ENERGY));
		symbolNameMapping.put("ED", new QuoteSymbolMetaData("ED","Consolidated Edison","911563","",Industry.ENERGY));
		symbolNameMapping.put("BLDP", new QuoteSymbolMetaData("BLDP","Ballard Power Systems","A0RENB","",Industry.ENERGY));
		symbolNameMapping.put("D7G.F", new QuoteSymbolMetaData("D7G.F","Nel Asa","A0B733","",Industry.ENERGY));		
		symbolNameMapping.put("27W.F", new QuoteSymbolMetaData("27W.F","Powercell","A14TK6","",Industry.ENERGY));
		symbolNameMapping.put("PLUG", new QuoteSymbolMetaData("PLUG","Plug Power","A1JA81","",Industry.ENERGY));
		
		// Erneuerbare Energien
		symbolNameMapping.put("NEE", new QuoteSymbolMetaData("NEE","Nextera Energy","A1CZ4H","",Industry.RENEWABLE_ENERGY));
		symbolNameMapping.put("D2G.F", new QuoteSymbolMetaData("D2G.F","Ørsted","A0NBLH","",Industry.RENEWABLE_ENERGY));
		symbolNameMapping.put("VWS.DE", new QuoteSymbolMetaData("VWS.DE","Vestas Wind Systems","A0MRJJ","",Industry.RENEWABLE_ENERGY));
		symbolNameMapping.put("SEDG", new QuoteSymbolMetaData("SEDG","Solaredge","A14QVM","",Industry.RENEWABLE_ENERGY));
		symbolNameMapping.put("CAP.DE", new QuoteSymbolMetaData("CAP.DE","Encavis","609500","",Industry.RENEWABLE_ENERGY));
		symbolNameMapping.put("ENPH", new QuoteSymbolMetaData("ENPH","Enphase Energy","A1JC82","",Industry.RENEWABLE_ENERGY));
		symbolNameMapping.put("CXGH.F", new QuoteSymbolMetaData("CXGH.F","Goldwind","A1C0QD","",Industry.RENEWABLE_ENERGY));
		
		// Akku
		symbolNameMapping.put("VAR1.DE", new QuoteSymbolMetaData("VAR1.DE","Varta","A0TGJ5","",Industry.AKKU));
		symbolNameMapping.put("BY6.F", new QuoteSymbolMetaData("BY6.F","BYD","A0M4W9","",Industry.AKKU));
		
		return symbolNameMapping;
	}
}
