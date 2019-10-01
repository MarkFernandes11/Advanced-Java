package com.bridgelabz.AirtelServices;

public class Subscriber 
{
	private Services services;
	
	public void setService(Services service) 
	{
		this.services = service;
	}
	
	public void activateServices()
	{
		services.activateService();
	}
	
	public void deactivateServices()
	{
		services.deactivateService();
	}
}
