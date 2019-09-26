package com.login;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class UserLogin 
{
	//ConnectionProviderDetails provider = new ConnectionProvider();
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet result = null;
	String query = "SELECT * FROM UserTable WHERE Email = ? AND Password = ?";
	
	public boolean CheckValidUser(String username,String password) 
	{		
		try 
		{
			connection = ConnectionProvider.getConection();
			statement = (PreparedStatement) connection.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, password);			
			result = statement.executeQuery();
			if(result.next())
			{
				System.out.println("User Present");
				return true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			if(result != null)
			{
				try 
				{
					result.close();					
				}
				catch (SQLException e) {
					
					e.printStackTrace();
				}
				result = null;
			}
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
		
		return false;
		
	}
}
