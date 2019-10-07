package com.bridgelabz.AirtelServices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Airtel 
{
    public static void main( String[] args )
    {
//        Services services = new MissedCallAlert();
//        services.activateService();
//        services.deactivateService();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Subscriber subscriber = context.getBean("subscriber",Subscriber.class);
    	
    	subscriber.activateServices();
    	//subscriber.deactivateServices();
    	((ClassPathXmlApplicationContext)context).close();
    	
    }
}
