package org.algo.invest.core.quotes;

import java.util.LinkedHashMap;
import java.util.Map;

import org.algo.invest.model.QuoteRecord.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;

public class ChinaQuotes {

	public static Map<String, QuoteSymbolMetaData> getQuotes(){
		
		Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<String, QuoteSymbolMetaData>();
		
		symbolNameMapping.put("DOYU", new QuoteSymbolMetaData("DOYU","DouYou","","",Industry.CHINA));
		symbolNameMapping.put("HUYA", new QuoteSymbolMetaData("HUYA","HuYa","","",Industry.CHINA));
		symbolNameMapping.put("MPNGF", new QuoteSymbolMetaData("MPNGF","Meituan-Dianping","","",Industry.CHINA));
		symbolNameMapping.put("FNI.F", new QuoteSymbolMetaData("FNI.F","Fosun","","",Industry.CHINA));
		symbolNameMapping.put("JD", new QuoteSymbolMetaData("JD","JD.com","","",Industry.CHINA));
		symbolNameMapping.put("PDD", new QuoteSymbolMetaData("PDD","Pinduoduo","","",Industry.CHINA));
		symbolNameMapping.put("HMI", new QuoteSymbolMetaData("HMI","Huami","","",Industry.CHINA));
		symbolNameMapping.put("BZUN", new QuoteSymbolMetaData("BZUN","Baozun","","",Industry.CHINA));
		symbolNameMapping.put("TOBAF", new QuoteSymbolMetaData("TOBAF","Taat","A2P6PR","",Industry.CHINA));
		
		return symbolNameMapping;
	}
}
