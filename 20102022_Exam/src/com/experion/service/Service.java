package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class Service {

	public static Product createProduct(String productType) {
		ArrayList<BankServices>bankServices=new ArrayList<BankServices>();
		bankServices.add(new BankServices("SOB100","Online banking"));
		bankServices.add(new BankServices("SMB200","Mobile banking"));
		bankServices.add(new BankServices("SCD300","Cash deposit"));
		
		Product product=null;
		if(productType.compareTo("Cards")==0)
		{
			product =new Card("PRDMC100","Master card","Cards","Master");
		}
		else if (productType.compareTo("Accounts")==0)
		{
			product =new Account("AC3242","Womens savings account","Accounts","Savings account", bankServices);
		}
		return product;
	}

	
	public static void createbuyProduct() {
		// TODO Auto-generated method stub
		
	}




	public static void displayProductDetails(ArrayList<Product>productList) {
		
		Card card=null;
		Account account=null;
		
		System.out.println("Product code"+ "  "+"Product name"+"Product type"+" "+"Card type"+"  "+ "AccountType");
		for(Product product :productList)
		{
			if(product instanceof Card)
			{		
				card=(Card)product;
				System.out.println(card.getProductCode() + "  "+ card.getProducName()+ "  "+card.getProductType()+"  " +card.getCardType());
		}
			else if (product instanceof Account) {
				
				account=(Account)product;
			System.out.println(account.getProductCode() + "   "+ account.getProducName()+ "  "+ "  "+account.getProductType()+account.getAccountType());
			System.out.println("List of products are given below");
			for(BankServices bankServices :account.getBankServices())
			{
				System.out.println(bankServices.getServiceName());
			}
				
		}
	}

	}
}

