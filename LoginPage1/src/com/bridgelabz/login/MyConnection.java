package com.bridgelabz.login;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MyConnection implements ConnectorDetails 
{
	static Connection connection = null;
	
	public static Connection getConnection()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "password");
		}
		catch (SQLException e) 
		{
			System.out.println("Error occured while establishing connection "+e.getMessage());
		}
		catch (ClassNotFoundException e) 
		{			
			System.out.println("Class not found "+e.getMessage());
		}
		return connection;
		
	}
}