package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.beans.StudentRegistration;

@Controller
public class StudentDeleteController 
{
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/student")
	
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("registrationNumber") String registrationNumber) 
	{
		System.out.println("In deleteStudentRecord() ");		
		return StudentRegistration.getInstance().deleteStudent(registrationNumber);
	}
}
