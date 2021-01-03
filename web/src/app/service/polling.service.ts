import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { QuoteRecord } from '../model/quoteRecord';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PollingService {

  constructor(private http: HttpClient, private initUrl: string, private updateUrl: string) {
  }

  public updateQuoteRecords(): Observable<QuoteRecord[]> {
    return this.http.get<QuoteRecord[]>(this.updateUrl);
  }

  public initQuoteRecords(): Observable<QuoteRecord[]> {
    return this.http.get<QuoteRecord[]>(this.initUrl);
  }
}
