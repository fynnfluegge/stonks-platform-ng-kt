import { Component } from '@angular/core';
import { TableAnimations } from '../../animations';
import { BaseTableComponent } from '../base-table/base-table.component';
import { PollingService } from '../../service/polling.service';
import { HttpClient } from '@angular/common/http';
import { MatDialog } from '@angular/material';

@Component({
  selector: 'app-semiconductor-table',
  templateUrl: '../base-table/base-table.component.html',
  animations: [
    TableAnimations.animations
  ]
})
export class SemiconductorComponent extends BaseTableComponent {

  constructor(http: HttpClient, dialog: MatDialog) {
    super(new PollingService(http,
      'http://localhost:9091/getSemiconductorQuotes',
      'http://localhost:9091/updateSemiconductorQuotes'),
      dialog);
  }

}
