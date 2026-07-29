import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { MyChild1 } from './my-child1/my-child1';
import { MyChild2 } from './my-child2/my-child2';
import { FormsModule } from '@angular/forms';
import { Employee } from './Assignment/employee/employee';
import { Student } from './Assignment/student/student';
import { Product } from './Assignment/product/product';
import { CompanyDashboard } from './Assignment/company-dashboard/company-dashboard';
import { EventRegistrationForm } from './Assignment/event-registration-form/event-registration-form';
import { Counter } from './Assignment/counter/counter';
import { StructuralDirectives } from './structural-directives/structural-directives'; // Import FormsModule for two-way data binding
import { CalculatorService } from './calculator-service';
import { Addition } from './addition/addition';
import { Subtraction } from './subtraction/subtraction';
import { EmployeeComponent } from './employee-component/employee-component';
import { EmployeReistrationForm } from './Assignment/employe-reistration-form/employe-reistration-form';
import { Home } from './home/home';
import { About } from './about/about';
import { Contact } from './contact/contact'; // Import the CalculatorService

import { Routes, RouterModule } from '@angular/router';




@NgModule({
  //NgModule decorator is used to define the AppModule class as an Angular module. It provides metadata about the module, such as its declarations, imports, providers, and bootstrap components.
  declarations: [
    //we register all our componets here
    App,
    MyChild1,
    MyChild2,
    Employee,
    Student,
    Product,
    CompanyDashboard,
    EventRegistrationForm,
    Counter,
    StructuralDirectives,
    Addition,
    Subtraction,
    EmployeeComponent,
    EmployeReistrationForm,
    Home,
    About,
    Contact,
    
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule],
  providers: [CalculatorService], //to register the CalculatorService as a provider. This allows the service to be injected into components or other services that require it.
  bootstrap: [App], //to specify the root component. that Angular should bootstrap when it starts the application. In this case, the App component is specified as the bootstrap component.
})
export class AppModule {}
