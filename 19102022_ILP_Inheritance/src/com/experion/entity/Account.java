package com.experion.entity;

import java.util.ArrayList;

public class Account extends Product {
	
	private String accountType;
	ArrayList<BankServices>bankServices=new ArrayList<BankServices>();
	
	public Account(String productCode, String producName, String productType, String accountType,ArrayList<BankServices> bankServices) 
	{
		super(productCode, producName, productType);
		this.accountType = accountType;
		this.bankServices = bankServices;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public ArrayList<BankServices> getBankServices() {
		return bankServices;
	}
	public void setBankServices(ArrayList<BankServices> bankServices) {
		this.bankServices = bankServices;
	}
	
	
}
	
	

