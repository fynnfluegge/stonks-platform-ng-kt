package org.algo.invest.core.quotes;

import java.util.LinkedHashMap;
import java.util.Map;

import org.algo.invest.model.QuoteRecord.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;

public class FinanceQuotes {

	public static Map<String, QuoteSymbolMetaData> getQuotes(){
		
		Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<String, QuoteSymbolMetaData>();
		
		// Finanzen/Versicherung/Holding
		symbolNameMapping.put("JPM", new QuoteSymbolMetaData("JPM","JP Morgan","850628","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("GS", new QuoteSymbolMetaData("GS","Goldman Sachs","920332","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("WFC", new QuoteSymbolMetaData("WFC","Wells Fargo","857949","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("BAC", new QuoteSymbolMetaData("BAC","Bank of America","858388","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("MS", new QuoteSymbolMetaData("MS","Morgan Stanley","885836","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("C", new QuoteSymbolMetaData("C","Citigroup","A1H92V","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("MUV2.DE", new QuoteSymbolMetaData("MUV2.DE","Munich Re","843002","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("ALV.DE", new QuoteSymbolMetaData("ALV.DE","Allianz","840400","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("BRK-B", new QuoteSymbolMetaData("BRK-B","Berkshire Hathaway","A0YJQ2","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("BLK", new QuoteSymbolMetaData("BLK","Blackrock","928193","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("MSCI", new QuoteSymbolMetaData("MSCI","MSCI","A0M63R","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("1YL.F", new QuoteSymbolMetaData("1YL.F","Prosus","A2PRDK","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("HYQ.DE", new QuoteSymbolMetaData("HYQ.DE","Hypoport","549336","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("UNH", new QuoteSymbolMetaData("UNH","UnitedHealth Group","869561","",Industry.FINANCE_INSURANCE_HOLDING));
		symbolNameMapping.put("LMND", new QuoteSymbolMetaData("LMND","Lemonade","A2P7Z1","",Industry.FINANCE_INSURANCE_HOLDING));
		
		// Exchange
		symbolNameMapping.put("DB1.DE", new QuoteSymbolMetaData("DB1.DE","Deutsche Börse","581005","",Industry.EXCHANGE));
		symbolNameMapping.put("ICE", new QuoteSymbolMetaData("ICE","Intercontinental Exchange","A1W5H0","",Industry.EXCHANGE));
		symbolNameMapping.put("NDAQ", new QuoteSymbolMetaData("NDAQ","Nasdaq","813516","",Industry.EXCHANGE));
		
		// Payment
		symbolNameMapping.put("PYPL", new QuoteSymbolMetaData("PYPL","PayPal","A14R7U","",Industry.PAYMENT));
		symbolNameMapping.put("V", new QuoteSymbolMetaData("V","Visa","A0NC7B","",Industry.PAYMENT));
		symbolNameMapping.put("ADYEN.AS", new QuoteSymbolMetaData("ADYEN.AS","Adyen","A2JNF4","",Industry.PAYMENT));
		symbolNameMapping.put("SQ", new QuoteSymbolMetaData("SQ","Square","A143D6","",Industry.PAYMENT));
		symbolNameMapping.put("JKHY", new QuoteSymbolMetaData("JKHY","Jack Henry & Associates","888286","",Industry.PAYMENT));
		symbolNameMapping.put("FISV", new QuoteSymbolMetaData("FISV","Fiserv","881793","",Industry.PAYMENT));
		
		return symbolNameMapping;
	}
}
