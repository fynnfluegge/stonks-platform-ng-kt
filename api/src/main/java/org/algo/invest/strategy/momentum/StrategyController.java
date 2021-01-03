package org.algo.invest.strategy.momentum;

import org.algo.invest.controller.RealtimeMarketDataController;
import org.algo.invest.core.AppConfig;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@Component
@CrossOrigin({"http://localhost:4200", "http://18.156.73.56:3000"})
public class StrategyController {

    final AppConfig appConfig;

    final RealtimeMarketDataController realtimeMarketDataController;

    public StrategyController(AppConfig appConfig, RealtimeMarketDataController realtimeMarketDataController) {
        this.appConfig = appConfig;
        this.realtimeMarketDataController = realtimeMarketDataController;
    }
}
