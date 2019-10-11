package com.bridgelabz.fundoo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


import com.bridgelabz.fundoo.dto.UserDTO;

@Repository
public class UserRepository 
{
	
	/**
	 *  we are autowiring jdbc template using the properties we have configured in
	 *  application.properties. Spring automatically detects and creates jdbc temp-
	 *  plate obj using the configuration.  
	 */
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	// UserDataTable
	public List<UserDTO> getAllUsers() 
	{
		List<UserDTO> usersList = new ArrayList<>();
		String sql = "SELECT * FROM LoginDB.UserTable";
		
		usersList.addAll(jdbcTemplate.queryForList(sql, UserDTO.class));
		
		return usersList;		
	}
	
}
