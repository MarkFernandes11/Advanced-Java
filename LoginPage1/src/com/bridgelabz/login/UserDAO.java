package com.bridgelabz.login;

public interface UserDAO 
{
	public int insertUserIntoDatabase(Users user);
	
	public Users getFromDatabase(String email, String pass);
}
