package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
static Product product= new Product();
private static String productCode;
private static String productName;
private static String productDescription;
private static String openDate;
private static String validityDate;
private static String active;
	public static void inputProductDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter product code:");
		String productCode = scanner.nextLine();
		System.out.println("Enter product name:");
		String productName = scanner.nextLine();
		System.out.println("Enter product description:");
		String productDescription = scanner.nextLine();
		System.out.println("Enter product price:");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter product open date:");
		String openDate = scanner.nextLine();
		System.out.println("Enter product validity date:");
		String validityDate = scanner.nextLine();
		System.out.println("Enter product expiry date:");
		String expiryDate = scanner.nextLine();
		System.out.println("Enter product active date:");
		boolean active = scanner.nextBoolean();
		
		product.setProductCode(productCode);
		product.setProductName(productName);
		product.setProductPrice(productPrice);
		product.setProductDescription(productDescription);
		product.setExpiryDate(expiryDate);
		product.setActive(active);
		product.setValidityDate(validityDate);
		product.setOpenDate(openDate);
		
		
		}
	public static void displayProductDetails()
	{
		System.out.println("Product code"+" " +"Product name"+" "+"Product description"+ " " +"Product price" + " " +"Open date" + " " +"Validity date" + " " + "Expiry date" + " " + "active");
	
		
		System.out.println(productCode+ " "+productName+ " "+productDescription+" "+openDate+ "  "+validityDate+ " "+active);
	}
	public static Product createProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
