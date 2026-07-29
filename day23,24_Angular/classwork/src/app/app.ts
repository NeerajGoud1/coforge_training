import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.css'
})
export class App {
  name : String;
  age : number;
  email : String;
  imagePath : String;
  widht : number;
  height : number;
  myStyle : {};
 myClass : String;
 firstName : String=""; // This property is used for two-way data binding with the input field in the template.

  constructor(){
    this.name = "Neeraj";
    this.age = 21;
    this.email = "neeraj@example.com";
    this.imagePath = "images.jpg";
    this.widht = 200;
    this.height = 200;
    this.myStyle = {
      'color' : 'blue',
      'font-size' : '16px',
      'font-weight' : 'bold'
    }
    this.myClass = "zoomIn";
  }

  getAddition(a : number, b : number) : number{
     return a + b;
  }

  changeName(){
    if(this.name === "Neeraj"){
      this.name = "Kumar";
    }else{
      this.name = "Neeraj";
    }
  }

  ZoomInOut(){
    if(this.myClass === "zoomIn"){
      this.myClass = "zoomOut";
    }else{
      this.myClass = "zoomIn";
    }
}

}
