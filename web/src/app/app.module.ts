// import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
// import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
// import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogModule } from '@angular/material/dialog';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatSliderModule } from '@angular/material/slider';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatTooltipModule } from '@angular/material/tooltip';
import { PlatformModule } from '@angular/cdk/platform';
import { ChartsModule } from 'ng2-charts';
import { NgbdSortableHeaderDirective } from './directive/sortable/sortableheader.component';
import { BaseTableComponent, DialogOverviewExampleDialogComponent } from './component/base-table/base-table.component';
import { OverviewComponent } from './component/overview/overview.component';
import { TechComponent } from './component/tech/tech.component';
import { HealthComponent } from './component/health/health.component';
import { FinanceComponent } from './component/finance/finance.component';
import { RetailComponent } from './component/retail/retail.component';
import { FoodComponent } from './component/food/food.component';
import { IndustryComponent } from './component/industry/industry.component';
import { MobilityComponent } from './component/mobility/mobility.component';
import { MediaComponent } from './component/media/media.component';
import { EnergyComponent } from './component/energy/energy.component';
import { PerformanceComponent } from './component/performance/performance.component';
import { OtherComponent } from './component/misc/misc.component';

@NgModule({
  declarations: [
    AppComponent,
    NgbdSortableHeaderDirective,
    DialogOverviewExampleDialogComponent,
    BaseTableComponent,
    OverviewComponent,
    MediaComponent,
    TechComponent,
    HealthComponent,
    FinanceComponent,
    RetailComponent,
    FoodComponent,
    IndustryComponent,
    MobilityComponent,
    MediaComponent,
    EnergyComponent,
    PerformanceComponent,
    OtherComponent,
  ],
  imports: [
    // BrowserModule,
    // NgbModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    // BrowserAnimationsModule,
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
    PlatformModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents: [
    DialogOverviewExampleDialogComponent
  ]
})
export class AppModule { }
