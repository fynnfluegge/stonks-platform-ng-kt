package org.algo.invest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuoteRecord {

	private boolean refresh;
	private String region;
	private QuoteType quoteType;
	private Industry industry;
	private String symbol;// "APC.DE"
	private String currency; //"EUR",
	private float regularMarketDayLow;
	private long regularMarketVolume;
	private float regularMarketPreviousClose;
	private float bid;
	private float ask;
	private int bidSize;
	private int askSize;
	private String fullExchangeName;
	private String financialCurrency;
	private float regularMarketOpen;
	private long averageDailyVolume3Month;
	private long averageDailyVolume10Day;
	private float fiftyTwoWeekLowChange;
	private float fiftyTwoWeekLowChangePercent;
	private String fiftyTwoWeekRange;
	private float fiftyTwoWeekHighChange;
	private float fiftyTwoWeekHighChangePercent;
	private float fiftyTwoWeekLow;
	private float fiftyTwoWeekHigh;
	private float trailingAnnualDividendRate;
	private float trailingPE;
	private float trailingAnnualDividendYield;
	private float epsTrailingTwelveMonths;
	private long sharesOutstanding;
	private float bookValue;
	private float fiftyDayAverage;
	private float fiftyDayAverageChange;
	private float fiftyDayAverageChangePercent;
	private float twoHundredDayAverage;
	private float twoHundredDayAverageChange;
	private String underlyingSymbol; //"APC.F"
	private String exchange; // "FRA",
	private String shortName; // "APPLE INC.",
	private String longName; // "Apple Inc.",
	private String messageBoardId; // "finmb_24937",
	private String exchangeTimezoneName; // "Europe/Berlin",
	private String exchangeTimezoneShortName; // "CEST",
	private long gmtOffSetMilliseconds; // 7200000,
	private String market; // "dr_market",
	private boolean esgPopulated;
	private String marketState; // "REGULAR",
	private float twoHundredDayAverageChangePercent;
	private long marketCap;
	private float priceToBook;
	private int sourceInterval;
	private int exchangeDataDelayedBy;
	private boolean tradeable;
	private int priceHint;
	private long firstTradeDateMilliseconds;
	private float regularMarketChange;
	private float regularMarketChangePercent;
	private long regularMarketTime;
	private float regularMarketPrice;
	private float regularMarketDayHigh;
	private String regularMarketDayRange;
	
	public enum QuoteType{
		EQUITY,
		CURRENCY,
		CRYPTOCURRENCY,
		INDEX,
		ETF,
		FUTURE
	}
	
	public enum Industry{
		NONE,
		FANG,
		TECH_MANUFACTURING,
		SEMICONDUCTOR,
		MEDIA,
		ECOMMERCE,
		SOFTWARE,
		ITSERVICES,
		CLOUD,
		SECURITY,
		GAMES,
		GASTRONOMY,
		INDUSTRIAL_MANUFACTURING,
		MATERIALS_CHEMICALS,
		COMMUNICATION,
		REALESTATE_CONSTRUCTION,
		FINANCE_INSURANCE_HOLDING,
		EXCHANGE,
		PHARMA,
		MEDTECH,
		MEDSOFTWARE,
		BIOTECH,
		FOOD,
		FOOD_DELIVERY,
		RETAIL,
		CONSUMER_CONGLOMERATE,
		DRESS_SPORTS,
		ENERGY,
		RENEWABLE_ENERGY,
		AKKU,
		AEROSPACE_TRAVEL,
		AUTOMOBILE,
		PAYMENT,
		CAR_RENTAL,
		RECYCLING,
		CHINA
	}
}
