package com.experion.entity;

import java.util.ArrayList;

public class Account extends Product
{
	private String accountType;
	private String accountCode;
	private double accountBalance;
	private ArrayList<BankServices>bankservices;
	public Account(String productCode, String productName, ArrayList<BankServices> serviceList, String accountType,
			String accountCode, double accountBalance, ArrayList<BankServices> bankservices) {
		super(productCode, productName, serviceList);
		this.accountType = accountType;
		this.accountCode = accountCode;
		this.accountBalance = accountBalance;
		this.bankservices = bankservices;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public ArrayList<BankServices> getBankservices() {
		return bankservices;
	}
	public void setBankservices(ArrayList<BankServices> bankservices) {
		this.bankservices = bankservices;
	}

	
	
}