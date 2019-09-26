package com.data;

public class User 
{
	private String name;
	private String email;
	private String contactNumber;
	
	public User() {
		
	}
	
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", contactNumber=" + contactNumber + "]";
	}
	
}
