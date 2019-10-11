package com.bridgelabz.fundoo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

public class UserModel 
{
	@Id
	private long userId;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private String contactNumber;
	private String emailAddress;
	private String createdDate;
	private String modifiedDate;
	private boolean isVerified;
	
	public UserModel() {
		// TODO Auto-generated constructor stub
	}

	public UserModel(long userId, String firstName, String lastName, String gender, int age, String contactNumber,
			String emailAddress, String createdDate, String modifiedDate, boolean isVerified) 
	{
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isVerified = isVerified;
	}

	public long getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	@Override
	public String toString() 
	{
		return "UserModel [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", age=" + age + ", contactNumber=" + contactNumber + ", emailAddress=" + emailAddress
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + ", isVerified=" + isVerified
				+ "]";
	}
	
}
