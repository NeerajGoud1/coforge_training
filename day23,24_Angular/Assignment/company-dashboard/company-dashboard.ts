import { Component } from '@angular/core';

@Component({
  selector: 'app-company-dashboard',
  standalone: false,
  templateUrl: './company-dashboard.html',
  styleUrl: './company-dashboard.css',
})
export class CompanyDashboard {

  companyName: string;  
  ceo: string;
  location: string;
  employeesCount: number;
  revenue: number;

  constructor(){
    this.companyName = 'Coforge';
    this.ceo = "Sai Charih";
    this.location = "Hyderabad"; 
    this.employeesCount = 10000; 
    this.revenue = 1000000; 
  }
}
