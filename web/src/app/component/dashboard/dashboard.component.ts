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
  ApexAxisChartSeries,
  ApexTooltip,
} from "ng-apexcharts";
import { SectorRecord } from 'src/app/model/sectorRecord';

export type ChartOptions = {
  chart: ApexChart
  legend: ApexLegend
  plotOptions: ApexPlotOptions
  dataLabels: ApexDataLabels
  title: ApexTitleSubtitle
  series: ApexAxisChartSeries
  colors: string[],
  tooltip: ApexTooltip
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

  @ViewChild("chart") chart: ChartComponent;

  chartOptions: Partial<ChartOptions>[] = [];

  constructor(private http: HttpClient) {}

  concat(elements: SectorRecord[]) {

    var sectors: string[] = []
    var seriesData = new Map()
    var colors = new Map()

    elements.forEach(it => {
      if (sectors.indexOf(it.industry) == -1)
        sectors.push(it.industry)
    })

    sectors.forEach(it => {
      seriesData.set(it, [])
      colors.set(it, [])
    })

    elements.forEach(it => {
      var dayChangeRound: number = Math.round(it.dayChange * 100) / 100

      var series: {x: any, y: number}[] = seriesData.get(it.industry)
      series.push({
        x: it.subIndustry + ' ' + (it.dayChange >= 0.0 ? '+' : '') + dayChangeRound,
        y : it.weighting > 0.5 ? 0.5 : it.weighting < 0.1 ? 0.1 : it.weighting
      })
      var color: string[] = colors.get(it.industry)
      color.push(this.color(it.dayChange))
    })

    sectors.forEach(it => {
      this.chartOptions.push(this.chartOptionsTemplate(it, seriesData.get(it), colors.get(it)))
    })
  }

  // interpolates color related to change with two function
  // first function decreases rb (green) resp. gb (red) until a threshold to 0 color channel
  // second function decreases g (green) resp. r (red) with a gradient until a fixed color channel
  color(change: number): string {
    var threshold = 1
    var gradient = 120

    var intensity: number = Math.abs(change) <= threshold ?
      +(160 - (Math.abs(change)/1.0 * 160.0)).toFixed() :
      0

    var color = Math.abs(change) <= threshold ? 
      255 :
      this.clamp(155, 255, +(255 - (Math.abs(change)-threshold) * gradient).toFixed())

    if (change < 0.0)
      return this.rgbToHex(color, intensity, intensity)
    else
      return this.rgbToHex(intensity, color, intensity)
  }

  clamp(min: number, max: number, value: number): number {
    if (value < min)
      return min
    else if (value > max)
      return max
    else
      return value
  }

  componentToHex(c) {
    var hex = c.toString(16);
    return hex.length == 1 ? "0" + hex : hex;
  }
  
  rgbToHex(r, g, b) {
    return "#" + this.componentToHex(r) + this.componentToHex(g) + this.componentToHex(b);
  }

  ngOnInit(): void {
    this.http.get<SectorRecord[]>(this.apiURL + this.url)
      .subscribe(message => { this.concat(message) })
  }

  ngAfterViewInit() {
  }

  ngOnDestroy() {
  }

  chartOptionsTemplate(title: string, seriesData: {x: any, y: number}[], colors: string[]): Partial<ChartOptions> {
    return {
      chart: {
        toolbar: {
          show: false
        },
        height: 360,
        width: 360,
        type: 'treemap'
      },
      series: [
        {
          data: seriesData
        }
      ],
      colors: colors,
      legend: {
        show: false
      },
      tooltip: {
        custom: function({ series, seriesIndex, dataPointIndex, w }) {
          return (
            "<span style=padding:4px;>" +
            w.globals.categoryLabels[dataPointIndex] +
            "</span>"
          );
        }
      },
      title: {
        text: title,
        align: 'left',
        margin: 0,
        offsetX: -9,
        offsetY: -4,
        floating: true,
        style: {
          fontSize:  '16px',
        }
      },
      plotOptions: {
        treemap: {
          distributed: true,
          enableShades: false,
        }
      },
      dataLabels: {
        enabled: true,
        dropShadow: {
          enabled: true,
          top: 1,
          left: 1,
          blur: 1,
          color: '#000',
          opacity: 0.45
        },
        background: {
          enabled: true,
          foreColor: '#fff',
          padding: 4,
          borderRadius: 2,
          borderWidth: 10,
          borderColor: '#fff',
          opacity: 0.9,
          dropShadow: {
            enabled: true,
            top: 1,
            left: 1,
            blur: 1,
            color: '#000000',
            opacity: 1
          }
        },
        style: {
          fontSize: '16px',
        },
        offsetY: -2,
        formatter: function(val: number, opts: any) {
          return val
        }
      }
    };
  }
}
