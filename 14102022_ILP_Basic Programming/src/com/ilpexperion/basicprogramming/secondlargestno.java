package com.ilpexperion.basicprogramming;
import java.util.Scanner;
public class secondlargestno {

	public static void main(String[] args) {
		int firstnumber;
		int secondnumber;
		int thirdnumber;
		int d,e;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		firstnumber=scanner.nextInt();
		System.out.println("Enter second number");
		secondnumber=scanner.nextInt();
		System.out.println("Enter third number");
		thirdnumber=scanner.nextInt();
		if(firstnumber>secondnumber) {
						d=firstnumber;}
		else {
			d=secondnumber;}
		
		if(secondnumber>thirdnumber) {
			e=secondnumber;}
		else {
			e=thirdnumber;
		}
		if(d>e)
		{	System.out.println("Second smallest number="+e);
		}else { 
			System.out.println("Second smallest number="+d);
}
	}
}
