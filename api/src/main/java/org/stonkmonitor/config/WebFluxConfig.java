package org.stonkmonitor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeStrategies;

@Configuration
public class WebFluxConfig {

    @Bean
    public ExchangeStrategies exchangeStrategies() {
        return ExchangeStrategies.builder()
            .codecs(config -> config.defaultCodecs().maxInMemorySize(1024 * 1024)).build();
    }
}
