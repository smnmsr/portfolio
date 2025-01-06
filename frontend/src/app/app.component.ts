import {Component} from '@angular/core';
import {PortfolioIndexComponent} from './components/portfolio-index/portfolio-index.component';
import {PortfolioEntryService} from './services/portfolio-entry.service';

@Component({
  selector: 'app-root',
  imports: [PortfolioIndexComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  providers: [PortfolioEntryService]
})
export class AppComponent {
  title = 'frontend';
}
