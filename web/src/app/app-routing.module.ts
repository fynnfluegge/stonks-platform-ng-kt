import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PerformanceComponent } from './component/performance/performance.component';
import { BaseTableComponent } from './component/base-table/base-table.component';
import { CardsTableComponent } from './component/cards-table/cards-table.component';


const routes: Routes = [
  { path: '', redirectTo: 'list/indices' },
  { path: 'list/indices', component: BaseTableComponent },
  { path: 'cards/indices', component: CardsTableComponent },
  { path: 'list/tech', component: BaseTableComponent },
  { path: 'cards/tech', component: CardsTableComponent },
  { path: 'list/health', component: BaseTableComponent },
  { path: 'cards/health', component: CardsTableComponent },
  { path: 'list/finance', component: BaseTableComponent },
  { path: 'cards/finance', component: CardsTableComponent },
  { path: 'list/retail', component: BaseTableComponent },
  { path: 'cards/retail', component: CardsTableComponent },
  { path: 'list/energy', component: BaseTableComponent },
  { path: 'cards/energy', component: CardsTableComponent },
  { path: 'list/industrial', component: BaseTableComponent },
  { path: 'cards/industrial', component: CardsTableComponent },
  { path: 'list/mobility', component: BaseTableComponent },
  { path: 'cards/mobility', component: CardsTableComponent },
  { path: 'list/media', component: BaseTableComponent },
  { path: 'cards/media', component: CardsTableComponent },
  { path: 'list/food', component: BaseTableComponent },
  { path: 'cards/food', component: CardsTableComponent },
  { path: 'list/other', component: BaseTableComponent },
  { path: 'cards/other', component: CardsTableComponent },
  { path: 'performance', component: PerformanceComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { relativeLinkResolution: 'legacy' })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
