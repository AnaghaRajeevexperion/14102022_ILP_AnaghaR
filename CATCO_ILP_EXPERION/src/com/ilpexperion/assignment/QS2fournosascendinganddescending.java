package com.ilpexperion.assignment;

import java.util.Scanner;

public class QS2fournosascendinganddescending {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int firstnumber,secondnumber,thirdnumber,fourthnumber;
		System.out.println("Enter first number");
		firstnumber=scanner.nextInt();
		System.out.println("Enter second number");
		secondnumber=scanner.nextInt();
		System.out.println("Enter third number");
		thirdnumber=scanner.nextInt();
		System.out.println("Enter fourth number");
		fourthnumber=scanner.nextInt();
		System.out.println("Numbers in descending order");
		if((firstnumber>=secondnumber)&&(firstnumber>=thirdnumber)&&(firstnumber>=fourthnumber))
		{
				if((secondnumber>=thirdnumber)&&(secondnumber>=fourthnumber))
				{
					if(thirdnumber>=fourthnumber)
					{
						System.out.println(firstnumber+" > "+secondnumber+" > "+thirdnumber+" > "+fourthnumber);
					}
					
				}
				else
				{
					System.out.println(firstnumber+" > "+secondnumber+" > "+fourthnumber+" > "+thirdnumber);
				}
		}
		
		if((secondnumber>=firstnumber)&&(secondnumber>=thirdnumber)&&(secondnumber>=fourthnumber))
		{
			if((firstnumber>=thirdnumber)&&(firstnumber>=fourthnumber))
			{
				if(thirdnumber>=fourthnumber)
				{
				System.out.println(secondnumber+" > "+firstnumber+" > "+thirdnumber+" > "+fourthnumber);
			}
			else
			{
				System.out.println(secondnumber+" > "+firstnumber+" > "+fourthnumber+" > "+thirdnumber);
			}
		}
		

		}
		
		
		if((thirdnumber>=firstnumber)&&(thirdnumber>=secondnumber)&&(thirdnumber>=fourthnumber))
		{
			if((fourthnumber>=secondnumber)&&(fourthnumber>=firstnumber))
			{
				if(firstnumber>=secondnumber)
				{
				System.out.println(thirdnumber+" > "+fourthnumber+" > "+firstnumber+" > "+secondnumber);
			}
			else
			{
				System.out.println(thirdnumber+" > "+fourthnumber+" > "+secondnumber+" > "+firstnumber);
			}
		}
		

		}
		
		
		
		
		
		
		
		
		
		
	}
}


