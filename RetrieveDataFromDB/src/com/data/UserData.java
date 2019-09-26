package com.data;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class UserData 
{
	static Connection con;
	static PreparedStatement statement;
	static ResultSet result;
	
	@SuppressWarnings("rawtypes")
	public static List userData() 
	{
		List<User> userList = new ArrayList<User>();
		User user = new User();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginDB","root","password");
			statement = (PreparedStatement) con.prepareStatement("SELECT * FROM USERS");
			result = statement.executeQuery();
			
			while(result.next())
			{								
				user.setName(result.getString(1));
				System.out.println(user.getName());
				user.setEmail(result.getString(2));
				user.setContactNumber(result.getString(3));
				System.out.println(user);
				userList.add(user);	
				
				//System.out.println(user.getName());
				//System.out.println(user.getEmail());
			}
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			if(result != null)
			{
				try {
					result.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				result = null;
			}
			if(statement != null)
			{
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				statement = null;
			}
			if(con != null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				con = null;
			}
		}
		
		return userList;
	}	

}
