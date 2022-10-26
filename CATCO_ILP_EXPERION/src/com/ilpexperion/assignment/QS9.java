package com.ilpexperion.assignment;

import java.util.Scanner;

public class QS9 {

	public static void pattern(int n)
	{
		int i,j,num;
		for (i=0;i<n;i++)
		{
			num=1;
			for (j=0;j<=i;j++)
			{
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) 
	{
		int n=4;
		pattern(n);

	}

	
}
