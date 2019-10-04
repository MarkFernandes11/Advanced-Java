package com.bridgelabz.login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

import org.apache.catalina.User;


public class UserDAOImplementation implements UserDAO 
{
	static Connection connection;
	PreparedStatement preparedSt;
	
	@Override
	public int insertUserIntoDatabase(Users user) 
	{
		int status = 0;
		try 
		{				
			connection = MyConnection.getConnection();
			preparedSt = (PreparedStatement) connection.prepareStatement("INSERT INTO Users(name,email,password) VALUES(?,?,?)");
			// (name,email,password)
			preparedSt.setString(1, user.getName());
			System.out.println(preparedSt);
			preparedSt.setString(2, user.getEmail());
			System.out.println(preparedSt);
			preparedSt.setString(3, user.getPassword());
			System.out.println(preparedSt);
			status = preparedSt.executeUpdate();
			System.out.println(status);
			connection.close();
		}
		catch (SQLException e) 
		{		
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
				preparedSt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return status;
	}

	@Override
	public Users getFromDatabase(String email, String pass) 
	{
		Users user = new Users();
		try 
		{
			connection = MyConnection.getConnection();
			preparedSt = (PreparedStatement) connection.prepareStatement("SELECT * FROM Users WHERE email=? AND password=?");
			preparedSt.setString(1, email);
			//System.out.println(preparedSt);
			preparedSt.setString(2, pass);
			//System.out.println(preparedSt);
			
			ResultSet resultSet = preparedSt.executeQuery();
			while(resultSet.next())
			{
				user.setName(resultSet.getString(1));
				System.out.println(user.getName());
				user.setEmail(resultSet.getString(2));
				System.out.println(user.getEmail());
				user.setPassword(resultSet.getString(3));
				System.out.println(user.getPassword());
			}
		}
		catch (SQLException e) 
		{		
			e.printStackTrace();
		}
		try {
			connection.close();
			preparedSt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	public boolean checkUser(String username, String passwordCheck) throws SQLException
	{
		boolean userPresent = false;
		String query = "SELECT * FROM Users WHERE email = ? AND password = ?";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = MyConnection.getConnection();
			statement = (PreparedStatement) connection.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, passwordCheck);
			resultSet = statement.executeQuery();
			if(resultSet.next()) {
				userPresent = true;
			}
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				if(resultSet != null) {
					resultSet.close();
					resultSet = null;
				}
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if(statement != null) {
					statement.close();
					statement = null;
				}
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if(connection != null) {
					connection.close();
					connection = null;
				}
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}		
		return userPresent;

}
}
