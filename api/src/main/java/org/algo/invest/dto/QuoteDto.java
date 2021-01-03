package org.algo.invest.dto;

import java.util.List;

import org.algo.invest.model.QuoteRecord.QuoteType;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class QuoteDto {

	private String symbol;
	private String name;
	private String wkn;
	private String url;
	private String country;
	private float price;
	private float dayChange;
	private float dayChangePercent;
	private String currency;
	private String exchange;
	private long marketCap;
	private float fiftyDayAverage;
	private float fiftyDayAverageChangePercent;
	private float twoHundredDayAverage;
	private float twoHundredDayAverageChangePercent;
	private float fiftyTwoWeekHigh;
	private float fiftyTwoWeekHighChangePercent;
	private float fiftyTwoWeekLow;
	private float fiftyTwoWeekLowChangePercent;
	private QuoteType quoteType;
	private List<ChartDataDto> chartData;
}
