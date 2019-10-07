package com.bridgelabz.DemoProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Beverage beverage = context.getBean("beverage",Beverage.class);
        
        beverage.getBeverage();
        beverage.getBill();
        ((ClassPathXmlApplicationContext)context).close();
      
    }
}
