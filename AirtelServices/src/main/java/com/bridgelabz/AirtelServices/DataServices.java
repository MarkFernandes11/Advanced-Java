package com.bridgelabz.AirtelServices;

public class DataServices implements Services 
{	
	private Services services;
	
	public void setService(Services service) 
	{
		this.services = service;
	}

	public void activateService() 
	{
		System.out.println("Data service activated");
	}

	public void deactivateService() 
	{
		System.out.println("Data service deactivated");		
	}

}
