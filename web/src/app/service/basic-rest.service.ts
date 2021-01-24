import { HttpClient } from '@angular/common/http';
import { QuoteRecord } from '../model/quoteRecord';
import { Observable } from 'rxjs';

export class BasicRestService {
  http: HttpClient
  url: string

  constructor(http: HttpClient, url: string) {
    this.http = http
    this.url = url;
  }

  public getQuoteRecord(): Observable<QuoteRecord> {
    return this.http.get<QuoteRecord>(this.url);
  }
}
