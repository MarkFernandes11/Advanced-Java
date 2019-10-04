package com.bridgelabz.IOCJava;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.IOCJava")
public class BeverageConfig 
{
	public void beverageBean() 
	{
		//return new Coffee();
		
	}
}
