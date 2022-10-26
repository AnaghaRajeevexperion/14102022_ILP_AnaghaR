package com.experion.entity;

import com.experion.service.AccountCardService;

public class Account extends Product implements AccountCardService   {
	
	private String accountNumber;	
	private double accountBalance;
	
	
	public Account(String productName, String accountNumber, double accountBalance) {
		super(productName);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public void checkProductValidity() {

	
	}
	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Checking balance initiated");
		
	}
	public void cashWithdrawal() {
		// TODO Auto-generated method stub
		System.out.println("Checking withdraw initiated");
		
	}
	@Override
	public void checkWithdrawal() {
		// TODO Auto-generated method stub
		
	}
	
	
	}

	
	


