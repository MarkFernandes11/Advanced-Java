package com.bridgelabz.fundoo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.fundoo.model.User;

public interface UserRepository extends JpaRepository<User,Long>
{
	public Optional<User> findByEmail(String email);
	
	public String findByPassword(String password);
}
