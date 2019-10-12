package com.bridgelabz.fundoo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "User Table")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "FirstName")
//	@NonNull
//	@Size(min = 3, message = "name cannot be less than 3 characters")
	private String firstName;
	
//	@Column(name = "LastName")
//	@Size(min = 3, max = 30)
	private String lastName;
	
	@Column(name = "UserName")
//	@NonNull
//	@Email
//	@Size(min = 8, max = 30)
	private String email;
	
	@Column(name = "Password")
//	@NonNull
//	@Size(min = 8, max = 30)
	private String password;
	
	@Column(name = "VerifiedUser")
//	@NonNull
	private boolean isVerified = false;
	
	@Column(name = "RegistrationDate")
//	@NonNull
	private LocalDateTime registeredDate;
	
	@Column(name = "UpdatedDate")
//	@NonNull
	private LocalDateTime updatedDate;

	public User() {
	}
	
	public User(long id, String firstName, String lastName, String email, String password, boolean isVerified,
			LocalDateTime registeredDate, LocalDateTime updatedDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.isVerified = isVerified;
		this.registeredDate = registeredDate;
		this.updatedDate = updatedDate;
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public LocalDateTime getRegisteredDate() {
		return registeredDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public void setRegisteredDate(LocalDateTime registeredDate) {
		this.registeredDate = registeredDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
	
}
