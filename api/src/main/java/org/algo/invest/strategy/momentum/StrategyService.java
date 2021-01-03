package org.algo.invest.strategy.momentum;

import lombok.extern.log4j.Log4j2;
import org.algo.invest.controller.RealtimeMarketDataController;
import org.algo.invest.model.QuoteRecord;
import org.springframework.stereotype.Service;
import yahoofinance.histquotes.HistoricalQuote;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

@Log4j2
@Service
public class StrategyService {

    final RealtimeMarketDataController realtimeMarketDataController;

    public StrategyService(RealtimeMarketDataController realtimeMarketDataController) {
        this.realtimeMarketDataController = realtimeMarketDataController;
    }

    public void getMomentumIndicator(String quote) {
        Map<Calendar, HistoricalQuote> history = realtimeMarketDataController.getHistoryQuotes().get(quote);
                
    }
}
