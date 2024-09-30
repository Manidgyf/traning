package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	private static ConnectionTest cnt=null;
	private static Connection conn;
	private static String user="root";
	private static String pass="root";
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/sunlife_db";
	
	
	private ConnectionTest()
	{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		}
	}
	public static Connection getConnection()
	{
		if(cnt==null)
		{
				try {
					cnt = new ConnectionTest();
				conn = DriverManager.getConnection(url,user,pass);
				} 
				//setting up connection
				catch (SQLException e) {
					
				}
			
				
		}
	return conn;

	}
}
