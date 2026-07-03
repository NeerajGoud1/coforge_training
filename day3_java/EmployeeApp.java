package com.coforge.day3_java;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee neeraj = new Employee(1, "Neeraj", 1000000);
		neeraj.display();
		
		Employee sairoop = new Employee(2, "Sairoop", 2000000);
		sairoop.display();
		
		neeraj.setSalary(2000000);  // changing the property in future
		neeraj.display();
		
		System.out.println(neeraj.getSalary());
	}

}
