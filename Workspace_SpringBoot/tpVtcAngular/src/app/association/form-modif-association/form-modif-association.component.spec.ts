import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormModifAssociationComponent } from './form-modif-association.component';

describe('FormModifAssociationComponent', () => {
  let component: FormModifAssociationComponent;
  let fixture: ComponentFixture<FormModifAssociationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormModifAssociationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormModifAssociationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
