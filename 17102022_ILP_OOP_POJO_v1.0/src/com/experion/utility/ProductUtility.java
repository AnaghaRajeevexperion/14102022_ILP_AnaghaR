package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		char mainChoice;
		int index=0;
		Scanner scanner=new Scanner(System.in);
		Product productList[]=new Product[3];
		do
		
			{
				System.out.println("1 for updation and 2 for display");
				int choice=scanner.nextInt();
				switch(choice)
				{case 1:productList[index]=Service.createProduct();
						index++;
						break;
				case 2: Service.displayProductDetails();
						break;
			}
				System.out.println("Do you want to continue:yes or no");
				mainChoice=scanner.next().charAt(0);
			}while(mainChoice=='y');	
		
		
		/*Service service=new Service();
		Service.inputProductDetails();
		Service.displayProductDetails();
		
		/*Product product = new Product();
		System.out.println("Enter theproduct code:");
		String productCode=scanner.nextLine();
		product.setProductCode(productCode);
		System.out.println("The product code is" + product.getProductCode());
		*/
			/*	
		}
	public static void displayProductDetails()
	{
		System.out.println("Product code"+" " +"Product name"+" "+"Product description"+ " " +"Product price" + " " +"Open date" + " " +"Validity date" + " " + "Expiry date" + " " + "active");
	    String productCode = null;
		String productName = null;
		String productDescription = null;
		String openDate=null;
		String validityDate = null;
		String active=null;
		System.out.println(productCode+ " "+productName+ " "+productDescription+" "+openDate+ "  "+validityDate+ " "+active);
		*/
	}
}
