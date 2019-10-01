package com.bridgelabz.AirtelServices;

public class MissedCallAlert implements Services 
{
	private Services services;
	
	public void setService(Services service) 
	{
		this.services = service;
	}
	
	public void activateService() 
	{
		System.out.println("Missed call alert service activated");
	}

	public void deactivateService() 
	{
		System.out.println("Missed call alert service deactivated");		
	}

}
