import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PortfolioIndexComponent } from './portfolio-index.component';

describe('PortfolioIndexComponent', () => {
  let component: PortfolioIndexComponent;
  let fixture: ComponentFixture<PortfolioIndexComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PortfolioIndexComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PortfolioIndexComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
