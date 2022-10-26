package com.experion.entity;

import com.experion.service.CashDeposit;
import com.experion.service.ChequeDeposit;

public class LoanAccount extends Account implements CashDeposit ,ChequeDeposit {
	
	private double cashDeposit;
	private double chequeDeposit;
	public LoanAccount(String accountType, double accountBalance, double cashDeposit, double chequeDeposit) {
		super(accountType, accountBalance);
		this.cashDeposit = cashDeposit;
		this.chequeDeposit = chequeDeposit;
	}
	public double getCashDeposit() {
		return cashDeposit;
	}
	public void setCashDeposit(double cashDeposit) {
		this.cashDeposit = cashDeposit;
	}
	public double getChequeDeposit() {
		return chequeDeposit;
	}
	public void setChequeDeposit(double chequeDeposit) {
		this.chequeDeposit = chequeDeposit;
	}
	
	
	
	
	
	



}
