import { Component } from '@angular/core';
import { CalculatorService } from '../calculator-service';

@Component({
  selector: 'app-subtraction',
  standalone: false,
  templateUrl: './subtraction.html',
  styleUrl: './subtraction.css',
})
export class Subtraction {

    result : String;
  
    constructor(private calculatorService: CalculatorService) { //constructor injection of the CalculatorService
      this.result = "Subtraction : " + this.calculatorService.subtract(5, 3);
    }
}
