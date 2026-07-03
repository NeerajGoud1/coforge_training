package com.coforge.day3_java.Assignment;

public class Product {
	private int pid;
	private int pname;
	private int price;
	private int quantity;
	
	public Product(int pid, int pname, int price, int quantity) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int calculateTotalAmount() {
		return this.price * this.quantity;
	}
	
	public void displayBill() {
		System.out.println("Bill : " + calculateTotalAmount());
	}
}
