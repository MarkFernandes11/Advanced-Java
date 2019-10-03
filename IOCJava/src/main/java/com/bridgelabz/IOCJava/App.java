package com.bridgelabz.IOCJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(BeverageConfig.class);
    	BeverageService beverageService = context.getBean(BeverageService.class);
    	beverageService.service();
    	
    	((AnnotationConfigApplicationContext)context).close();
    }
}
