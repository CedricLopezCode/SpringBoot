import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadAssociationComponent } from './read-association.component';

describe('ReadAssociationComponent', () => {
  let component: ReadAssociationComponent;
  let fixture: ComponentFixture<ReadAssociationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReadAssociationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReadAssociationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
