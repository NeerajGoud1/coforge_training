import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  standalone: false,
  templateUrl: './employee.html',
  styleUrl: './employee.css',
})
// export class Employee {
// employeeId : number;
// name : String;
// salary : number;
// department : String;

// constructor(){
//   this.employeeId = 101;
//   this.name = "Neeraj";
//   this.salary = 50000;
//   this.department = "IT";
// }

// }


export class Employee {
  employee = {
    id: 101,
    name: 'Neeraj',
    department: 'CSE',
    salary: 50000
  };

  showEmployee = true;

  toggleEmployee() {
    this.showEmployee = !this.showEmployee;
  }

}
