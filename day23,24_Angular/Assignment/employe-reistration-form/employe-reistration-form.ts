import { Component } from '@angular/core';

@Component({
  selector: 'app-employe-reistration-form',
  standalone: false,
  templateUrl: './employe-reistration-form.html',
  styleUrl: './employe-reistration-form.css',
})
export class EmployeReistrationForm {

employeeId : number;
employeeName : String;
employeeEmail : String;
employeeDepartment : String;
employeeJoiningDate : Date;
employeeGender : String;
employeeSalary : number;
employeeMobile : number;

constructor(){
  this.employeeId = 0;
  this.employeeName = "";
  this.employeeEmail = "";
  this.employeeDepartment = "";
  this.employeeJoiningDate = new Date();
  this.employeeGender = "";
  this.employeeSalary = 0;
  this.employeeMobile = 0;
}

saveEmployee(employeeData: any) {
  this.employeeId = employeeData.employeeId;
  this.employeeName = employeeData.employeeName;
  this.employeeEmail = employeeData.employeeEmail;
  this.employeeDepartment = employeeData.employeeDepartment;
  this.employeeJoiningDate = employeeData.employeeJoiningDate;
  this.employeeGender = employeeData.employeeGender;
  this.employeeSalary = employeeData.employeeSalary;
  this.employeeMobile = employeeData.employeeMobile
  console.log("Employee Data Saved:", employeeData);
}

}
