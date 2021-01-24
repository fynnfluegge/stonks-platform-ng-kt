import { Component, OnInit, QueryList, ViewChildren, Inject, OnDestroy, Input } from '@angular/core';
import { QuoteRecord } from '../../model/quoteRecord';
import { NgbdSortableHeaderDirective, SortEvent, compare } from '../../directive/sortable/sortableheader.component';
import { Color } from 'ng2-charts';
import { EventListenerService } from '../../service/eventListenerService';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { BasicRestService } from 'src/app/service/basic-rest.service';
import { HttpClient } from '@angular/common/http';
import { Subscription } from 'rxjs';
import { environment } from '../../../environments/environment';

@Component({
  selector: 'base-table',
  templateUrl: './base-table.component.html',
})
export class BaseTableComponent implements OnInit, OnDestroy {
  @Input() url: string;
  apiURL = environment.apiUrl;

  @ViewChildren(NgbdSortableHeaderDirective) headers: QueryList<NgbdSortableHeaderDirective>;

  chartOptions = {
    responsive: true,
    scales: {
      yAxes: [{
        display: false
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
          radius: 2.5
      }
    }
  };

  chartLabels = ['', '', '', '', '', '', '', '', '', '', ''];

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

  quoteRecords: QuoteRecord[] = [];
  init: boolean;
  mouseover: boolean;
  showDialog: boolean;
  data = this.quoteRecords;
  subscription: Subscription

  constructor(private quoteService: EventListenerService, private dialog: MatDialog) {
  }


  merge(element: QuoteRecord) {

      element.priceDecremented = false
      element.priceIncremented = false
      element.dayChangePercentDecremented = false
      element.dayChangePercentIncremented = false

      if (this.quoteRecords.findIndex(x => x.symbol === element.symbol) == -1) {
        this.quoteRecords.push(element);
      } else {
        const index = this.quoteRecords.findIndex(x => x.symbol === element.symbol)
        if(index > -1){
          if (this.quoteRecords[index].price < element.price) {
            this.quoteRecords[index].priceIncremented = true
          }
          if (this.quoteRecords[index].price > element.price) {
            this.quoteRecords[index].priceDecremented = true
          }
          if (this.quoteRecords[index].dayChangePercent < element.dayChangePercent) {
            this.quoteRecords[index].dayChangePercentIncremented = true
          }
          if (this.quoteRecords[index].dayChangePercent > element.dayChangePercent) {
            this.quoteRecords[index].dayChangePercentDecremented = true
          }

          this.quoteRecords[index].price = element.price
          this.quoteRecords[index].dayChangePercent = element.dayChangePercent
          this.quoteRecords[index].dayChange = element.dayChange
          this.quoteRecords[index].fiftyDayAverage = element.fiftyDayAverage
          this.quoteRecords[index].fiftyDayAverageChangePercent = element.fiftyDayAverageChangePercent
          this.quoteRecords[index].twoHundredDayAverage = element.twoHundredDayAverage
          this.quoteRecords[index].twoHundredDayAverageChangePercent = element.twoHundredDayAverageChangePercent
          this.quoteRecords[index].fiftyTwoWeekLow = element.fiftyTwoWeekLow
          this.quoteRecords[index].fiftyTwoWeekLowChangePercent = element.fiftyTwoWeekLowChangePercent
          this.quoteRecords[index].fiftyTwoWeekHigh = element.fiftyTwoWeekHigh
          this.quoteRecords[index].fiftyTwoWeekHighChangePercent = element.fiftyTwoWeekHighChangePercent
          this.quoteRecords[index].chartData = element.chartData
        }
      }
  }

  ngOnInit() {
    this.subscription = this.quoteService.observeMessages(this.apiURL + this.url)
      .subscribe(message => { this.merge(message) });
  }

  ngOnDestroy() {
    this.subscription.unsubscribe()
  }

  onSort({column, direction}: SortEvent) {

    this.headers.forEach(header => {
      if (header.sortable !== column) {
        header.direction = '';
      }
    });

    if (direction === '') {
      this.data = this.quoteRecords;
    } else {
      this.data = [...this.quoteRecords].sort((a, b) => {
        const res = compare(a[column], b[column]);
        return direction === 'asc' ? res : -res;
      });
    }
  }

  openSite(siteUrl: string) {
    window.open(siteUrl, '_blank');
  }

  openDialog(vSymbol: string): void {
      const dialogRef = this.dialog.open(DialogOverviewExampleDialogComponent, {data: { symbol: vSymbol }});
  }

  copyMessage(val: string){
    const selBox = document.createElement('textarea');
    selBox.style.position = 'fixed';
    selBox.style.left = '0';
    selBox.style.top = '0';
    selBox.style.opacity = '0';
    selBox.value = val;
    document.body.appendChild(selBox);
    selBox.focus();
    selBox.select();
    document.execCommand('copy');
    document.body.removeChild(selBox);
  }
}

export interface DialogData {
  symbol: string;
}

@Component({
  selector: 'app-dialog-overview-example-dialog',
  templateUrl: 'dialog-overview-example-dialog.html',
})
export class DialogOverviewExampleDialogComponent {
  apiURL = environment.apiUrl;  

  quoteRecord: QuoteRecord = { wkn: '', symbol: '', url: '', country: '', currency: '', dayChange: 0,
    dayChangePercent: 0, exchange: '', fiftyDayAverage: 0, fiftyDayAverageChangePercent: 0, fiftyTwoWeekHigh: 0,
    fiftyTwoWeekHighChangePercent: 0, fiftyTwoWeekLow: 0, fiftyTwoWeekLowChangePercent: 0, marketCap: 0,
    name: '', price: 0, quoteType: '', twoHundredDayAverage: 0, twoHundredDayAverageChangePercent: 0,
    dayChangePercentDecremented: false,
    dayChangePercentIncremented: false,
    priceDecremented: false,
    priceIncremented: false,
    chartData: [{ data: [] }] };

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

