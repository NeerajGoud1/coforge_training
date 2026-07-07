package com.coforge.day5_java.classwork.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSelectTest {

	public static void main(String[] args) throws Exception {

		// Step-1 : Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step-2 : Connecting with DB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root",
				"Neeraj@6637");

		// Step-3 : create statement
		String sql = "select * from tbl_employee";
		PreparedStatement statement = connection.prepareStatement(sql);

		// Step-4 : Executing the query
		ResultSet res = statement.executeQuery(); // executeQuery is used for select

		while (res.next()) {
			System.out.print(res.getInt("eid") + " " + res.getString("ename") + " " + res.getInt("esalary") + " "
					+ res.getInt("dno"));
			System.out.println();
		}
		// Step-5 : Closing connection
		res.close();
		statement.close();
		connection.close();
	}
}
