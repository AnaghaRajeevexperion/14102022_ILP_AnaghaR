package com.experion.assignment;

import java.util.Scanner;

public class Q18_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit;
		
		int positionOne=0;
		int positionTwo=1;
		int positionThree=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit of the sum of series: ");
		limit = scanner.nextInt();
		
		if(limit==0)
			System.out.print("0");
		else if(limit==1)
			System.out.print("0 1");
		else {
			System.out.print("0 1 ");
			do
			{
				positionThree = positionTwo + positionOne;
				System.out.print(positionThree+" ");
				positionOne = positionTwo;
				positionTwo = positionThree;
				
			}
			while(positionThree!=limit);
		}
		
	}

}
