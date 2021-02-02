package org.algo.invest.core.quotes;

import java.util.LinkedHashMap;
import java.util.Map;

import org.algo.invest.model.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;

public class MobilityQuotes {

public static Map<String, QuoteSymbolMetaData> getQuotes(){
		
	Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<String, QuoteSymbolMetaData>();
		
		// Raum-/Luftfahrt & Reise
		symbolNameMapping.put("MTX.F", new QuoteSymbolMetaData("MTX.F","MTU","A0D9PT","", Industry.AEROSPACE_TRAVEL));
		symbolNameMapping.put("FRA.DE", new QuoteSymbolMetaData("FRA.DE","Fraport","577330","",Industry.AEROSPACE_TRAVEL));
		symbolNameMapping.put("AIR.DE", new QuoteSymbolMetaData("AIR.DE","Airbus","938914","",Industry.AEROSPACE_TRAVEL));
		symbolNameMapping.put("BA", new QuoteSymbolMetaData("BA","Boeing","850471","",Industry.AEROSPACE_TRAVEL));
		symbolNameMapping.put("AAL", new QuoteSymbolMetaData("AAL","American Airlines","A1W97M","",Industry.AEROSPACE_TRAVEL));
		symbolNameMapping.put("BKNG", new QuoteSymbolMetaData("BKNG","Booking Holdings","A2JEXP","",Industry.AEROSPACE_TRAVEL));
		symbolNameMapping.put("TUI1.DE", new QuoteSymbolMetaData("TUI1.DE","TUI","TUAG00","",Industry.AEROSPACE_TRAVEL));
		
		// Car Rental
		symbolNameMapping.put("UBER", new QuoteSymbolMetaData("UBER","Uber","A2PHHG","",Industry.CAR_RENTAL));
		symbolNameMapping.put("LYFT", new QuoteSymbolMetaData("LYFT","Lyft","A2PE38","",Industry.CAR_RENTAL));
		symbolNameMapping.put("SIX3.DE", new QuoteSymbolMetaData("SIX3.DE","Sixt","723132","",Industry.CAR_RENTAL));
		symbolNameMapping.put("1GU.F", new QuoteSymbolMetaData("1GU.F","Grubhub","A1XE9Z","",Industry.CAR_RENTAL));
		
		// Automobil
		symbolNameMapping.put("TSLA", new QuoteSymbolMetaData("TSLA","Tesla","A1CX3T","",Industry.AUTOMOBILE));
		symbolNameMapping.put("VOW3.DE", new QuoteSymbolMetaData("VOW3.DE","VW","766403","",Industry.AUTOMOBILE));
		symbolNameMapping.put("DAI.DE", new QuoteSymbolMetaData("DAI.DE","Daimler","710000","",Industry.AUTOMOBILE));
		symbolNameMapping.put("BMW3.DE", new QuoteSymbolMetaData("BMW3.DE","BMW","519000","",Industry.AUTOMOBILE));
		symbolNameMapping.put("NIO", new QuoteSymbolMetaData("NIO","Nio","A2N4PB","",Industry.AUTOMOBILE));
		symbolNameMapping.put("NIU", new QuoteSymbolMetaData("NIU","Niu","867147","",Industry.AUTOMOBILE));
		symbolNameMapping.put("TM", new QuoteSymbolMetaData("TM","Toyota","853510","",Industry.AUTOMOBILE));
		symbolNameMapping.put("VOL1.F", new QuoteSymbolMetaData("VOL1.F","Volvo","871229","",Industry.AUTOMOBILE));
		
		return symbolNameMapping;
	}
}
