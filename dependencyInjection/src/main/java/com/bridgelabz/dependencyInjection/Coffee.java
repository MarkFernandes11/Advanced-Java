package com.bridgelabz.dependencyInjection;

public class Coffee implements Beverage {

	public void getBeverage() 
	{
		System.out.println("Here is your Coffee.");
	}

	public void getBill() 
	{		
		System.out.println("You need to pay $1.49 for Coffee.");
	}

}

