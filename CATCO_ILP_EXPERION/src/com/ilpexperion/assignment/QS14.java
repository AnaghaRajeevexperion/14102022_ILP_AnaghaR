package com.ilpexperion.assignment;

import java.util.Scanner;

public class QS14 {

	private static int n;
	public static void main(String args[]) 
	{ 

		Scanner scanner=new Scanner(System.in);
		int sum=8;
		int arr[]=new int[20];
		System.out.println("Enter the limit ");  
		 int n=scanner.nextInt();
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{     
			arr[i]=scanner.nextInt();
		}
		for(int i=0; i<n; i++)  
		{     
			int first = arr[i]; 
			for (int j = i + 1; j <n; j++) 
			{
				int second = arr[j]; 
				if ((first + second) == sum)
				{
					System.out.println("The numbers with a sum of 8 are "+first +","+ second); 
					} 
				}
			}
		}
	
}

