package com.ilpexperion.assignment;

import java.util.Scanner;

public class QS11 {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the limit ");  
		 int n=scanner.nextInt();
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{     
			arr[i]=scanner.nextInt();  
		}  
		
		 int fr[]  = new int [n];  
	        int visited = -1;  
	        
	        for(int i = 0; i < n; i++){  
	            int count = 1;  
	            for(int j = i+1; j < n; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;  
	                    
	                    fr[j] = visited;  
	                }  
	            }  
	            if(fr[i] != visited)  
	                fr[i] = count;  
	        }  
	        
	       
	        System.out.println(" Element | Frequency");  
	        for(int i = 0; i < fr.length; i++){  
	            if(fr[i] != visited)  
	                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
	        }  
	        
	    }  
	}  



