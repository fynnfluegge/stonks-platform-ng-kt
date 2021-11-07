import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PerformanceComponent } from './component/performance/performance.component';
import { BaseTableComponent } from './component/base-table/base-table.component';
import { CardsTableComponent } from './component/cards-table/cards-table.component';
import { DashboardComponent } from './component/dashboard/dashboard.component';
import { HeatmapComponent } from './component/heatmap/heatmap.component';


const routes: Routes = [
  { path: '', redirectTo: 'list/indices', pathMatch: 'full' },
  { path: 'dashboard', component: DashboardComponent },

  { path: 'list/indices', component: BaseTableComponent },
  { path: 'cards/indices', component: CardsTableComponent },

  { path: 'list/tech', component: BaseTableComponent },
  { path: 'cards/tech', component: CardsTableComponent },
  { path: 'heatmap/tech', component: HeatmapComponent },

  { path: 'list/health', component: BaseTableComponent },
  { path: 'cards/health', component: CardsTableComponent },
  { path: 'heatmap/health', component: HeatmapComponent },

  { path: 'list/finance', component: BaseTableComponent },
  { path: 'cards/finance', component: CardsTableComponent },
  { path: 'heatmap/finance', component: HeatmapComponent },

  { path: 'list/retail', component: BaseTableComponent },
  { path: 'cards/retail', component: CardsTableComponent },
  { path: 'heatmap/retail', component: HeatmapComponent },

  { path: 'list/energy', component: BaseTableComponent },
  { path: 'cards/energy', component: CardsTableComponent },
  { path: 'heatmap/energy', component: HeatmapComponent },

  { path: 'list/industrial', component: BaseTableComponent },
  { path: 'cards/industrial', component: CardsTableComponent },
  { path: 'heatmap/industrial', component: HeatmapComponent },

  { path: 'list/mobility', component: BaseTableComponent },
  { path: 'cards/mobility', component: CardsTableComponent },
  { path: 'heatmap/mobility', component: HeatmapComponent },

  { path: 'list/media', component: BaseTableComponent },
  { path: 'cards/media', component: CardsTableComponent },
  { path: 'heatmap/media', component: HeatmapComponent },

  { path: 'list/food', component: BaseTableComponent },
  { path: 'cards/food', component: CardsTableComponent },
  { path: 'heatmap/food', component: HeatmapComponent },

  { path: 'performance', component: PerformanceComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { relativeLinkResolution: 'legacy' })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
