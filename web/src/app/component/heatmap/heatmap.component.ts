import { Component, Input, AfterViewInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { environment } from '../../../environments/environment'
import { HttpClient } from '@angular/common/http';

import {
  ApexChart,
  ApexLegend,
  ApexPlotOptions,
  ApexDataLabels,
  ApexTitleSubtitle,
  ApexAxisChartSeries,
  ApexTooltip,
} from "ng-apexcharts";
import { QuoteRecord } from 'src/app/model/quoteRecord';

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
  selector: 'app-heatmap',
  templateUrl: './heatmap.component.html',
  styleUrls: ['./heatmap.component.scss']
})
export class HeatmapComponent implements AfterViewInit {
  @Input() url: string = "/quotes"
  apiURL = environment.apiUrl;

  chartOptions: Partial<ChartOptions>[] = [];

  constructor(private http: HttpClient, private route: ActivatedRoute) { }

  path: string
  ngAfterViewInit() {
    let industryParam = this.route.snapshot.queryParamMap.get('industry')

    let url = this.route.snapshot.url.join().split(',')
    this.path = "/" + url[1] 

    console.log(this.apiURL + this.url + "/tech")
    this.http.get<QuoteRecord[]>(this.apiURL + this.url + this.path).subscribe(message => { 
      this.concat(message) 
    })
  }

  concat(elements: QuoteRecord[]) {

    var series: {x: any, y: number}[] = []
    var colors: string[] = []

    var i = 0

    elements.sort(k => k.marketCap).forEach(it => {
      i++
      // WIP bad performance with many elements
      if (i < 32) {
        var dayChangeRound: number = Math.round(it.dayChangePercent * 100) / 100
        series.push({
          x: it.symbol + ' ' + (dayChangeRound >= 0.0 ? '+' : '') + dayChangeRound,
          y : it.marketCap > 1500000000000 ? 1500000000000 : it.marketCap < 10000000000 ? 10000000000 : it.marketCap
        })
        colors.push(this.color(it.dayChange))
      } 
    })

    var chartOption = this.chartOptionsTemplate("", series, colors)

    this.chartOptions.push(chartOption)

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

  chartOptionsTemplate(title: string, seriesData: {x: any, y: number}[], colors: string[]): Partial<ChartOptions> {
    return {
      chart: {
        toolbar: {
          show: false
        },
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
