package com.bridgelabz.fundoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundoo.dto.UserDTO;
import com.bridgelabz.fundoo.repository.UserRepository;
import com.bridgelabz.fundoo.service.UserServiceImplementation;

@RestController
@RequestMapping("/user")
public class UserController 
{	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/register")
	public String register() 
	{
		System.out.println("In register controller");
		
		//UserServiceImplementation.getInstance().createUser();
		
		return "Registered User";
	}
	
	@GetMapping("/getusers")
	public List<UserDTO> getUsers() 
	{
		
		return userRepository.getAllUsers();		
	}
}
