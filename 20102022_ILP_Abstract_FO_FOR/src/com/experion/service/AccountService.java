package com.experion.service;

import com.experion.entity.Account;

public class AccountService {

	public void depositCash(Account account,double amount)
	{
		System.out.println("Depositing money over counter");
		
	}

	public void depositCash(Account account,String chequeNumber,double acmount)
	{
		System.out.println("Depositing money via cheque");
	}

	public void depositCash(Account account,double acmount,String upiCode)
	{
		System.out.println("Depositing money via online transfer");
	}
}

