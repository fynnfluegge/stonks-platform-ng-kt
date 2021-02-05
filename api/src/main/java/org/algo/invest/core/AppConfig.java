package org.algo.invest.core;

import java.util.*;

import org.algo.invest.core.quotes.ChinaQuotes;
import org.algo.invest.core.quotes.EnergyQuotes;
import org.algo.invest.core.quotes.EtfQuotes;
import org.algo.invest.core.quotes.FinanceQuotes;
import org.algo.invest.core.quotes.FoodQuotes;
import org.algo.invest.core.quotes.HealthQuotes;
import org.algo.invest.core.quotes.IndustryQuotes;
import org.algo.invest.core.quotes.MediaQuotes;
import org.algo.invest.core.quotes.MobilityQuotes;
import org.algo.invest.core.quotes.RetailQuotes;
import org.algo.invest.core.quotes.TechQuotes;
import org.algo.invest.model.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class AppConfig {

	@Getter
	private final String YAHOO_FINANCE_QUOTE_URL = "https://query1.finance.yahoo.com/v7/finance/quote";
	
	@Getter
	private String allQuoteSymbolsUrl;

	@Getter
	private Map<Industry, String> quoteSymbolUrls = new HashMap();
	
	@Getter
	private List<String> allQuoteSymbols = new ArrayList<>();

	@Getter
	public Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<>();
	
	@Getter
	private TechQuotes techQuotes;
	
	public AppConfig() {
		System.setProperty("yahoofinance.histquotes2.enabled", "false");
		techQuotes = new TechQuotes();
		addSymbolNameMappings();
		allQuoteSymbolsUrl = String.join(",",symbolNameMapping.keySet());
	}
	
	private void addSymbolNameMappings() {

		// Indices & Currencies
		symbolNameMapping.put("EURUSD=X", new QuoteSymbolMetaData("EURUSD=X","EUR/USD","","",Industry.NONE));
		symbolNameMapping.put("USDCNY=X", new QuoteSymbolMetaData("USDCNY=X","USD/CNY","","",Industry.NONE));
		symbolNameMapping.put("BTC-USD", new QuoteSymbolMetaData("BTC-USD","BTC/USD","","",Industry.NONE));
		symbolNameMapping.put("GC=F", new QuoteSymbolMetaData("GC=F","GOLD/USD","","",Industry.NONE));
		symbolNameMapping.put("CL=F", new QuoteSymbolMetaData("CL=F","Crude Oil/USD","","",Industry.NONE));
		symbolNameMapping.put("^VIX", new QuoteSymbolMetaData("^VIX","Volatility Index","","",Industry.NONE));
		symbolNameMapping.put("^GDAXI", new QuoteSymbolMetaData("^GDAXI","DAX","","",Industry.NONE));
		symbolNameMapping.put("^MDAXI", new QuoteSymbolMetaData("^MDAXI","MDAX","","",Industry.NONE));
		symbolNameMapping.put("^SDAXI", new QuoteSymbolMetaData("^SDAXI","SDAX","","",Industry.NONE));
		symbolNameMapping.put("^TECDAX", new QuoteSymbolMetaData("^TECDAX","TecDAX","","",Industry.NONE));
		symbolNameMapping.put("^DJI", new QuoteSymbolMetaData("^DJI","Dow Jones","","",Industry.NONE));
		symbolNameMapping.put("^IXIC", new QuoteSymbolMetaData("^IXIC","Nasdaq Comp","","",Industry.NONE));
		symbolNameMapping.put("^NDX", new QuoteSymbolMetaData("^NDX","Nasdaq 100","","",Industry.NONE));
		symbolNameMapping.put("^NDXT", new QuoteSymbolMetaData("^NDXT","Nasdaq 100 Tech","","",Industry.NONE));
		symbolNameMapping.put("^GSPC", new QuoteSymbolMetaData("^GSCP","S&P 500","","",Industry.NONE));
		symbolNameMapping.put("NQ=F", new QuoteSymbolMetaData("NQ=F","Nasdaq 100 Future","","",Industry.NONE));
		symbolNameMapping.put("YM=F", new QuoteSymbolMetaData("YM=F","Dow Jones Future","","",Industry.NONE));
		symbolNameMapping.put("ES=F", new QuoteSymbolMetaData("ES=F","S&P 500 Future","","",Industry.NONE));
		symbolNameMapping.put("^N225", new QuoteSymbolMetaData("^N225","Nikkei","","",Industry.NONE));
		symbolNameMapping.put("000001.SS", new QuoteSymbolMetaData("000001.SS","Shanghai Comp","","",Industry.NONE));
		symbolNameMapping.put("^HSI", new QuoteSymbolMetaData("^HSI","Hang Seng HK","","",Industry.NONE));
		symbolNameMapping.put("^HSCE", new QuoteSymbolMetaData("^HSCE","Hang Seng China","","",Industry.NONE));

		symbolNameMapping.putAll(EtfQuotes.getQuotes());
		symbolNameMapping.putAll(techQuotes.getQuotes().get(Industry.FANG));
		symbolNameMapping.putAll(techQuotes.getSymbolNameMapping());
		symbolNameMapping.putAll(HealthQuotes.getQuotes());
		symbolNameMapping.putAll(FoodQuotes.getQuotes());
		symbolNameMapping.putAll(RetailQuotes.getQuotes());
		symbolNameMapping.putAll(FinanceQuotes.getQuotes());
		symbolNameMapping.putAll(IndustryQuotes.getQuotes());
		symbolNameMapping.putAll(MobilityQuotes.getQuotes());
		symbolNameMapping.putAll(EnergyQuotes.getQuotes());
		symbolNameMapping.putAll(MediaQuotes.getQuotes());
		symbolNameMapping.putAll(ChinaQuotes.getQuotes());
	}
}
