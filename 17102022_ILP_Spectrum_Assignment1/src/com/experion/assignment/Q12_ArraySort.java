package com.experion.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q12_ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int j=0;
		int numberArray[]=new int[7];
		int descendArray[]=new int[7];
		
		System.out.println("Enter the 7 elements of the array: ");
		for(int i=0;i<numberArray.length;i++)
			numberArray[i]=scanner.nextInt();
		
		Arrays.sort(numberArray);
		System.out.println("Array in ascending order:");
		for (int number : numberArray) {
			System.out.print(number + " ");
		}
		
		for(int i=6;i>=0;i--)
		{
			descendArray[j]=numberArray[i];
			j++;
		}
		System.out.println();
		System.out.println("Array in descending order:");
		for (int number : descendArray) {
			System.out.print(number + " ");
		}		
	}

}
