import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadVehiculeComponent } from './read-vehicule.component';

describe('ReadVehiculeComponent', () => {
  let component: ReadVehiculeComponent;
  let fixture: ComponentFixture<ReadVehiculeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReadVehiculeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReadVehiculeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
