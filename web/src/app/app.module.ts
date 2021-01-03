import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule, MatIconModule, MatSidenavModule,
         MatListModule, MatButtonModule, MatTableModule, MatDialogModule, MatTooltipModule,
         MatSliderModule } from '@angular/material';
import { PlatformModule } from '@angular/cdk/platform';
import { ChartsModule } from 'ng2-charts';
import { EtfOverviewComponent } from './component/overview/etf.component';
import { OverviewComponent } from './component/overview/overview.component';
import { NgbdSortableHeaderDirective } from './directive/sortable/sortableheader.component';
import { IndicesOverviewComponent } from './component/overview/indices.component';
import { BaseTableComponent, DialogOverviewExampleDialogComponent } from './component/base-table/base-table.component';
import { BigtechOverviewComponent } from './component/tech/bigtech.component';
import { TechmanufacturingComponent } from './component/tech/techmanufacturing.component';
import { SemiconductorComponent } from './component/tech/semiconductor.component';
import { EcommerceComponent } from './component/retail/ecommerce.component';
import { SoftwareTableComponent } from './component/tech/software.component';
import { GamesComponent } from './component/media/games.component';
import { GastronomyComponent } from './component/food/gastronomy.component';
import { IndustrialComponent } from './component/industry/industrial.component';
import { MatchemComponent } from './component/industry/matchem.component';
import { CommunicationComponent } from './component/industry/communication.component';
import { RealestateComponent } from './component/industry/realestate.component';
import { PharmaComponent } from './component/health/pharma.component';
import { BiotechComponent } from './component/health/biotech.component';
import { ConsumerComponent } from './component/retail/consumer.component';
import { SportsComponent } from './component/retail/sports.component';
import { EnergyTableComponent } from './component/energy/energy-table.component';
import { AerospaceComponent } from './component/mobility/aerospace.component';
import { AutomobileComponent } from './component/mobility/automobile.component';
import { PaymentComponent } from './component/finance/payment.component';
import { MobilityTableComponent } from './component/mobility/mobility-table.component';
import { PersonalComponent } from './component/industry/personal.component';
import { TechComponent } from './component/tech/tech.component';
import { HealthComponent } from './component/health/health.component';
import { FinanceComponent } from './component/finance/finance.component';
import { FinanceTableComponent } from './component/finance/finance-table.component';
import { RetailComponent } from './component/retail/retail.component';
import { IndustryComponent } from './component/industry/industry.component';
import { MobilityComponent } from './component/mobility/mobility.component';
import { MediaComponent } from './component/media/media.component';
import { MediaTableComponent } from './component/media/media-table.component';
import { CloudhostingComponent } from './component/tech/cloudhosting.component';
import { MedtechComponent } from './component/health/medtech.component';
import { FoodComponent } from './component/food/food.component';
import { RetailTableComponent } from './component/retail/retail-table.component';
import { FoodTableComponent } from './component/food/food-table.component';
import { RenewableEnergyComponent } from './component/energy/renewable-energy.component';
import { RecyclingComponent } from './component/industry/recycling.component';
import { EnergyComponent } from './component/energy/energy.component';
import { PerformanceComponent } from './component/performance/performance.component';
import { DailyOutperformerComponent } from './component/performance/daily-outperformer.component';
import { DailyUnderperformerComponent } from './component/performance/daily-underperformer.component';
import { FiftydayUnderperformerComponent } from './component/performance/fiftyday-underperformer.component';
import { FiftydayOutperformerComponent } from './component/performance/fiftyday-outperformer.component';
import { TwohundreddayOutperformerComponent } from './component/performance/twohundredday-outperformer.component';
import { TwohundreddayUnderperformerComponent } from './component/performance/twohundredday-underperformer.component';
import { ItservicesComponent } from './component/tech/itservices.component';
import { MedsoftwareComponent } from './component/health/medsoftware.component';
import { ExchangeComponent } from './component/finance/exchange.component';
import { DeliveryComponent } from './component/food/delivery.component';
import { ChinaComponent } from './component/misc/china.component';
import { OtherComponent } from './component/misc/misc.component';
import { AkkuComponent } from './component/energy/akku.component';
import { SavingsComponent } from './component/savings/savings.component';
import { ComdirectComponent } from './component/savings/comdirect.component';

@NgModule({
  declarations: [
    AppComponent,
    EtfOverviewComponent,
    OverviewComponent,
    NgbdSortableHeaderDirective,
    IndicesOverviewComponent,
    BaseTableComponent,
    BigtechOverviewComponent,
    TechmanufacturingComponent,
    SemiconductorComponent,
    MediaComponent,
    EcommerceComponent,
    SoftwareTableComponent,
    GamesComponent,
    GastronomyComponent,
    IndustrialComponent,
    MatchemComponent,
    CommunicationComponent,
    RealestateComponent,
    FinanceTableComponent,
    PharmaComponent,
    BiotechComponent,
    ConsumerComponent,
    SportsComponent,
    AerospaceComponent,
    AutomobileComponent,
    PaymentComponent,
    MobilityTableComponent,
    PersonalComponent,
    TechComponent,
    HealthComponent,
    FinanceComponent,
    RetailComponent,
    IndustryComponent,
    MobilityTableComponent,
    MobilityComponent,
    MediaComponent,
    MediaTableComponent,
    CloudhostingComponent,
    MedtechComponent,
    FoodComponent,
    RetailTableComponent,
    FoodTableComponent,
    RenewableEnergyComponent,
    RecyclingComponent,
    EnergyComponent,
    EnergyTableComponent,
    PerformanceComponent,
    DailyOutperformerComponent,
    DailyUnderperformerComponent,
    FiftydayUnderperformerComponent,
    FiftydayOutperformerComponent,
    TwohundreddayOutperformerComponent,
    TwohundreddayUnderperformerComponent,
    ItservicesComponent,
    MedsoftwareComponent,
    ExchangeComponent,
    DeliveryComponent,
    ChinaComponent,
    OtherComponent,
    AkkuComponent,
    SavingsComponent,
    ComdirectComponent,
    DialogOverviewExampleDialogComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
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
    PlatformModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents: [
    DialogOverviewExampleDialogComponent
  ]
})
export class AppModule { }
