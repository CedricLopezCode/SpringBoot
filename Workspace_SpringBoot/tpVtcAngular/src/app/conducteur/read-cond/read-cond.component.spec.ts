import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadCondComponent } from './read-cond.component';

describe('ReadCondComponent', () => {
  let component: ReadCondComponent;
  let fixture: ComponentFixture<ReadCondComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReadCondComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReadCondComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
