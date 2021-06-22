package org.stonkmonitor.adapter.`in`.spreadsheets

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.ExchangeStrategies
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.util.UriBuilder
import org.stonkmonitor.model.Industry
import org.stonkmonitor.model.QuoteSymbolMetaData
import org.stonkmonitor.model.SubIndustry
import java.util.*


@Service
class GoogleSpreadSheetService(
    @Value("\${google.spreadsheets.url}")
    private val url: String,
    @Value("\${google.spreadsheet.id}")
    private val spreadSheetId: String,
    @Value("\${google.cloud.api.key}")
    private val apiKey: String,
    webClientBuilder: WebClient.Builder,
    exchangeStrategies: ExchangeStrategies
) {

    private val webClient: WebClient = webClientBuilder
        .baseUrl(url)
        .exchangeStrategies(exchangeStrategies)
        .build()

    fun getAllSymbols(): MutableList<QuoteSymbolMetaData> {
        val symbols: MutableList<QuoteSymbolMetaData> = emptyList<QuoteSymbolMetaData>().toMutableList()
        Industry.values().forEach { industry ->
            Objects.requireNonNull(webClient
                .get()
                .uri { uriBuilder: UriBuilder ->
                    uriBuilder.path("/$spreadSheetId/values/${industry.name}!A:C")
                        .queryParam("key", apiKey).build()
                }
                .retrieve()
                .bodyToMono(SpreadSheetDto::class.java).block()).values.forEach {
                    symbols.add(QuoteSymbolMetaData(symbol = it.component1().trim(), name = it.component2().trim(), industry = industry,
                        subIndustry = if (it.size > 2) SubIndustry.valueOf(it.component3().trim()) else null))
                }
        }

        return symbols
    }
}