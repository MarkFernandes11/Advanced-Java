package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.beans.Student;
import com.example.beans.StudentRegistration;
import com.example.beans.StudentRegistrationReply;

@Controller
public class StudentRegistrationController 
{
	@RequestMapping(method = RequestMethod.POST, value = "/register/student")
	
	@ResponseBody
	public StudentRegistrationReply studentRegistration(@RequestBody Student student) 
	{
		System.out.println("In studentRegistration()");
		StudentRegistrationReply reply = new StudentRegistrationReply();
		StudentRegistration.getInstance().add(student);
		
		//We are setting the below value just to reply a message back to the caller
		reply.setName(student.getName());
		reply.setAge(student.getAge());
		reply.setRegistrationNumber(student.getRegistrationNumber());
		reply.setRegistrationStatus("Successful");
		
		return reply;
	}
}
