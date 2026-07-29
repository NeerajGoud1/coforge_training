import { Component } from '@angular/core';

@Component({
  selector: 'app-employee-component',
  standalone: false,
  templateUrl: './employee-component.html',
  styleUrl: './employee-component.css',
})
export class EmployeeComponent {
result : string;
name : string;
date : string;

constructor() {
  this.result = "";
  this.name = "neeraj kumar";
  this.date = new Date().toISOString().split('T')[0];
}

saveEmployee(employeeData: any) { 
  this.result = "Employee Id : " + employeeData.eid + " Employee Name : " + employeeData.ename + " Employee Salary : " + employeeData.esalary + " Employee Dno : " + employeeData.edno;  
}

}
