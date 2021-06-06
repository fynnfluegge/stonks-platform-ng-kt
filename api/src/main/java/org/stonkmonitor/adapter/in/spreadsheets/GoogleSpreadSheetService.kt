package org.stonkmonitor.adapter.`in`.spreadsheets

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.ExchangeStrategies
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.util.UriBuilder
import org.stonkmonitor.adapter.`in`.yahoo.log
import org.stonkmonitor.model.Industry
import reactor.core.publisher.Mono
import java.util.*


@Service
class GoogleSpreadSheetService(
    @Value("\${google.spreadsheet.id}") spreadSheetId: String,
    @Value("\${google.spreadsheets.url}") url: String,
    @Value("\${google.cloud.api.key}") apiKey: String,
    webClientBuilder: WebClient.Builder,
    exchangeStrategies: ExchangeStrategies,
) {

    private val webClient: WebClient = webClientBuilder
        .baseUrl(url)
        .exchangeStrategies(exchangeStrategies)
        .build()

    init {
        Industry.values().forEach {
            Objects.requireNonNull(webClient
                .get()
                .uri { uriBuilder: UriBuilder ->
                    uriBuilder.path("/$spreadSheetId/values/${it.name}!A:C")
                        .queryParam("key", apiKey).build()
                }
                .retrieve()
                .bodyToMono(SpreadSheetDto::class.java).block()).values.forEach { log.info(it.component1()) }
        }
    }
}