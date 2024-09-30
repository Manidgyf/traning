package com.jdbc.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	private static String insertCode = "INSERT INTO emp_det VALUES (101,'hari','blr'); ";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//establishing driver
	
				Class.forName("com.mysql.cj.jdbc.Driver");
				//setting up connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunlife_db","root","root");

				Statement st = conn.createStatement();
				st.executeUpdate(insertCode);
				System.out.println("inserted");
				
	}
}
