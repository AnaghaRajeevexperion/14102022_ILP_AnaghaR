package com.ilpexperion.assignment;

import java.util.Scanner;

public class Q18fibonacci {

	public static void main(String[] args)
	{
		int i,n1=0,n2=1,n3,count;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the limit:");
		count=scanner.nextInt();
		System.out.print(n1+" "+n2);
		
		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
