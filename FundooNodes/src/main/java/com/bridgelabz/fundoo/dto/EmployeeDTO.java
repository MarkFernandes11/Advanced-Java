package com.bridgelabz.fundoo.dto;

public class EmployeeDTO 
{
	private String employeeName;
	private String department;
	private String gender;
	private int age;
	private String contactNumber;
	private String emailAddress;
	
	public EmployeeDTO() {
	}
	
	public EmployeeDTO(String employeeName, String department, String gender, int age, String contactNumber,
			String emailAddress) 
	{
		this.employeeName = employeeName;
		this.department = department;
		this.gender = gender;
		this.age = age;
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
	}
		
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
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
	public String toString() {
		return "EmployeeDTO [employeeName=" + employeeName + ", department=" + department + ", gender=" + gender
				+ ", age=" + age + ", contactNumber=" + contactNumber + ", emailAddress=" + emailAddress + "]";
	}
	
}
