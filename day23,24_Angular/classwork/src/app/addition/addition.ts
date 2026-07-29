import { Component } from '@angular/core';
import { CalculatorService } from '../calculator-service';

@Component({
  selector: 'app-addition',
  standalone: false,
  templateUrl: './addition.html',
  styleUrl: './addition.css',
})
export class Addition {

  result : String;
  num1 : number;
  num2 : number

  constructor(private calculatorService: CalculatorService) { //constructor injection of the CalculatorService
    this.result = "";
    this.num1 = 0;
    this.num2 = 0;
  }

  getAddition() {
    this.result = this.calculatorService.add(this.num1, this.num2).toString(); //calls the add method of the CalculatorService and converts the result to a string
  }
}
