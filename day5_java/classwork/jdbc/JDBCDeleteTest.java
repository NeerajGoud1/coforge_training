package com.coforge.day5_java.classwork.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDeleteTest {

	public static void main(String[] args) throws Exception {

		// Step-1 : Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step-2 : Connecting with DB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root",
				"Neeraj@6637");

		// Step-3 : create statement
		String sql = "delete from tbl_employee where eid = ?";
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setInt(1, 109);

		// Step-4 : Executing the query
		int n = statement.executeUpdate(); // executeUpdate is used to insert, update, delete;
		if (n == 1) {
			System.out.println("Employee details Deleted");
		} else {
			System.out.println("Employee details not Deleted");
		}

		// Step-5 : Closing connection
		statement.close();
		connection.close();
	}
}
