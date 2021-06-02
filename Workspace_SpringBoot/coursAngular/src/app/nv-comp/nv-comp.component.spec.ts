import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NvCompComponent } from './nv-comp.component';

describe('NvCompComponent', () => {
  let component: NvCompComponent;
  let fixture: ComponentFixture<NvCompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NvCompComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NvCompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
