package com.bridgelabz.fundoo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController 
{	
	@PostMapping("/register" )
	//method = RequestMethod.POST ,value = 
	@ResponseBody
	public String register() 
	{
		System.out.println("In register");
		return "Registered";
	}
}
