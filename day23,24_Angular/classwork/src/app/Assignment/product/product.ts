import { Component } from '@angular/core';

interface Product1 {
  id: number;
  name: string;
  category: string;
  price: number;
}


@Component({
  selector: 'app-product',
  standalone: false,
  templateUrl: './product.html',
  styleUrl: './product.css',
})
// export class Product {

//  productName: string;        
// price: number;
// category: string;
// brand: string;
// image: string;
// availability: boolean;

// constructor() {
//   this.productName = 'Laptop';
//   this.price = 1000;
//   this.category = 'Electronics';
//   this.brand = 'Dell';
//   this.image = 'download.webp';
//   this.availability = true;
// }
// }


export class Product {

    products: Product1[];

  constructor() {
    this.products = [
      { id: 1, name: 'Laptop', category: 'Electronics', price: 1000 },
      { id: 2, name: 'Smartphone', category: 'Electronics', price: 500 },
      { id: 3, name: 'Headphones', category: 'Electronics', price: 100 },
      { id: 4, name: 'Shoes', category: 'Fashion', price: 80 },
      { id: 5, name: 'T-shirt', category: 'Fashion', price: 20 },
      { id: 6, name: 'Watch', category: 'Fashion', price: 150 },
      { id: 7, name: 'Refrigerator', category: 'Appliances', price: 800 },
      { id: 8, name: 'Microwave', category: 'Appliances', price: 200 },
      { id: 9, name: 'Blender', category: 'Appliances', price: 50 },
      { id: 10, name: 'Vacuum Cleaner', category: 'Appliances', price: 300 }
    ];
  }
}
