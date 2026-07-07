package com.coforge.day6_java.assignment.ems.controller;

import java.sql.SQLException;

import com.coforge.day6_java.assignment.ems.exception.InvalidEmployeeObjectException;
import com.coforge.day6_java.assignment.ems.model.Employee;
import com.coforge.day6_java.assignment.ems.service.EmployeeService;
import com.coforge.day6_java.assignment.ems.util.ApplicationProperties;


public class EmployeeController {

	private EmployeeService service = new EmployeeService();

	public String createEmployee(Employee employee) {
		String result = "";

		try {
			int n = service.createEmployee(employee);
			if (n == 1)
				result = ApplicationProperties.insertSuccess;
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed + e;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed + e;
		} catch (InvalidEmployeeObjectException e) {
			result = e.toString();
		}

		return result;
	}

	public String updateEmployee(Employee employee) {
		String result = "";

		try {
			int n = service.updateEmployee(employee);
			if (n == 1) {
				result = ApplicationProperties.updateSuccess;
			}
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed + e;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed + e;
		} catch (InvalidEmployeeObjectException e) {
			result = e.toString();
		}

		return result;
	}

	public String deleteEmployee(int eid) {
		String result = "";

		try {
			int n = service.deleteEmployee(eid);
			if (n == 1) {
				result = ApplicationProperties.deleteSuccess;
			}
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed + e;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed + e;
		} catch (InvalidEmployeeObjectException e) {
			result = e.toString();
		}
		return result;
	}

	public String findAllEmployee() {

		String result = "";
		try {
			result = service.findAllEmployee().toString();
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed + e;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed + e;
		}
		return result;
	}

	public String findEmployee(int eid) {
		String result = "";
		try {
			result = service.findEmployee(eid).toString();
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed + e;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed + e;
		} catch (InvalidEmployeeObjectException e) {
			result = e.toString();
		}
		return result;
	}
}
