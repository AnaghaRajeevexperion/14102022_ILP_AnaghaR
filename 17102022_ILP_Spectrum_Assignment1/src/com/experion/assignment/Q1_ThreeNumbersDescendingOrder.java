package com.experion.assignment;

import java.util.Scanner;

public class Q1_ThreeNumbersDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int firstNumber,secondNumber,thirdNumber;
		
		System.out.println("Enter the first number: ");
		firstNumber = scanner.nextInt();
		System.out.println("Enter the second number: ");
		secondNumber = scanner.nextInt();
		System.out.println("Enter the third number: ");
		thirdNumber = scanner.nextInt();
		
		System.out.println("The three numbers in descending order:-");
		if((firstNumber>secondNumber) && (firstNumber>thirdNumber))
		{
			if(secondNumber>thirdNumber)
				System.out.println(firstNumber+" "+secondNumber+" "+thirdNumber);
			else
				System.out.println(firstNumber+" "+thirdNumber+" "+secondNumber);
		}
		else if((secondNumber>firstNumber) && (secondNumber>thirdNumber))
		{
			System.out.println(secondNumber);
			if(firstNumber>thirdNumber)
				System.out.println(secondNumber+" "+firstNumber+" "+thirdNumber);
			else
				System.out.println(secondNumber+" "+thirdNumber+" "+firstNumber);
		}
		else
		{
			if(firstNumber>secondNumber)
				System.out.println(thirdNumber+" "+firstNumber+" "+secondNumber);
			else
				System.out.println(thirdNumber+" "+secondNumber+" "+firstNumber);
		}
	}

}
