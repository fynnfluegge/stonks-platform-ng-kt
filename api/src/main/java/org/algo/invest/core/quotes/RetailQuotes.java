package org.algo.invest.core.quotes;

import java.util.LinkedHashMap;
import java.util.Map;

import org.algo.invest.model.QuoteRecord.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;

public class RetailQuotes {

	public static Map<String, QuoteSymbolMetaData> getQuotes(){
	
		Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<String, QuoteSymbolMetaData>();
		
		// E-Commerce
		symbolNameMapping.put("SHOP", new QuoteSymbolMetaData("SHOP","Shopify","A14TJP","",Industry.ECOMMERCE));
		symbolNameMapping.put("SE", new QuoteSymbolMetaData("SE","Sea","","",Industry.ECOMMERCE));
		symbolNameMapping.put("RAK.F", new QuoteSymbolMetaData("RAK.F","Rakuten","927128","",Industry.ECOMMERCE));
		symbolNameMapping.put("ZAL.DE", new QuoteSymbolMetaData("ZAL.DE","Zalando","ZAL111","",Industry.ECOMMERCE));
		symbolNameMapping.put("H24.DE", new QuoteSymbolMetaData("H24.DE","Home24","A14KEB","",Industry.ECOMMERCE));
		symbolNameMapping.put("WEW.DE", new QuoteSymbolMetaData("WEW.DE","Westwing","A2N4H0","",Industry.ECOMMERCE));
		symbolNameMapping.put("EBAY", new QuoteSymbolMetaData("EBAY","Ebay","916529","",Industry.ECOMMERCE));
		symbolNameMapping.put("FVRR", new QuoteSymbolMetaData("FVRR","Fiverr","A2PLX6","",Industry.ECOMMERCE));
		symbolNameMapping.put("MELI", new QuoteSymbolMetaData("MELI","Mercadolibre","A0MYNP","",Industry.ECOMMERCE));
		
		// Retail
		symbolNameMapping.put("WMT", new QuoteSymbolMetaData("WMT","Walmart","860853","",Industry.RETAIL));
		symbolNameMapping.put("WBA", new QuoteSymbolMetaData("WBA","Walgreens Boots Alliance","A12HJF","",Industry.RETAIL));
		symbolNameMapping.put("TGT", new QuoteSymbolMetaData("TGT","Target","856243","",Industry.RETAIL));
		symbolNameMapping.put("FAST", new QuoteSymbolMetaData("FAST","Fastenal","887891","",Industry.RETAIL));
		symbolNameMapping.put("LOW", new QuoteSymbolMetaData("LOW","Lowes","859545","",Industry.RETAIL));
		symbolNameMapping.put("HBM.DE", new QuoteSymbolMetaData("HBM.DE","Hornbach","608440","",Industry.RETAIL));
		symbolNameMapping.put("HD", new QuoteSymbolMetaData("HD","Home Depot","866953","",Industry.RETAIL));
		
		// Konsum-/Verbrauchsgüter & Konglomerat
		symbolNameMapping.put("UL", new QuoteSymbolMetaData("UL","Unilever","A0JNE2","",Industry.CONSUMER_CONGLOMERATE));
		symbolNameMapping.put("PG", new QuoteSymbolMetaData("PG","P&G","852062","",Industry.CONSUMER_CONGLOMERATE));
		symbolNameMapping.put("MMM", new QuoteSymbolMetaData("MMM","3M","851745","",Industry.CONSUMER_CONGLOMERATE));
		symbolNameMapping.put("DHR", new QuoteSymbolMetaData("DHR","Danaher","866197","",Industry.CONSUMER_CONGLOMERATE));
		symbolNameMapping.put("BEI.DE", new QuoteSymbolMetaData("BEI.DE","Beiersdorf","520000","",Industry.CONSUMER_CONGLOMERATE));
		symbolNameMapping.put("CL", new QuoteSymbolMetaData("CL","Colgate-Palmolive","850667","",Industry.CONSUMER_CONGLOMERATE));
		symbolNameMapping.put("KMB", new QuoteSymbolMetaData("KMB","Kimberly-Clark","855178","",Industry.CONSUMER_CONGLOMERATE));
		symbolNameMapping.put("BYW6.DE", new QuoteSymbolMetaData("BYW6.DE","BayWa","519406","",Industry.CONSUMER_CONGLOMERATE));
		symbolNameMapping.put("CHD", new QuoteSymbolMetaData("CHD","Church & Dwight","864371","",Industry.CONSUMER_CONGLOMERATE));
		
		// Bekleidung Und Sportartikel
		symbolNameMapping.put("NKE", new QuoteSymbolMetaData("NKE","Nike","866993","",Industry.DRESS_SPORTS));
		symbolNameMapping.put("ADS.DE", new QuoteSymbolMetaData("ADS.DE","Adidas","A1EWWW","",Industry.DRESS_SPORTS));
		symbolNameMapping.put("06S.F", new QuoteSymbolMetaData("06S.DE","Sportsman's Warehouse","A112GA","",Industry.DRESS_SPORTS));
		symbolNameMapping.put("IXD1.DE", new QuoteSymbolMetaData("IXD1.DE","Inditex","A11873","",Industry.DRESS_SPORTS));
		symbolNameMapping.put("LULU", new QuoteSymbolMetaData("LULU","Lululemon","A0MXBY","",Industry.DRESS_SPORTS));
		symbolNameMapping.put("PTON", new QuoteSymbolMetaData("PTON","Peloton","A2PR0M","",Industry.DRESS_SPORTS));
		symbolNameMapping.put("1B9.F", new QuoteSymbolMetaData("1B9.F","Boohoo","A1XFBJ","",Industry.DRESS_SPORTS));
		symbolNameMapping.put("PLNT", new QuoteSymbolMetaData("PLNT","Planet Fitness","A14U2K","",Industry.DRESS_SPORTS));
		
		return symbolNameMapping;
	}
}
