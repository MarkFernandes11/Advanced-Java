package com.bridgelabz.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {

	
    @Id
	private long userId;
	private String userName;
	private String emailId;
	private String mobileNo;
	private String password;
	private String createdDate;
	private String modifiedDate;
	private Boolean isVerify;
	
}
