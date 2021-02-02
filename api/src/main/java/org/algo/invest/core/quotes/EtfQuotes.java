package org.algo.invest.core.quotes;

import java.util.LinkedHashMap;
import java.util.Map;

import org.algo.invest.model.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;

public class EtfQuotes {

	public static Map<String, QuoteSymbolMetaData> getQuotes(){
		
		Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<String, QuoteSymbolMetaData>();
		
		// ETFs
		symbolNameMapping.put("EUNL.DE", new QuoteSymbolMetaData("EUNL.DE","iShares Core MSCI World","A0RPWH","", Industry.NONE));
		symbolNameMapping.put("L0CK.DE", new QuoteSymbolMetaData("L0CK.DE","iShares Digital Security","A2JMGE","",Industry.NONE));
		symbolNameMapping.put("IQQ6.DE", new QuoteSymbolMetaData("IQQ6.DE","iShares Developed Markets Property Yield","A0LEW8","",Industry.NONE));
		symbolNameMapping.put("2B78.DE", new QuoteSymbolMetaData("2B78.DE","iShares Healthcare Innovation","A2ANH2","",Industry.NONE));
		symbolNameMapping.put("IBB", new QuoteSymbolMetaData("IBB","iShares Nasdaq Biotechnology","A2DWAW","",Industry.NONE));
		symbolNameMapping.put("ICLN", new QuoteSymbolMetaData("ICLN","iShares Global Clean Energy","","",Industry.NONE));
		symbolNameMapping.put("ESPO", new QuoteSymbolMetaData("ESPO","VanEck Vectors Video Gaming and eSports","","",Industry.NONE));
		
		return symbolNameMapping;
	}
}
