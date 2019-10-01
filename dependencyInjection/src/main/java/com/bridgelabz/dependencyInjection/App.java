package com.bridgelabz.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{				
		ApplicationContext context = new ClassPathXmlApplicationContext("src/main/java/Beans.xml");
		Beverage beverage = context.getBean("coffee",Beverage.class);
		
		beverage.getBeverage();
		beverage.getBill();
	}

}
