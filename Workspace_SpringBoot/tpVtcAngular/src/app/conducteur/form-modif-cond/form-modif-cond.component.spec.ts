import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormModifCondComponent } from './form-modif-cond.component';

describe('FormModifCondComponent', () => {
  let component: FormModifCondComponent;
  let fixture: ComponentFixture<FormModifCondComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormModifCondComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormModifCondComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
