import { Component } from '@angular/core';
import { TableAnimations } from '../../animations';
import { BaseTableComponent } from '../base-table/base-table.component';
import { PollingService } from '../../service/polling.service';
import { HttpClient } from '@angular/common/http';
import { MatDialog } from '@angular/material';

@Component({
  selector: 'app-ecommerce-table',
  templateUrl: '../base-table/base-table.component.html',
  animations: [
    TableAnimations.animations
  ]
})
export class EcommerceComponent extends BaseTableComponent {

  constructor(http: HttpClient, dialog: MatDialog) {
    super(new PollingService(http,
      'http://18.156.73.56:9091/getEcommerceQuotes',
      'http://18.156.73.56:9091/updateEcommerceQuotes'),
      dialog);
  }

}