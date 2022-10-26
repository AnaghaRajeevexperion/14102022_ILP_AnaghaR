package lesrnanagha;

import java.util.Scanner;

public class array {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[0]=scanner.nextInt();
		}
		System.out.println(arr[0]);

	}

}
