package org.algo.invest.core.quotes;

import java.util.LinkedHashMap;
import java.util.Map;

import org.algo.invest.model.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;

public class FoodQuotes {

	public static Map<String, QuoteSymbolMetaData> getQuotes(){
		
		Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<String, QuoteSymbolMetaData>();
		
		// Food & Beverages
		symbolNameMapping.put("NESM.DE", new QuoteSymbolMetaData("NESM.DE","Nestle","A0Q4DC",  Industry.FOOD));
		symbolNameMapping.put("MDLZ", new QuoteSymbolMetaData("MDLZ","Mondelez","A1J4U0", Industry.FOOD));
		symbolNameMapping.put("BSN.DE", new QuoteSymbolMetaData("BSN.DE","Danone","851194", Industry.FOOD));
		symbolNameMapping.put("KHC", new QuoteSymbolMetaData("KHC","Heinz Kraft","A14TU4", Industry.FOOD));
		symbolNameMapping.put("GIS", new QuoteSymbolMetaData("GIS","General Mills","853862", Industry.FOOD));
		symbolNameMapping.put("K", new QuoteSymbolMetaData("K","Kellogg","853265", Industry.FOOD));
		symbolNameMapping.put("KO", new QuoteSymbolMetaData("KO","Coca-Cola","850663", Industry.FOOD));
		symbolNameMapping.put("PEP", new QuoteSymbolMetaData("PEP","PepsiCo","851995", Industry.FOOD));
		symbolNameMapping.put("CBGB.F", new QuoteSymbolMetaData("CBGB.F","Carlsberg","861061", Industry.FOOD));
		symbolNameMapping.put("HNK1.F", new QuoteSymbolMetaData("HNK1.F","Heineken","A0CA0G", Industry.FOOD));
		symbolNameMapping.put("TSN", new QuoteSymbolMetaData("TSN","Tyson Foods","870625", Industry.FOOD));
		symbolNameMapping.put("PND.F", new QuoteSymbolMetaData("PND.F","Mowi Asa","A2PBD2", Industry.FOOD));
		symbolNameMapping.put("BYND", new QuoteSymbolMetaData("BYND","Beyond Meat","A2N7XQ", Industry.FOOD));
		
		// Food Delivery
		symbolNameMapping.put("DPZ", new QuoteSymbolMetaData("DPZ","Dominos","A0B6VQ", Industry.FOOD_DELIVERY));
		symbolNameMapping.put("0OC.F", new QuoteSymbolMetaData("0OC.F","Ocado","A1C2GZ", Industry.FOOD_DELIVERY));
		symbolNameMapping.put("SYY", new QuoteSymbolMetaData("SYY","Sysco","859121", Industry.FOOD_DELIVERY));
		symbolNameMapping.put("HFG.DE", new QuoteSymbolMetaData("HFG.DE","Hello Fresh","A16140", Industry.FOOD_DELIVERY));
		symbolNameMapping.put("DHER.DE", new QuoteSymbolMetaData("DHER.DE","Delivery Hero","A2E4K4", Industry.FOOD_DELIVERY));
		
		// Gastronomy
		symbolNameMapping.put("SBUX", new QuoteSymbolMetaData("SBUX","Starbucks","884437", Industry.GASTRONOMY));
		symbolNameMapping.put("CMG", new QuoteSymbolMetaData("CMG","Chipotle","A0ESP5", Industry.GASTRONOMY));
		symbolNameMapping.put("CAKE", new QuoteSymbolMetaData("CAKE","Cheesecake Factory","884888", Industry.GASTRONOMY));
		symbolNameMapping.put("MCD", new QuoteSymbolMetaData("MCD","McDonalds","856958", Industry.GASTRONOMY));
		symbolNameMapping.put("QSR", new QuoteSymbolMetaData("QSR","Restaurant Brands Int.","A12GMA", Industry.GASTRONOMY));
		symbolNameMapping.put("YUM", new QuoteSymbolMetaData("YUM","Yum! Brands","909190", Industry.GASTRONOMY));
		symbolNameMapping.put("DNKN", new QuoteSymbolMetaData("DNKN","Dunkin Brands","A1JHGA", Industry.GASTRONOMY));
		symbolNameMapping.put("TXRH", new QuoteSymbolMetaData("TXRH","Texas Roadhouse","A0DKNQ", Industry.GASTRONOMY));
		
		return symbolNameMapping;
	}
}
