package com.bridgelabz.fundoo.model;

public class EmployeeModel 
{
	private long employeeId;
	private String employeeName;
	private String department;
	private String gender;
	private int age;
	private String contactNumber;
	private String emailAddress;
	private String createdDate;
	private String modifiedDate;
	private boolean isVerified;
	
	public EmployeeModel() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeModel(long employeeId, String employeeName, String department, String gender, int age,
			String contactNumber, String emailAddress, String createdDate, String modifiedDate, boolean isVerified) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.gender = gender;
		this.age = age;
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isVerified = isVerified;
	}

	public long getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public String getDepartment() {
		return department;
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
	
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void setDepartment(String department) {
		this.department = department;
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
	public String toString() {
		return "EmployeeModel [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department="
				+ department + ", gender=" + gender + ", age=" + age + ", contactNumber=" + contactNumber
				+ ", emailAddress=" + emailAddress + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
				+ ", isVerified=" + isVerified + "]";
	}
	
}
