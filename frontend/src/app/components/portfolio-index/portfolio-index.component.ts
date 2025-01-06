import {Component, OnInit} from '@angular/core';
import {PortfolioEntryService} from '../../services/portfolio-entry.service';
import {PortfolioEntry} from '../../common/portfolio-entry';

@Component({
  selector: 'app-portfolio-index',
  imports: [],
  templateUrl: './portfolio-index.component.html',
  styleUrl: './portfolio-index.component.css'
})
export class PortfolioIndexComponent implements OnInit {

  portfolioEntries: PortfolioEntry[] = [];

  constructor(private portfolioEntryService: PortfolioEntryService) {


  }

  ngOnInit(): void {
    this.listPortfolioEntries();
  }

  private listPortfolioEntries() {
    this.portfolioEntryService.getPortfolioEntryList().subscribe(
      data => {
        this.portfolioEntries = data;
      }
    )
  }
}
