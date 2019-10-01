package com.bridgelabz.DependencyInjection;

public class Person1 implements Employee 
{
	String empName;
	int empId;
	String department;
	
	public Person1() 
	{
		System.out.println("constructor called");
	}
		
	public Person1(String empName, int empId, String department) 
	{
		System.out.println("constructor called");
		this.empName = empName;
		this.empId = empId;
		this.department = department;
	}



	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}

	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public void doWork() 
	{		
		System.out.println("Doing my work");
	}

	public void getWorkDone() 
	{
		System.out.println("Searching someone to get my work done");
	}

	public void employeeDetails() 
	{		
		System.out.println("Name of employee is "+empName+" with id as "+empId+""
				+ " and from "+department+" department");
	}
	

}
