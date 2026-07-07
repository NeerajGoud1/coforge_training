package com.coforge.day6_java.assignment.ems.ui;

import java.util.Scanner;

import com.coforge.day6_java.assignment.ems.controller.EmployeeController;
import com.coforge.day6_java.assignment.ems.model.Employee;

public class EmployeeApp {

	private static EmployeeController controller = new EmployeeController();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String confirmation = "";

		String result = "";

		do {
			System.out.println("1.Create 2.Update 3.Delete 4.Find 5.FindAll 6.Quit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter employee id, name, salary and dno");
				Employee employee = new Employee(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
				result = controller.createEmployee(employee);
				System.out.println(result);
				break;
			case 2:
				System.out.println("Enter employee id, name, salary and dno to update");
				Employee employeeU = new Employee(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
				result = controller.updateEmployee(employeeU);
				System.out.println(result);
				break;
			case 3:
				System.out.println("Enther the employee id to delete");
				int eid = sc.nextInt();
				result = controller.deleteEmployee(eid);
				System.out.println(result);
				break;
			case 4:
				System.out.println("Enter the Employee Id");
				eid = sc.nextInt();
				result = controller.findEmployee(eid);
				System.out.println(result);
				break;
			case 5:
				String employeeData = controller.findAllEmployee();
				System.out.println(employeeData);
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

			System.out.println("Do you wnat to continue [Yes | No]");
			confirmation = sc.next();
		} while (confirmation.equalsIgnoreCase("Yes"));

	}
}
