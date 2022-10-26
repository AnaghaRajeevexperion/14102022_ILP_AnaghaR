package com.bank.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.entity.Product;
import com.bank.entity.Service;
import com.bank.service.BankService;

public class BankUtility {

	public static void main(String[] args) {

		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Service> allServicesList=new ArrayList<Service>();
		ArrayList<Account> accountList = new ArrayList<Account>();
		
		allServicesList = BankService.createServices();
		productList = BankService.createProducts(allServicesList);
		
		Customer customer = null;
		Scanner scanner = new Scanner(System.in);
		String customerId, customerName;
		System.out.println("***********Welcome to Bank***********");
		char mainChoice;
		do {
			
			System.out.println("1.Create Account\n2.Manage Account\n3.Display Account\n4.Exit");
			System.out.println("Enter your choice from the ones given above");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Select an account type that you want to create from below");
				System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account\n");
				int choiceOne = scanner.nextInt();
				scanner.nextLine();
				switch (choiceOne) 
				{
				case 1:System.out.println("Enter customer id");
					   customerId = scanner.nextLine();
					   System.out.println("Enter customer name");
					   customerName = scanner.nextLine();
					   if (customer == null) 
					   {
					   for (Product product : productList) 
					   {
						      if (product.getProductName().equalsIgnoreCase("Savings Max Account")) 
						      {
						    	  		accountList.add((Account) product);
						      }
					   }
					
										customer = new Customer(customerName, customerId, accountList);
					   }
					
					  else 
					 {
										customer.setAccountList(accountList);
					 }
					
					System.out.println("Savings Max Account created successfully for "+Customer.customerName);
					System.out.println("Account is active!!!");
					for (Product product : productList) {
						if (product.getProductName().equalsIgnoreCase("Savings Max Account")) {
							for (Service service : product.getServiceList()) 
							{
								System.out.println(service.getServiceName());
							}
						}

					}

					break;

				case 2:
					if(customer==null) {
						System.out.println("Enter customer id");
						customerId = scanner.nextLine();
						System.out.println("Enter customer name");
						customerName = scanner.nextLine();
					for (Product product : productList) {
						if (product.getProductName().equalsIgnoreCase("Current Account")) {

							accountList.add((Account) product);

						}
					}
					
						customer = new Customer(customerName, customerId, accountList);
					}
					
					else {
						for (Product product : productList) {
							if (product.getProductName().equalsIgnoreCase("Current Account")) {

								accountList.add((Account) product);

							}
						}
						
						customer.setAccountList(accountList);
						}

					System.out.println("Current Account created successfully for "+Customer.customerName);
					System.out.println("Account is active!!!");
					for (Product product : productList) {
						if (product.getProductName().equalsIgnoreCase("Current Account")) {
							for (Service service : product.getServiceList()) {
								System.out.println(service.getServiceName());
							}
						}

					}

					break;

				case 3:
					if(customer==null) {
						System.out.println("Enter customer id");
						customerId = scanner.nextLine();
						System.out.println("Enter customer name");
						customerName = scanner.nextLine();
						for (Product product : productList) {
							if (product.getProductName().equalsIgnoreCase("Loan Account")) {

								accountList.add((Account) product);

							}
						}
						
							customer = new Customer(customerName, customerId, accountList);
						
						}
					
					else
					{
						for (Product product : productList) {
							if (product.getProductName().equalsIgnoreCase("Loan Account")) {

								accountList.add((Account) product);

							}
						}
						
						
						customer.setAccountList(accountList);
					}
						
					System.out.println("Loan Account created successfully for "+Customer.customerName);
					System.out.println("Account is active!!!");
					for (Product product : productList) {
						if (product.getProductName().equalsIgnoreCase("Loan Account")) {
							for (Service service : product.getServiceList())
							{
								System.out.println(service.getServiceName());
							}
						}

					}break;
				}break;

			case 2:break;
			case 3:BankService.displayCustomerDetails(customer);
				   break;
			case 4:System.out.println("You can leave now");
				   System.exit(0);
				   break;

			}
			System.out.println("Do you want to continue?(y/n");
			mainChoice = scanner.next().charAt(0);

		} while (mainChoice == 'y');
	}
}
