package com.experion.entity;

public class Loan extends Product  {
	
	private String loanNumber;	
	private double loanBalance;
	
	public Loan(String productName, String loanNumber, double loanBalance) {
		super(productName);
		this.loanNumber = loanNumber;
		this.loanBalance = loanBalance;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public double getLoanBalance() {
		return loanBalance;
	}
	public void setLoanBalance(double loanBalance) {
		this.loanBalance = loanBalance;
	}
	@Override
	public void checkProductValidity() {
	
		System.out.println("Validity check of loan class called");	
	}
	
	
	
	
	
	
	
	
	}
	
	


