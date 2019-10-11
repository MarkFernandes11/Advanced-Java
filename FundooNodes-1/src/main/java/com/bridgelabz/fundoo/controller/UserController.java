package com.bridgelabz.fundoo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundoo.dto.LoginDTO;
import com.bridgelabz.fundoo.dto.UserDTO;
import com.bridgelabz.fundoo.service.UserService;
//import com.bridgelabz.fundoo.service.UserService;
import com.bridgelabz.fundoo.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	//private UserServiceImpl userServiceImpl;
	private UserService userService;
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome User"; 
	}
	
	@PostMapping("/register")
	public String register(@RequestBody @Valid UserDTO userDto)
	{
		String register = userService.register(userDto);
		
		return register; 
	}
	
	@PostMapping("/login")
	public String login(@RequestBody @Valid LoginDTO loginDTO) throws Exception 
	{
		String loginStatus = userService.login(loginDTO);
		return loginStatus;	
	}
	
	@PutMapping("/forget-password")
	public String forgetPassword(@RequestBody LoginDTO loginDTO) 
	{
		String updateStatus =userService.forgetPassword(loginDTO);
		return updateStatus;	
	}
	
	@DeleteMapping("/delete")
	public String delete() 
	{
		return "deleted user";	
	}
}
