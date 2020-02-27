package com.listproject.DbUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtility {

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		}

		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitals_db", "root", "root1234");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;

	}

}

