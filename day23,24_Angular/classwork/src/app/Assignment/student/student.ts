import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'; 
interface Student1 {
  id: number;
  name: string;
  marks: number;
}
@Component({
  selector: 'app-student',
  standalone: false,
  templateUrl: './student.html',
  styleUrl: './student.css',
})
// export class Student {

//   name : String;
//   course : String;
//   college : String;
//   imagePath : String;
//   widht : number;
//   height : number;

//   constructor(){
//     this.name = "Neeraj";
//     this.course = "Angular";  
//     this.college = "VNRVJIET";
//     this.imagePath = "images.jpg";
//     this.widht = 200;
//     this.height = 200;
//   }
// }
// Import CommonModule for *ngIf & *ngFor if using Standalone


export class Student {
  students: Student1[] = [
    { id: 101, name: 'Alice', marks: 85 },
    { id: 102, name: 'Bob', marks: 28 },
    { id: 103, name: 'Charlie', marks: 62 },
    { id: 104, name: 'David', marks: 34 },
    { id: 105, name: 'Emma', marks: 91 },
    { id: 106, name: 'Frank', marks: 45 },
    { id: 107, name: 'Grace', marks: 19 },
    { id: 108, name: 'Hannah', marks: 78 },
    { id: 109, name: 'Ian', marks: 35 },
    { id: 110, name: 'Jack', marks: 50 }
  ];


  get totalStudents(): number {
    return this.students.length;
  }

  get passCount(): number {
    return this.students.filter(student => student.marks >= 35).length;
  }

  get failCount(): number {
    return this.students.filter(student => student.marks < 35).length;
  }
}