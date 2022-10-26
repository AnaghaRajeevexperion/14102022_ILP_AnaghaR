package com.experion.utility;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Customer;

public class CustomerUtility {

	private static String customerName;

	public static void main(String[] args) {
		
		Customer customer=null;
		Scanner scanner=new Scanner(System.in);
		
		char mainChoice;
	
		Customer customerList[]=new Customer[3];
		ArrayList<Customer>CustomerList = new ArrayList<Customer>();
		
		do
		{
			System.out.println("*********Welcome to bank**************");
			System.out.println("1.Create accounts 2.Manage accounts 3.Exit");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			if(choice==1)
			{
				System.out.println("Which account would you like to create");
				 System.out.println("1.Saving max account  "
						 			+ " 2. Current account  "
						 			+ " 3.Loan account");

                 int choice1=scanner.nextInt();
                 System.out.println("Enter your choice");

                 if(choice1==1) {

                            customerList.add(Createproduct.createProducts());

                            System.out.println("Savings Account created");

                 }

                 if(choice1==2) {

                            customerList.add(Createproduct.createProducts());

                            System.out.println("Current Account Created");

                 }

                 if(choice1==3) {

                	 	customerList.add(Createproduct.createProducts());

                            System.out.println("Loan Account Created");

                 }

     

      }

      if(choice==2) {

                 System.out.println("Choose you account type");

                 System.out.println("1.SAVINGS   2.CURRENT     3.LOAN   ");

                 System.out.println("Which Service would you like to do");

                 System.out.println("1.CASH DEPOSIT   2.ATM WITHDRAWAL     3.ONLINE BANKING   4.MOBILE BANKING   5 CHEQUE DEPOSIT.");

                 int choicethree=scanner.nextInt();

                 if(choicethree==1) {

                            System.out.println("Enter the customer Id");

                            String customerId=scanner.nextLine();

                            for(Customer details:customerList) {

                            if(details.getCostumerID().compareTo(customerId)==0) {

                                      

                                    }

                 }

                

      }

     

      }
		

                

                

                

                

                

                

                

                

      }

}



}