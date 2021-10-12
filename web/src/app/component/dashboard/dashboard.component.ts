import { Component, OnInit, AfterViewInit, OnDestroy, Input, ViewChild } from '@angular/core';
import { environment } from '../../../environments/environment'
import { HttpClient } from '@angular/common/http';

import {
  ChartComponent,
  ApexChart,
  ApexLegend,
  ApexPlotOptions,
  ApexDataLabels,
  ApexTitleSubtitle,
  ApexAxisChartSeries
} from "ng-apexcharts";
import { SectorRecord } from 'src/app/model/sectorRecord';

export type ChartOptions = {
  chart: ApexChart
  legend: ApexLegend
  plotOptions: ApexPlotOptions
  dataLabels: ApexDataLabels
  title: ApexTitleSubtitle
  series: ApexAxisChartSeries
};

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements AfterViewInit, OnInit, OnDestroy {
  @Input() url: string = "/quote/sectors"
  @Input() initDelay: number = 0
  @Input() paging: boolean = true
  @Input() stream: boolean = true
  apiURL = environment.apiUrl;

  sectorRecords: SectorRecord[] = [];

  @ViewChild("chart") chart: ChartComponent;
  public apexChartOptions: Partial<ChartOptions>;

  constructor(private http: HttpClient) {
    this.apexChartOptions = {
      chart: {
        height: 400,
        type: 'treemap'
      },
      legend: {
        show: false
      },
      title: {
        text: 'Treemap with Color scale'
      },
      dataLabels: {
        enabled: true,
        style: {
          fontSize: '12px',
        },
        offsetY: -2,
        // formatter: function(val: number, opts: any) {
        //   return opts.value<0.0 ? val + "\n\t" + opts.value : val + "\n\t+" + opts.value
        // }
      },
      plotOptions: {
        treemap: {
          enableShades: true,
          shadeIntensity: 0.5,
          reverseNegativeShade: true,
          colorScale: {
            ranges: [
            {
              from: -5,
              to: 0,
              color: '#CD363A'
            },
            {
              from: 0.001,
              to: 5,
              color: '#52B12C'
            }
          ]
        }
      }
    },
    series: [
      {
        data: [
          {
            x: '',
            y: 0.0
          }
        ]
      }
    ]
    };
  }

  concat(element: SectorRecord[]) {
    var seriesData: {x: any, y: number}[] = []
    element.forEach(it => {
        this.sectorRecords.push(it);
        seriesData.push({
            x: it.subIndustry,
            y : it.change,
          })
      })

    this.apexChartOptions.series = [
        {
          data: seriesData
        }
    ]
  }

  ngOnInit(): void {
    this.http.get<SectorRecord[]>(this.apiURL + this.url)
      .subscribe(message => { this.concat(message) })
  }

  ngAfterViewInit() {
  }

  ngOnDestroy() {
  }

}
