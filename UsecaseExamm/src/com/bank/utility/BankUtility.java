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

		//ArrayList<Account> accountList = new ArrayList<Account>();
		char mainChoice;
		Customer customer = null;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Service> allServicesList = new ArrayList<Service>();
		allServicesList = BankService.createServices();
		
		do {
			System.out.println("***********Welcome to Bank***********");
			System.out.println("1.Create Account\n2.Manage Account\n3.Display Account\n4.Exit");
			System.out.println("Enter your choice from the ones given above");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
//				customerList.add(BankServices.createAccounts(customerList));
				customer = BankService.createAccounts(allServicesList);
				break;
//
			case 2:
				System.out.println("Enter the customer code: ");
				String customerCode = scanner.nextLine();
				if (customer != null) {
					if (customerCode.compareTo(customer.getCustomerCode()) == 0)
						BankService.manageAccounts(customer);
					else
						System.out.println("Customer code not found!!");

				} 
				else
					System.out.println("Customer code not found!!");
				break;

			case 3:
				BankService.displayAccounts(customer);
				break;

			case 4:
				System.out.println("Thank you for choosing our Bank...You are now exiting from this portal.");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
			}

//			System.out.println(customer.getCustomerCode()+" "+customer.getCustomerName()+" "+customer.getAccountList());


			System.out.println("Do you want to continue to other bank services? (y/n)");
			mainChoice = scanner.next().charAt(0);

		} while (mainChoice == 'y' || mainChoice == 'Y');

	}
}
