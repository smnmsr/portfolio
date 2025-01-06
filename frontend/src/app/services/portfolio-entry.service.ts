import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {map, Observable} from 'rxjs';
import {PortfolioEntry} from '../common/portfolio-entry';
import {AppConfig} from '../env/config';

@Injectable({
  providedIn: 'root'
})
export class PortfolioEntryService {

  private baseUrl = `${AppConfig.apiUrl}/portfolioEntries`;

  constructor(private httpClient: HttpClient) {
  }

  getPortfolioEntryList(): Observable<PortfolioEntry[]> {
    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
      map(response => response._embedded.portfolioEntries)
    )
  }
}

interface GetResponse {
  _embedded: {
    portfolioEntries: PortfolioEntry[];
  }
}
