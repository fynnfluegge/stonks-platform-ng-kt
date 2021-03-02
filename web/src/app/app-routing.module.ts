import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { OverviewComponent } from './component/overview/overview.component';
import { TechComponent } from './component/tech/tech.component';
import { HealthComponent } from './component/health/health.component';
import { FinanceComponent } from './component/finance/finance.component';
import { RetailComponent } from './component/retail/retail.component';
import { IndustryComponent } from './component/industry/industry.component';
import { MobilityComponent } from './component/mobility/mobility.component';
import { MediaComponent } from './component/media/media.component';
import { FoodComponent } from './component/food/food.component';
import { EnergyComponent } from './component/energy/energy.component';
import { PerformanceComponent } from './component/performance/performance.component';
import { OtherComponent } from './component/misc/misc.component';
import { WatchlistComponent } from './component/misc/watchlist.component';


const routes: Routes = [
  { path: '', component: OverviewComponent },
  { path: 'indices', component: OverviewComponent },
  { path: 'tech', component: TechComponent },
  { path: 'health', component: HealthComponent },
  { path: 'finance', component: FinanceComponent },
  { path: 'retail', component: RetailComponent },
  { path: 'energy', component: EnergyComponent },
  { path: 'industry', component: IndustryComponent },
  { path: 'mobility', component: MobilityComponent },
  { path: 'media', component: MediaComponent },
  { path: 'food', component: FoodComponent },
  { path: 'misc', component: OtherComponent },
  { path: 'performance', component: PerformanceComponent },
  { path: 'watchlist', component: WatchlistComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { relativeLinkResolution: 'legacy' })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
