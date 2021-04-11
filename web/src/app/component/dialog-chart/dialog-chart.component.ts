import { Component, Inject } from '@angular/core';
import { Color } from 'ng2-charts';
import { environment } from '../../../environments/environment';
import { QuoteRecord } from '../../model/quoteRecord';
import { BasicRestService } from 'src/app/service/basic-rest.service';
import { HttpClient } from '@angular/common/http';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';

export interface DialogData {
    symbol: string;
}

@Component({
    selector: 'dialog-chart',
    templateUrl: './dialog-chart.component.html',
  })
  export class DialogChartComponent {
    apiURL = environment.apiUrl;  
  
    quoteRecord: QuoteRecord = { subIndustry: '', wkn: '', symbol: '', country: '', currency: '', dayChange: 0,
      dayChangePercent: 0, exchange: '', fiftyDayAverage: 0, fiftyDayAverageChangePercent: 0, fiftyTwoWeekHigh: 0,
      fiftyTwoWeekHighChangePercent: 0, fiftyTwoWeekLow: 0, fiftyTwoWeekLowChangePercent: 0, marketCap: 0, priceToBookRatio: 0,
      name: '', price: 0, quoteType: '', twoHundredDayAverage: 0, twoHundredDayAverageChangePercent: 0,
      preMarketChange: 0, preMarketChangePercent: 0, postMarketChange: 0, postMarketChangePercent: 0,
      trailingPE: 0, forwardPE: 0, epsTrailingTwelveMonths: 0, epsForward: 0, epsCurrentYear: 0,
      priceEpsCurrentYear: 0, trailingAnnualDividendYield: 0, sharesOutstanding: 0, averageAnalystRating: '', earningsDate: null,
      chartData: [{ data: [] }], historicalMarketClose: [{ data: [] }], apexCandleStickChartSeries: null };
  
    service: BasicRestService;
  
    constructor(public http: HttpClient, @Inject(MAT_DIALOG_DATA) public data: DialogData) {
      this.service = new BasicRestService(http, this.apiURL + '/quote/' + data.symbol);
      this.service.getQuoteRecord().subscribe(x => this.merge(x));
  
      for (let i = 0; i < 200; i++) {
        this.chartLabels.push('');
      }
    }
  
    merge(vData: QuoteRecord) {
      this.quoteRecord = vData;
      this.quoteRecord.historicalMarketClose = [{ data: vData.chartData[0].data.map(x => x.close) }]
    }
  
    formatLabel(value: number) {
      if (value >= 1000) {
        return Math.round(value / 1000) + 'k';
      }
  
      return value;
    }
  
    // tslint:disable-next-line: member-ordering
    chartOptions = {
      responsive: true,
      scales: {
        yAxes: [{
          display: true
        }],
        xAxes: [{
          display: false
        }]
      },
      animation: {
        duration: 0
      },
      elements: {
        point: {
            radius: 0
        }
      }
    };
  
    // tslint:disable-next-line: member-ordering
    chartLabels = [];
  
    // tslint:disable-next-line: member-ordering
    public greenlineChartColors: Color[] = [
      {
        backgroundColor: 'rgba(0,255,0,0.3)',
        borderColor: 'rgba(0,255,0,0.5)',
        pointBackgroundColor: 'rgba(0,255,0,1)',
        pointBorderColor: '#fff',
        pointHoverBackgroundColor: '#fff',
        pointHoverBorderColor: 'rgba(148,159,177,0.8)'
      }
    ];
  
    // tslint:disable-next-line: member-ordering
    public redlineChartColors: Color[] = [
      {
        backgroundColor: 'rgba(255,0,0,0.3)',
        borderColor: 'rgba(255,0,0,0.5)',
        pointBackgroundColor: 'rgba(255,0,0,1)',
        pointBorderColor: '#fff',
        pointHoverBackgroundColor: '#fff',
        pointHoverBorderColor: 'rgba(148,159,177,0.8)'
      }
    ];
  }