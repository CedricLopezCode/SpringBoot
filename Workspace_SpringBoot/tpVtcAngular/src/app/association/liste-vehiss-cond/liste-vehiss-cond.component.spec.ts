import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeVehissCondComponent } from './liste-vehiss-cond.component';

describe('ListeVehissCondComponent', () => {
  let component: ListeVehissCondComponent;
  let fixture: ComponentFixture<ListeVehissCondComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeVehissCondComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeVehissCondComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
