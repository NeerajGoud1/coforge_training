package com.coforge.day5_java.classwork.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUpdateTest {

	public static void main(String[] args) throws Exception {

		// Step-1 : Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step-2 : Connecting with DB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root",
				"Neeraj@6637");

		// Step-3 : create statement
		String sql = "update tbl_employee set ename = ? , esalary = ? where eid = ?";
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setString(1, "Varshit");
		statement.setInt(2, 2000);
		statement.setInt(3, 109);

		// Step-4 : Executing the query
		int n = statement.executeUpdate(); // executeUpdate is used to insert, update, delete;
		if (n == 1) {
			System.out.println("Employee details Updated");
		} else {
			System.out.println("Employee details not Updated");
		}

		// Step-5 : Closing connection
		statement.close();
		connection.close();
	}
}
