package com.bridgelabz.IOCJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeverageService 
{
	@Autowired
	@Qualifier("cappuccinoBean")
	private Beverage beverage;
	
	public void service()
	{
		beverage.getBeverage();
		beverage.getBill();
	}
}
