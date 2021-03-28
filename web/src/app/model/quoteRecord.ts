export interface QuoteRecord {
  symbol: string;
  wkn: string;
  subIndustry: string,
  country: string;
  name: string;
  currency: string;
  exchange: string;
  quoteType: string;
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
}

export interface HistoricalDayCandle {
  open: number,
  low: number,
  high: number,
  close: number
}
