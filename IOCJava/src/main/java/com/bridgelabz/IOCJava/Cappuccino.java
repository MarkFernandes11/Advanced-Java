package com.bridgelabz.IOCJava;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cappuccinoBean")
public class Cappuccino implements Beverage 
{
	public void getBeverage() 
	{		
		System.out.println("Here is your Cappuccino.");
	}

	public void getBill() 
	{
		System.out.println("You need to pay $2 for Cappuccino.");
	}

}
