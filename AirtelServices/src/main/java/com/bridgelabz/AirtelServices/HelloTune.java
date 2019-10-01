package com.bridgelabz.AirtelServices;

public class HelloTune implements Services 
{
	private Services services;
	
	public void setService(Services service) 
	{
		this.services = service;
	}
	
	public void activateService() 
	{
		System.out.println("Hellotune service activated");
	}

	public void deactivateService() 
	{
		System.out.println("Hellotune service deactivated");		
	}

}
