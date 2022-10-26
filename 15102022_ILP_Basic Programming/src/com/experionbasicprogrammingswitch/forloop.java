package com.experionbasicprogrammingswitch;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String productNames[] = new String[5];

		System.out.println("Enter 5 prduct names");
		for (int index = 0; index < productNames.length; index++) {
		productNames[index] = scanner.nextLine();
		}
		System.out.println("*********** Product In Stock ******************* ");
		for (int index = 0; index < productNames.length; index++) {
		for(String productName:productNames)
			System.out.println(productName+" "+productName.length());
		//System.out.println(productNames[index}+" "+productNames[index].length());
		}
	}

}
