package com.ilpexperion.basicprogramming;
import java.util.Scanner;

public class oddevenscanner {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		number=scanner.nextInt();
		int lastdigit;
		lastdigit=number%10;
		if(lastdigit%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}

}
