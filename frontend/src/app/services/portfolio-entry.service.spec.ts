import { TestBed } from '@angular/core/testing';

import { PortfolioEntryService } from './portfolio-entry.service';

describe('PortfolioEntryService', () => {
  let service: PortfolioEntryService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PortfolioEntryService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
