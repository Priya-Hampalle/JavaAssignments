package india;

import java.util.Scanner;

//2.Write a Java program that takes two values as input and displays the sum of two numbers
public class Sum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int x=scan.nextInt();
		System.out.println("Enter 2nd number:");
		int y=scan.nextInt();
		int z=x+y;
		System.out.println("Sum of two number is: "+z);
		scan.close();
	}

}
