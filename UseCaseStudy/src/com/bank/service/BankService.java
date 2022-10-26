package com.bank.service;

import java.util.ArrayList;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.entity.Product;
import com.bank.entity.Service;

public class BankService 
{

	public static ArrayList<Service> createServices() 
	{

		ArrayList<Service> allServiceList = new ArrayList<Service>();
		allServiceList.add(new Service("Online Banking"));
		allServiceList.add(new Service("ATM Withdrawal"));
		allServiceList.add(new Service("Cash Deposit"));
		allServiceList.add(new Service("Cheque Deposit"));
		allServiceList.add(new Service("Mobile Banking"));

		return allServiceList;

	}

	public static ArrayList<Product> createProducts(ArrayList<Service> allServiceList)
	{

		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(createSavingsMaxAccount(allServiceList));
		productList.add(createCurrentAccount(allServiceList));
		productList.add(createLoanAccount(allServiceList));

		return productList;

	}
	
	private static Product createSavingsMaxAccount(ArrayList<Service> allServiceList) {
		ArrayList<Service> savingsMaxServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) 
		{
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)|| (service.getServiceName().compareTo("ATM Withdrawal") == 0)|| (service.getServiceName().compareTo("Online Banking") == 0))
			{
				savingsMaxServiceList.add(service);
			}
		}
		Product product = new Account("PRDSMX1000", "Savings Max Account", savingsMaxServiceList, 2000);
		return product;

	}
	
	
	private static Product createCurrentAccount(ArrayList<Service> allServiceList)
	{

		ArrayList<Service> currentServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) 
		{
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)|| (service.getServiceName().compareTo("ATM Withdrawal") == 0)|| (service.getServiceName().compareTo("Online Banking") == 0)|| (service.getServiceName().compareTo("Mobile Banking") == 0))
			{
				currentServiceList.add(service);
			}
		}
		Product product = new Account("PRDCURRENT50", "Current Account", currentServiceList, 3000);
		return product;

	}


	private static Product createLoanAccount(ArrayList<Service> allServiceList) 
	{

		ArrayList<Service> loanServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) 
		{
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)|| (service.getServiceName().compareTo("Cheque Deposit") == 0)) 
			{
				loanServiceList.add(service);
			}
		}
		Product product = new Account("PRDLOAN100", "Loan Account", loanServiceList, 50000);
		return product;

	}

	
	public static void displayCustomerDetails(Customer customer)
	{
		
		
		System.out.println("Customer Id  \tCustomer Name     \tAccount Type");
		for(Account account:customer.getAccountList())
		{
			System.out.println( customer.getCustomerId()+"     "+customer.getCustomerName()+"     "+account.getProductName());
			
		}
		
	}

}
