package org.stonkmonitor.config

import org.springframework.context.ApplicationEventPublisher
import org.springframework.scheduling.annotation.Scheduled
import org.stonkmonitor.model.QuoteSymbolMetaData
import org.springframework.stereotype.Component
import org.stonkmonitor.adapter.`in`.spreadsheets.GoogleSpreadSheetService
import org.stonkmonitor.model.TickerAddedEvent
import java.util.*

@Component
class AppConfig(
    private val googleSpreadSheetService: GoogleSpreadSheetService,
    private val applicationEventPublisher: ApplicationEventPublisher
) {
    var allQuoteSymbolsUrl: String
    val quoteSymbolMetaData: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap<String, QuoteSymbolMetaData>()

    init {
        googleSpreadSheetService.getAllSymbols().forEach{
            quoteSymbolMetaData.putIfAbsent(it.symbol, it)
        }
        allQuoteSymbolsUrl = java.lang.String.join(",", quoteSymbolMetaData.keys)
    }

    @Scheduled(fixedRate = 300000, initialDelay = 300000)
    fun updateSpreadSheetsTickers() {
        googleSpreadSheetService.getAllSymbols().forEach{
            if (!quoteSymbolMetaData.containsKey(it.symbol)){
                applicationEventPublisher.publishEvent(TickerAddedEvent(this, it));
            }
        }
    }
}