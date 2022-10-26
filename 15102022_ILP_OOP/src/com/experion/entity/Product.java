package com.experion.entity;

import java.util.Scanner;

public class Product {
	String productCode;
	String productName;
	String productDescription;
	double productPrice;
	String openDate;
	String validityDate;
	String expiryDate;
	boolean active;
	
	public void inputProductDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter product code:");
		productCode=scanner.nextLine();
		System.out.println("Enter product name:");
		productName=scanner.nextLine();
		System.out.println("Enter product description:");
		productDescription=scanner.nextLine();
		System.out.println("Enter product price:");
		productPrice=scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter product open date:");
		openDate=scanner.nextLine();
		System.out.println("Enter product validity date:");
		validityDate=scanner.nextLine();
		System.out.println("Enter product expiry date:");
		expiryDate=scanner.nextLine();
		System.out.println("Enter product active date:");
		active=scanner.nextBoolean();
	}
	public void displayProductDetails()
	{
		System.out.println("Product code"+" " +"Product name"+" "+"Product description"+ " " +"Product price" + " " +"Open date" + " " +"Validity date" + " " + "Expiry date" + " " + "active");
	    System.out.println(productCode+ " "+productName+ " "+productDescription+" "+openDate+ "  "+validityDate+ " "+active);
	}

	}
