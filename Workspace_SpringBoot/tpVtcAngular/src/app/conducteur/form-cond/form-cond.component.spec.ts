import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormCondComponent } from './form-cond.component';

describe('FormCondComponent', () => {
  let component: FormCondComponent;
  let fixture: ComponentFixture<FormCondComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormCondComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormCondComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
