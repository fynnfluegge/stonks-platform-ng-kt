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
  premarket: number;
  price: number;
  dayChange: number;
  dayChangePercent: number;
  marketCap: number;
  fiftyDayAverage: number;
  fiftyDayAverageChangePercent: number;
  twoHundredDayAverage: number;
  twoHundredDayAverageChangePercent: number;
  fiftyTwoWeekHigh: number;
  fiftyTwoWeekHighChangePercent: number;
  fiftyTwoWeekLow: number;
  fiftyTwoWeekLowChangePercent: number;
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
