package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;

public class ProductUtility {

	public static void main(String[] args) {
		
		/*Account account=new Account("Womens savings account","ACC3223",1000);
		AccountService accountService=new AccountService();
		accountService.depositCash(account, 20000);
		accountService.depositCash(account, 0,"anagharajeev@okhdfc.com");
		accountService.depositCash(account, "AEGAA342432",20000);
		*/
		Product product=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.Account 2.Card 3.Loan");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			product=new Account( "Womens savings account","ACC3223",1000);
			Account account=(Account)product;
			account.cashWithdrawal();
			account.checkBalance();
		}
		else if (choice==2)
		{
			product=new Card( "Master card","CH3223",1000);
			Card card=(Card)product;
			card.cashWithdrawal();
			card.checkBalance();
		}
		else if (choice==3)
		{
			product=new Loan( "Home Loan","LOAN3223",1000);
			Loan loan=(Loan)product;
			loan.checkDueDate();
			loan.loanApproval();
		}
		
		product.checkProductValidity();
	
	}
}