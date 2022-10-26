package packageanagha;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		int lastdigit=number%10;
		if((lastdigit==0)||((lastdigit%2)==0)) {
			System.out.println(number+" is an Even number");
	}
		else {
			System.out.println(number+" is an Odd number");

}
}
}