package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;
import com.experion.service.Service;

public class Accountutility {
public static void main(String[] args) {
		
		char mainChoice;
		
		Scanner scanner=new Scanner(System.in);
		ArrayList<Account>productList=new ArrayList<Account>();
		do {
			System.out.println("To Add Card details:Press One");
			System.out.println("To Add account details:Press two");
			System.out.println("To Buy Product:Press Three");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1: productList.add(Service.createAccounts("Account"));
			
					break;
			
			case 2: productList.add(Service.createProduct("Services"));
					break;
			
			case 3:Service.displayProductDetails(productList);
					break;
			default:System.out.println("Invalid choice");
			
			}
			System.out.println("Do you wnat to continue-y or n");
			mainChoice=scanner.next().charAt(0);
			
			
			
		}while(mainChoice=='y');
	}
}