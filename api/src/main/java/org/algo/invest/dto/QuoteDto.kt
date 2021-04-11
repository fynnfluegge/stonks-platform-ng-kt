package org.algo.invest.dto

import org.algo.invest.model.QuoteType
import java.util.*

data class QuoteDto (
    val subIndustry: String? = null,
    val symbol: String? = null,
    val name: String? = null,
    val wkn: String? = null,
    val currency: String? = null,
    val marketCap: Long = 0,
    val priceToBookRatio: Float = 0f,

    val preMarketChange: Float = 0f,
    val preMarketChangePercent: Float = 0f,
    val postMarketChange: Float = 0f,
    val postMarketChangePercent: Float= 0f,

    val price: Float = 0f,
    val dayChange: Float = 0f,
    val dayChangePercent: Float = 0f,
    val fiftyDayAverage: Float = 0f,
    val fiftyDayAverageChangePercent: Float = 0f,
    val twoHundredDayAverage: Float = 0f,
    val twoHundredDayAverageChangePercent: Float = 0f,
    val fiftyTwoWeekHigh: Float = 0f,
    val fiftyTwoWeekHighChangePercent: Float = 0f,
    val fiftyTwoWeekLow: Float = 0f,
    val fiftyTwoWeekLowChangePercent: Float = 0f,

    val earningsDate: String? = null,
    val trailingPE: Float = 0f,
    val forwardPE: Float = 0f,
    val epsTrailingTwelveMonths: Float = 0f,
    val epsForward: Float = 0f,
    val epsCurrentYear: Float = 0f,
    val priceEpsCurrentYear: Float = 0f,
    val trailingAnnualDividendYield: Float = 0f,
    val sharesOutstanding: Long = 0,
    val averageAnalystRating: String? = null,

    val quoteType: QuoteType? = null,
    val chartData: List<ChartDataDto>? = null
)

data class ChartDataDto (
    val data: MutableList<HistoricalDayCandle>? = null
)

data class HistoricalDayCandle (
    var open: Float,
    val low: Float,
    val high: Float,
    val close: Float
)