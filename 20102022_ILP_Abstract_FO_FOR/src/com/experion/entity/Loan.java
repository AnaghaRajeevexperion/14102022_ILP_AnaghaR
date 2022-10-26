package com.experion.entity;

import com.experion.service.LoanService;

public class Loan extends Product implements LoanService {
	
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
	
		
	}
	@Override
	public void checkDueDate() {
		// TODO Auto-generated method stub
		System.out.println("Checking due date initiated");
	}
	@Override
	public void loanApproval() {
		// TODO Auto-generated method stub
		System.out.println("Loan approved");
		
	}
	
	
	
	
	
	
	
	
	}
	
	


