package com.bridgelabz.fundoo.dto;

public class UserDTO 
{
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private String contactNumber;
	private String emailAddress;
	
	public UserDTO() {
	}
	
	public UserDTO(String firstName, String lastName, String gender, int age, String contactNumber,
			String emailAddress) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() 
	{
		return "UserDTO [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", age=" + age
				+ ", contactNumber=" + contactNumber + ", emailAddress=" + emailAddress + "]";
	}
	
	
}
