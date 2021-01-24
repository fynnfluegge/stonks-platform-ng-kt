import { Injectable } from '@angular/core';
import { QuoteRecord } from '../model/quoteRecord';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EventListenerService {

  observeMessages(sseUrl: string): Observable<QuoteRecord> {
  return new Observable<QuoteRecord>(obs => {
      const es = new EventSource(sseUrl);
      es.addEventListener('message', (evt) => {
          obs.next(JSON.parse(evt.data));
      });
      return () => es.close();
  });
}
}
