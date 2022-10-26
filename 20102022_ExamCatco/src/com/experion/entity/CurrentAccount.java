package com.experion.entity;

import com.experion.service.ATMwithdrawal;
import com.experion.service.CashDeposit;
import com.experion.service.MobileBanking;
import com.experion.service.OnlineBanking;

public class CurrentAccount extends Account implements CashDeposit,ATMwithdrawal,OnlineBanking,MobileBanking

{

	private double cashDeposit;

	public CurrentAccount(String accountType, double accountBalance, double cashDeposit) {
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
