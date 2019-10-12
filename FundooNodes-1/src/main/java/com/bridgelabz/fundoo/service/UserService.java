package com.bridgelabz.fundoo.service;

import com.bridgelabz.fundoo.dto.LoginDTO;
import com.bridgelabz.fundoo.dto.UserDTO;

public interface UserService 
{
	
	public String register(UserDTO userDto);
	
	public String forgetPassword(LoginDTO loginDTO);
	
	public String login(LoginDTO loginDTO) throws Exception;
	
//	public String delete();
}
