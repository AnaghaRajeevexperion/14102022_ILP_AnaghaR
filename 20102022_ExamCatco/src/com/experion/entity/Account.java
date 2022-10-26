package com.experion.entity;

public abstract class Account  {
	
	private String accountType;	
	private double accountBalance;
	
	
	
	
	public Account(String accountType, double accountBalance)
	{
		super();
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}




	public String getAccountType()
	{
		return accountType;
	}




	public void setAccountType(String accountType)
	{
		this.accountType = accountType;
	}




	public double getAccountBalance()
	{
		return accountBalance;
	}




	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}




	public String getCostumerID() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


