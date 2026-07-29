import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeReistrationForm } from './employe-reistration-form';

describe('EmployeReistrationForm', () => {
  let component: EmployeReistrationForm;
  let fixture: ComponentFixture<EmployeReistrationForm>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmployeReistrationForm],
    }).compileComponents();

    fixture = TestBed.createComponent(EmployeReistrationForm);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
