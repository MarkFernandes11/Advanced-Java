package com.login;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class UserRegistration 
{
	static User user = new User();
	static Connection connection = null;
	static PreparedStatement statement = null;
	static String query = "INSERT INTO UserTable (Firstname,Lastname,Email,Password,Contact_Number) VALUES(?, ?, ?, ?, ?)";
	
	public static boolean RegisterUser(String firstname, String lastname, String email, String contactNumber, String password) 
	{
		boolean registrationDone = false;
		//System.out.println("check");
		try 
		{
			connection = ConnectionProvider.getConection();
			//System.out.println("check");
			statement = (PreparedStatement) connection.prepareStatement(query);
			//System.out.println("check");
			statement.setString(1, firstname);
			//System.out.println(statement);
			statement.setString(2, lastname);
			//System.out.println(statement);
			statement.setString(3, email);			
			//System.out.println(statement);
			statement.setString(4, password);
			//System.out.println(statement);
			statement.setString(5, contactNumber);
			//System.out.println(statement);			
			int status = statement.executeUpdate();
			
//			System.out.println(status);
			
			if(status != 0)
			{
				registrationDone = true;
			}
			else
			{
				registrationDone = false;
			}
		}
		catch (SQLException e) 
		{		
			e.printStackTrace();
		}
		finally
		{
			if(statement != null)
			{
				try 
				{
					statement.close();					
				}
				catch (SQLException e) {
					
					e.printStackTrace();
				}
				statement = null;
			}
			if(connection != null)
			{
				try 
				{
					connection.close();					
				}
				catch (SQLException e) {
					
					e.printStackTrace();
				}
				connection = null;
			}
		}
				
		return registrationDone;	
		
		
	}

//	public void RegisterUser(String firstname, String lastname, String email, String contactNumber, String password) {
//		// TODO Auto-generated method stub
//		
//	}
}



//statement.setString(1, user.getFirstname());			
//statement.setString(2, user.getLastname());
//statement.setString(3, user.getEmail());
//statement.setString(4, user.getContactNumber());
//statement.setString(5, user.getPassword());