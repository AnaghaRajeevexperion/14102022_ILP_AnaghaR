package com.bank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.bank.entity.Rate;
import com.bank.entity.Service;

public class BankService 
{
	public static Service createService()
	{
		
		/******************Taking input from user to create a service******************/
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the following details to create service ");
		System.out.println("Service code: ");
		String serviceCode=scanner.nextLine();
		
		System.out.println("Service name: ");
		String serviceNode=scanner.nextLine();
		
		System.out.println("Service Description: ");
		String serviceDescription=scanner.nextLine();
		
		System.out.println("Open date: ");
		String openDate=scanner.nextLine();
		
		System.out.println("Validity date: ");
		String validityDate=scanner.nextLine();
		
		
		System.out.println("Expiry date: ");
		String expiryDate=scanner.nextLine();
		
		
		
		/* ************String to Date conversion******************/
		Date openDateConverted=stringToDate(openDate);
		Date validityDateConverted=stringToDate(validityDate);
		Date expiryDateConverted=stringToDate(expiryDate);
		
				
		/* **************Creation of service object******************/
		Service service= new Service("SCD100","Cash Deposit","Cash Deposit",new Date (2022,10,27 ),
				new Date(2022,5,28),new Date(42022,7,30));
		return service;
	}
	
	
	public static void createRateCard(Service service)
	{
		Scanner scanner=new Scanner(System.in);
		Rate rate = new Rate();
		
		
		System.out.println("*************Enter the rate card for"+service.getServiceName()+ "******************");
		System.out.println("Enter the number of tiers you want to add-");
		int noOfTiers=scanner.nextInt();
		int []min=new int[3];
		int []max=new int[3];
		double [] fees=new double[3];
		
		for(int tier=0;tier<noOfTiers;tier++)
		{
			System.out.println("Enter the MIN MAX and RATE for the "+ (tier+1)+"tier");
			min[tier]=scanner.nextInt();
			max[tier]=scanner.nextInt();
			fees[tier]=scanner.nextInt();
			System.out.println("Successfully inserted the " +(tier+1)+"tier");
			if(tier< noOfTiers)
			{
				
			
			System.out.println("Do you want to add more tiers - (y/n)");
			char ch= scanner.next().charAt(0);
			if(ch=='y')
				continue;
			else
				break;
			
		}
	}
		
		service.setRate(rate);
		service.getRate().setMin(min);
		service.getRate().setMax(max);
		service.getRate().setRate(fees);
		
		System.out.println("*******Successfully created rate card for service"+service.getServiceName()+"***********");
		
		
		
		min[0]=0;
		min[1]=2000;
		min[2]=5000;
		
		max[0]=2000;
		max[1]=5000;
		max[2]=999999;
		
		
		fees[0]=0.25;
		fees[1]=0.5;
		fees[2]=0.1;
		
		service.setRate(rate);
		service.getRate().setMin(min);
		service.getRate().setMax(max);
		service.getRate().setRate(fees);
		
		
	}
	public static void displayServiceDetails(Service service)
	{
		System.out.println("**************Service Details****************");
		System.out.println("Service code"+ " "+"Service Name"+" "+"service Description"+" "+"Open Date" + " "+
		             "Validity date"+ " "+"Expiry date");
		System.out.println(service.getServiceCode()+" "+service.getServiceName()+" "+service.getServiceDesc()+ " "+
		        service.getOpenDate()+ " "+service.getValidityDate()+ " "+service.getExpiryDate());
		
		System.out.println("*******Rate card for service"+service.getServiceName()+"is given below");
		
		System.out.println("Min Max Rate");
		for(int index=0;index<service.getRate().getMin().length;index++)
		{
			if((service.getRate().getMax()[index] <= 999999) && (service.getRate().getMax()[index]!=0))
					System.out.println(service.getRate().getMin()[index]+ " "+service.getRate().getRate()[index]);
		}
		
		
	}
		
		
	public static Date stringToDate(String dateString)
	{
		Date convertedDate=null;
		try
		{
		   convertedDate=new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
			
	}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return convertedDate;
	}

}




