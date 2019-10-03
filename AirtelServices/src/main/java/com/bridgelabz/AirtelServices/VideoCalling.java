package com.bridgelabz.AirtelServices;

public class VideoCalling implements Services 
{
private Services services;
	
	public void setService(Services service) 
	{
		this.services = service;
	}
	
	public void activateService() 
	{
		System.out.println("Video calling service activated");
	}

	public void deactivateService() 
	{
		System.out.println("Video calling service deactivated");		
	}

}
