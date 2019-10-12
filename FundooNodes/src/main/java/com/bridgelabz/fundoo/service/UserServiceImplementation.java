package com.bridgelabz.fundoo.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.fundoo.dto.UserDTO;
import com.bridgelabz.fundoo.model.UserModel;


public class UserServiceImplementation implements UserService 
{	
	private static UserService userService;
	
	private List<UserDTO> userList;
	
	public static UserService getInstance()
	{
		if(userService == null)
		{
			userService = new UserServiceImplementation();
			return userService;
		}
		return userService;		
	}
	
	public UserServiceImplementation() 
	{
		userList = new ArrayList<UserDTO>();
	}
	
	@Override
	public void createUser() 
	{
		System.out.println("User created");
	}

	@Override
	public void readUser() 
	{

	}

	@Override
	public void updateUser() 
	{

	}

	@Override
	public void deleteUser() 
	{

	}

}
