import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeCondssVehiComponent } from './liste-condss-vehi.component';

describe('ListeCondssVehiComponent', () => {
  let component: ListeCondssVehiComponent;
  let fixture: ComponentFixture<ListeCondssVehiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeCondssVehiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeCondssVehiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
