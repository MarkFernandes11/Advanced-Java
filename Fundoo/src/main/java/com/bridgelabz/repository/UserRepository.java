package com.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<Long, UserModel>  {

}
