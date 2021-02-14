package org.algo.invest.dto

import org.algo.invest.model.QuoteType

data class QuoteDto (
    val symbol: String? = null,
    val name: String? = null,
    val wkn: String? = null,
    val price: Float = 0f,
    val dayChange: Float = 0f,
    val dayChangePercent: Float = 0f,
    val currency: String? = null,
    val exchange: String? = null,
    val marketCap: Long = 0,
    val fiftyDayAverage: Float = 0f,
    val fiftyDayAverageChangePercent: Float = 0f,
    val twoHundredDayAverage: Float = 0f,
    val twoHundredDayAverageChangePercent: Float = 0f,
    val fiftyTwoWeekHigh: Float = 0f,
    val fiftyTwoWeekHighChangePercent: Float = 0f,
    val fiftyTwoWeekLow: Float = 0f,
    val fiftyTwoWeekLowChangePercent: Float = 0f,
    val quoteType: QuoteType? = null,
    val chartData: List<ChartDataDto>? = null
)