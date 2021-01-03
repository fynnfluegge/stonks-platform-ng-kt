package org.algo.invest.controller;

import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.algo.invest.core.AppConfig;
import org.algo.invest.model.QuoteRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import yahoofinance.histquotes.HistoricalQuote;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class RealtimeMarketDataController {

	@Getter
	private Map<String, QuoteRecord> realtimeStockRecords = new ConcurrentHashMap<>();
	
	@Getter
	private Map<String, Map<Calendar, HistoricalQuote>> historyQuotes = new ConcurrentHashMap<>();

	@Autowired
	AppConfig appconfig;

	@PostConstruct
	public void init() {
		
		for (String vSymbol : appconfig.getSymbolNameMapping().keySet()) {
			realtimeStockRecords.put(vSymbol, QuoteRecord.builder().build());
		}
	}
}
