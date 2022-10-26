package com.experion.entity;

import com.experion.service.ATMwithdrawal;
import com.experion.service.CashDeposit;
import com.experion.service.OnlineBanking;

public class SavingsMaxAccount extends Account implements CashDeposit,ATMwithdrawal,OnlineBanking {
	

	private double cashDeposit;

	public SavingsMaxAccount(String accountType, double accountBalance, double cashDeposit) {
		super(accountType, accountBalance);
		this.cashDeposit = cashDeposit;
	}

	public double getCashDeposit() {
		return cashDeposit;
	}

	public void setCashDeposit(double cashDeposit) {
		this.cashDeposit = cashDeposit;
	}

	
	
}