package com.bridgelabz.IOCJava;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("teaBean")
public class Tea implements Beverage
{
	public void getBeverage() 
	{
		System.out.println("Here is your Tea.");		
	}

	public void getBill() 
	{
		System.out.println("You need to pay $1 for Tea.");		
	}
	
}
