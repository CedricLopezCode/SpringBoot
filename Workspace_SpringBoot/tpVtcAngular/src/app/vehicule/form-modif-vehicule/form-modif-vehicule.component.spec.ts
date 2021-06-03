import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormModifVehiculeComponent } from './form-modif-vehicule.component';

describe('FormModifVehiculeComponent', () => {
  let component: FormModifVehiculeComponent;
  let fixture: ComponentFixture<FormModifVehiculeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormModifVehiculeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormModifVehiculeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
