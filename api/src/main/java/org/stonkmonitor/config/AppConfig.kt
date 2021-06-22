package org.stonkmonitor.config

import org.stonkmonitor.model.QuoteSymbolMetaData
import org.springframework.stereotype.Component
import org.stonkmonitor.adapter.`in`.spreadsheets.GoogleSpreadSheetService
import java.util.*

@Component
class AppConfig(
    googleSpreadSheetService: GoogleSpreadSheetService
) {
    val allQuoteSymbolsUrl: String
    val quoteSymbolMetaData: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap<String, QuoteSymbolMetaData>()

    init {
        googleSpreadSheetService.getAllSymbols().forEach{
            quoteSymbolMetaData.putIfAbsent(it.symbol, it)
        }
        allQuoteSymbolsUrl = java.lang.String.join(",", quoteSymbolMetaData.keys)
    }
}