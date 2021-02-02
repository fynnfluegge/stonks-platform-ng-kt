package org.algo.invest.core.quotes;

import java.util.LinkedHashMap;
import java.util.Map;

import org.algo.invest.model.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;

public class MediaQuotes {

	public static Map<String, QuoteSymbolMetaData> getQuotes(){
	
		Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<String, QuoteSymbolMetaData>();
	
		// Media
		symbolNameMapping.put("DIS", new QuoteSymbolMetaData("DIS","Walt Disney","855686","", Industry.MEDIA));
		symbolNameMapping.put("SPOT", new QuoteSymbolMetaData("SPOT","Spotify","A2JEGN","",Industry.MEDIA));
		symbolNameMapping.put("TME", new QuoteSymbolMetaData("TME","Tencent Music","A1138D","",Industry.MEDIA));
		symbolNameMapping.put("IQ8.F", new QuoteSymbolMetaData("IQ8.F","IQIYI","A2JGN8","",Industry.MEDIA));
		symbolNameMapping.put("ROKU", new QuoteSymbolMetaData("ROKU","Roku","A2DW4X","",Industry.MEDIA));
		symbolNameMapping.put("NNW.F", new QuoteSymbolMetaData("NNW.F","Naspers","906614","",Industry.MEDIA));
		
		// Games
		symbolNameMapping.put("NTO.F", new QuoteSymbolMetaData("NTO.F","Nintendo","864009","",Industry.GAMES));
		symbolNameMapping.put("7CD.F", new QuoteSymbolMetaData("7CD.F","CD Project Red","534356","",Industry.GAMES));
		symbolNameMapping.put("EA", new QuoteSymbolMetaData("EA","EA","878372","",Industry.GAMES));
		symbolNameMapping.put("ATVI", new QuoteSymbolMetaData("ATVI","Activision Blizzard","A0Q4K4","",Industry.GAMES));
		symbolNameMapping.put("TTWO", new QuoteSymbolMetaData("TTWO","Take 2","914508","",Industry.GAMES));
		symbolNameMapping.put("TH9A.F", new QuoteSymbolMetaData("TH9A.F","THQ Nordic","A2PS64","",Industry.GAMES));
		symbolNameMapping.put("11C.F", new QuoteSymbolMetaData("11C.F","11 Bit Studios","A1J1ZZ","",Industry.GAMES));
		
		return symbolNameMapping;	
	}
}
