package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.Product;

public class Service
{
public static ArrayList<BankServices> createServices(){
		
		ArrayList<BankServices>allServiceList = new ArrayList<BankServices>();	
		allServiceList.add(new BankServices("Mobile Banking"));
		allServiceList.add(new BankServices("ATM Withdrawal"));
		allServiceList.add(new BankServices("Cash Deposit"));
		allServiceList.add(new BankServices("Cheque Deposit"));
		
		return allServiceList;
		
	}
	public static ArrayList<Product> createProducts(ArrayList<Service> allServiceList){
		
		ArrayList<Product>productList = new ArrayList<Product>();	
//		productList.add(createSavingsMaxAccount(allServiceList));
//		productList.add(createCurrentAccount(allServiceList));
		productList.add(createLoanAccount(allServiceList));
		
		
		
		return productList;
		
	}
	private static  Product createLoanAccount(ArrayList<Service> allServiceList) {
		
		ArrayList<Service>loanServiceList = new ArrayList<Service>();
		for(Service service : allServiceList)
		{
			if((service.getServiceName().compareTo("Cash Deposit")==0) || (service.getServiceName().compareTo("Cheque Deposit")==0))
			{
				loanServiceList.add(service);
			}
		}
		Product product = new Account("PRDLOAN100", "Loan Account",loanServiceList,10000);
		return product;
		
	}
}
