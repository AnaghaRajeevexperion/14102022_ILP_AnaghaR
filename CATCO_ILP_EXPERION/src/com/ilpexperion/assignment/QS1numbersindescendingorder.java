package com.ilpexperion.assignment;

import java.util.Scanner;

public class QS1numbersindescendingorder {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int firstnumber,secondnumber,thirdnumber;
		System.out.println("Enter first number");
		firstnumber=scanner.nextInt();
		System.out.println("Enter second number");
		secondnumber=scanner.nextInt();
		System.out.println("Enter third number");
		thirdnumber=scanner.nextInt();
		System.out.println("Numbers in descending order");
		if((firstnumber>=secondnumber)&&(firstnumber>=thirdnumber))
		{
				if(secondnumber>=thirdnumber)
				{
					System.out.println(firstnumber+" > "+secondnumber+" > "+thirdnumber);
				}
				else
				{
					System.out.println(firstnumber+" > "+thirdnumber+" > "+secondnumber);
				}
		}
		
		if((secondnumber>=firstnumber)&&(secondnumber>=thirdnumber))
		{
			if(firstnumber>=thirdnumber)
			{
				System.out.println(secondnumber+" > "+firstnumber+" > "+thirdnumber);
			}
			else
			{
				System.out.println(secondnumber+" > "+thirdnumber+" > "+firstnumber);
			}
		}
		if((thirdnumber>=secondnumber)&&(thirdnumber>=firstnumber))
		{
				if(secondnumber>=firstnumber)
				{
					System.out.println(thirdnumber+" > "+secondnumber+" > "+firstnumber);
				}
				else
				{
					System.out.println(thirdnumber+" > "+firstnumber+" > "+secondnumber);
				}
		}
}
}
