package com.ilpexperion.assignment;

import java.util.Scanner;

public class QS3oneminusthreupton {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int i,n,s=0,sign=1;
		System.out.println("Enter the value of n:");
		n=scanner.nextInt();
		for(i=1;i<=n;i+=2)
		{
			s=s+(i*sign);
			sign=sign*-1;
			
		}
		System.out.println("Sum="+s);
	}

}
