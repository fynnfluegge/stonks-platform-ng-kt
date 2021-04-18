package org.stonkmonitor.adapter.in.comdirect;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComdirectSessionHandler {

    private String accessToken;
    private String sessionId;
    private String requestId;
}
