package com.experion.entity;

import com.experion.service.AccountCardService;

public  class Card extends Product implements AccountCardService  	{
	
	private String cardNumber;	
	private double cardBalance;
	
	
	public Card(String productName, String cardNumber, double cardBalance) {
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getCardBalance() {
		return cardBalance;
	}
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}
	@Override
	public void checkProductValidity() {
		// TODO Auto-generated method stub
		
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
	
	

