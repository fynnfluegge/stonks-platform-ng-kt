import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { QuoteRecord } from '../model/quoteRecord';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BasicRestService {

  constructor(private http: HttpClient, private url: string) {
  }

  public getQuoteRecord(): Observable<QuoteRecord> {
    return this.http.get<QuoteRecord>(this.url);
  }
}
