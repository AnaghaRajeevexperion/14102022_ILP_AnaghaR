package com.experion.entity;

import java.util.ArrayList;

public class BankServices 
{
	private String serviceName;

	public BankServices(String serviceName)
	{
		
		this.serviceName = serviceName;
	}

	public String getServiceName() 
	{
		return serviceName;
	}

	public void setServiceName(String serviceName)
	{
		this.serviceName = serviceName;
	}

	public static ArrayList<BankServices> createServices() {
		// TODO Auto-generated method stub
		return null;
	}

	public static ArrayList<Product> createProducts(ArrayList<BankServices> allServicesList) {
		// TODO Auto-generated method stub
		return null;
	}
 
	
}