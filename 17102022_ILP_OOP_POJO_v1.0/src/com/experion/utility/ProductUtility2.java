package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Product;

public class ProductUtility2 {

	public static void main(String[] args) {
		
		String productCode;
		Scanner scanner=new Scanner(System.in);
		Product product = new Product();
		System.out.println("Enter the first product code:");
		productCode=scanner.nextLine();
		product.setProductCode(productCode);
		System.out.println("The product code is" + product.getProductCode());
		
		Product productTwo = new Product();
		System.out.println("Enter the second product code:");
		productCode=scanner.nextLine();
		product.setProductCode(productCode);
		productTwo.setProductCode(productCode);
		System.out.println("The product code is" + product.getProductCode());
			
		}

}
