package com.example.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration 
{
	private List<Student> studentRecords;
	
	private static StudentRegistration studentRegistration;
	
	private StudentRegistration() 
	{
		studentRecords = new ArrayList<Student>(); 
	}
	
	public static StudentRegistration getInstance() 
	{
		if(studentRegistration == null)
		{
			studentRegistration = new StudentRegistration();
			return studentRegistration;
		}
		else 
		{
			return studentRegistration;
		}
	}
	
	public void add(Student student) 
	{
		studentRecords.add(student);
	}
	
	public String updateStudent(Student studentSearch)
	{
		for(int i = 0 ; i < studentRecords.size(); i++)
		{
			Student student = studentRecords.get(i);
			if(student.getRegistrationNumber().equals(studentSearch.getRegistrationNumber()))
			{
				studentRecords.set(i,studentSearch); //Updated new record
				return "Update successful";
			}			
		}
		return "Update un-successful";
	}
	
	public String deleteStudent(String registrationNumber)
	{
		for(int i = 0 ; i < studentRecords.size(); i++)
		{
			Student student = studentRecords.get(i);
			if(student.getRegistrationNumber().equals(registrationNumber))
			{
				studentRecords.remove(i); //Updated new record after deleting
				return "Delete successful";
			}			
		}
		return "Delete un-successful";
	}
	
	public List<Student> getStudentRecords() 
	{
		return studentRecords;
	}
	
}


















