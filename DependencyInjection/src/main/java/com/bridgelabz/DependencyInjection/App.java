package com.bridgelabz.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Employee employee = context.getBean("employee",Employee.class);
        employee.employeeDetails();
        
        Employee employee2 = context.getBean("employee2",Employee.class);
        employee2.employeeDetails();
        ((ClassPathXmlApplicationContext)context).close();
    }
}
