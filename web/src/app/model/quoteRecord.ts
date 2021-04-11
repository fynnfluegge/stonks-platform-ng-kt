import {
  ApexAxisChartSeries,
} from "ng-apexcharts";

export interface QuoteRecord {
  symbol: string;
  wkn: string;
  subIndustry: string,
  country: string;
  name: string;
  currency: string;
  exchange: string;
  quoteType: string;
  marketCap: number;
  priceToBookRatio: number,

  preMarketChange: number,
  preMarketChangePercent: number,
  postMarketChange: number,
  postMarketChangePercent: number,

  price: number;
  dayChange: number;
  dayChangePercent: number;
  fiftyDayAverage: number;
  fiftyDayAverageChangePercent: number;
  twoHundredDayAverage: number;
  twoHundredDayAverageChangePercent: number;
  fiftyTwoWeekHigh: number;
  fiftyTwoWeekHighChangePercent: number;
  fiftyTwoWeekLow: number;
  fiftyTwoWeekLowChangePercent: number;

  earningsDate: Date,
  trailingPE: number,
  forwardPE: number,
  epsTrailingTwelveMonths: number,
  epsForward: number,
  epsCurrentYear: number,
  priceEpsCurrentYear: number,
  trailingAnnualDividendYield: number,
  sharesOutstanding: number,
  averageAnalystRating: string,

  chartData: [
    { data: HistoricalDayCandle[] }
  ];
  historicalMarketClose:[ { data: number[] } ];
  apexCandleStickChartSeries: ApexAxisChartSeries
}

export interface HistoricalDayCandle {
  open: number,
  low: number,
  high: number,
  close: number
}
