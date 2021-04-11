import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogModule } from '@angular/material/dialog';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatSliderModule } from '@angular/material/slider';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatTooltipModule } from '@angular/material/tooltip';
import { MatExpansionModule } from '@angular/material/expansion';
import { MatCardModule } from '@angular/material/card';
import { PlatformModule } from '@angular/cdk/platform';
import { ChartsModule } from 'ng2-charts';
import { NgbdSortableHeaderDirective } from './directive/sortable/sortableheader.component';
import { BaseTableComponent } from './component/base-table/base-table.component';
import { DialogChartComponent } from './component/dialog-chart/dialog-chart.component'
import { PerformanceComponent } from './component/performance/performance.component';
import { NgApexchartsModule } from "ng-apexcharts";
import { CardsTableComponent } from './component/cards-table/cards-table.component';

@NgModule({
  declarations: [
    AppComponent,
    NgbdSortableHeaderDirective,
    DialogChartComponent,
    BaseTableComponent,
    PerformanceComponent,
    CardsTableComponent
  ],
  imports: [
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatSidenavModule,
    MatListModule,
    MatButtonModule,
    MatIconModule,
    MatTableModule,
    MatDialogModule,
    MatTooltipModule,
    MatSliderModule,
    ChartsModule,
    PlatformModule,
    MatExpansionModule,
    MatCardModule,
    NgApexchartsModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents: [
    DialogChartComponent
  ]
})
export class AppModule { }
