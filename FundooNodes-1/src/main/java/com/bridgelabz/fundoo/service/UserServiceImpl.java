package com.bridgelabz.fundoo.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.fundoo.dto.LoginDTO;
import com.bridgelabz.fundoo.dto.UserDTO;
import com.bridgelabz.fundoo.model.User;
import com.bridgelabz.fundoo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public String register(UserDTO userDto) {
		User user = modelMapper.map(userDto, User.class);
		user.setRegisteredDate(LocalDateTime.now());
		user.setUpdatedDate(LocalDateTime.now());
		user.setVerified(true);
		userRepository.save(user);
		return "User Registered!!!!";
	}
	
	@Override
	public String login(LoginDTO loginDTO) throws Exception {
		User userCheck = userRepository.findByEmail(loginDTO.getEmail()).orElseThrow(()->new Exception("invalid user name"));
			
		System.out.println(userRepository.findByEmail(loginDTO.getEmail())); 
		//Optional[com.bridgelabz.fundoo.model.User@77418bed]
		System.out.println(userCheck); 
		//com.bridgelabz.fundoo.model.User@77418bed
		
		if(userCheck.getPassword().equals(loginDTO.getPassword()))
		{
			return "Login Successful";
		}
		
		if(!userCheck.getPassword().equals(loginDTO.getPassword()))
		{
			return "Invalid Password";
		}
		else
		{
			return "User doesn't exist";			
		}	
				
	}

	@Override
	public String forgetPassword(LoginDTO loginDTO) 
	{
		Optional<User> checkEmail = userRepository.findByEmail(loginDTO.getEmail());
		
		if(checkEmail.isPresent())
		{
			User user = modelMapper.map(loginDTO, User.class);
			user.setFirstName(user.getFirstName());
			System.out.println(user.getFirstName());
			user.setLastName(user.getLastName());
			System.out.println(user.getLastName());
			user.setId(user.getId());
			user.setRegisteredDate(user.getRegisteredDate());
			user.setUpdatedDate(LocalDateTime.now());
			user.setVerified(true);
			userRepository.save(user);
			return "Password Changed Successfully";
		}
		if(checkEmail.isEmpty())
		{
			return "Invalid Email";
		}
		
		return null;
	}
	
//	@Override
//	public String delete() {
//		userRepository.deleteById(userDto.getUserName());
//		return null;
//	}
	
}
