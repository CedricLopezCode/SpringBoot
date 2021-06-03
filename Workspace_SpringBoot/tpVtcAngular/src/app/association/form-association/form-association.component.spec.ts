import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormAssociationComponent } from './form-association.component';

describe('FormAssociationComponent', () => {
  let component: FormAssociationComponent;
  let fixture: ComponentFixture<FormAssociationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormAssociationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormAssociationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
