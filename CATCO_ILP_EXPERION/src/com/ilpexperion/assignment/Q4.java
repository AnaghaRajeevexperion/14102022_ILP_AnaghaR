package com.ilpexperion.assignment;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) 
	{
		double sum=0;
		int limit;
		
		int positionOne=1;
		int positionTwo=1;
		int positionThree=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit of the sum of series: ");
		limit = scanner.nextInt();
		
		do
		{
			positionThree = positionTwo + positionOne;
			sum = sum + Math.pow(positionThree,3);
			positionOne = positionTwo;
			positionTwo = positionThree;
			
		}
		while(positionThree!=limit);
		System.out.println("Sum of the series = "+sum);

	}

}
