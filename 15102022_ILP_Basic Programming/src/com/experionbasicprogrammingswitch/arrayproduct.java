package com.experionbasicprogrammingswitch;

import java.util.Scanner;

public class arrayproduct {
	public static void main(String[] args) {
	String productName[]= new String[5];
	Scanner scanner = new Scanner(System.in);
	{
		System.out.println("Enter first product-");
		productName[0]=scanner.nextLine();
		System.out.println("Enter second product-");
		productName[1]=scanner.nextLine();
		System.out.println("Enter third product-");
		productName[2]=scanner.nextLine();
		System.out.println("Enter fourth product-");
		productName[3]=scanner.nextLine();
		System.out.println("Enter fifth product-");
		productName[4]=scanner.nextLine();
	System.out.println("Products");
	System.out.println("First product is "+productName[0]);
	System.out.println("Second product is "+productName[1]);
	System.out.println("Third product is "+productName[2]);
	System.out.println("Fourth product is "+productName[3]);
	System.out.println("Fifth product is "+productName[4]);
	}
}
}