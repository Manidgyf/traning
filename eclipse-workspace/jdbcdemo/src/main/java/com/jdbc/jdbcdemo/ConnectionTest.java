package com.jdbc.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//establishing driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//setting up connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunlife_db","root","root");
		
		System.out.println("connection establised");
	}

}
