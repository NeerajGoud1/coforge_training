import { Component } from '@angular/core';

@Component({
  selector: 'app-structural-directives',
  standalone: false,
  templateUrl: './structural-directives.html',
  styleUrl: './structural-directives.css',
})
export class StructuralDirectives {

  myDivStyle : String;
  myButtonStyle : {};
  message : String;
  flag : boolean;
  vehicles : String[];
  selectedVehicle : String;

  constructor(){
    this.myDivStyle = "MyDiv";
    this.myButtonStyle =  {
    "backgroundColor" : "blue",
      "color" : "white",
      "padding" : "10px",
      "border" : "none",
      "borderRadius" : "5px",
    }
    this.message = "Angular Structure Directive";
    this.flag = true;
    this.vehicles = ['Car', 'Bike', 'Bus', 'Truck'];
    this.selectedVehicle = "";

  }

  showHideDiv(){
    this.flag = !this.flag;
  }

  setSelectedVehicle(vehicle : String){
    this.selectedVehicle = vehicle;
  }
}
