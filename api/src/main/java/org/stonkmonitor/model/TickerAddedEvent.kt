package org.stonkmonitor.model

import org.springframework.context.ApplicationEvent

class TickerAddedEvent(source: Any, val ticker: QuoteSymbolMetaData) : ApplicationEvent(source) {
}