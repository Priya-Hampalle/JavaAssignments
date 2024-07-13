package india;

import java.util.Scanner;

//17.Write a simple Java program to calculate a Factorial of a number.
public class Factorial {
	public static void main(String[] args) {
		int i, fact = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number 1 : ");
		int num1 = scan.nextInt();
		for (i = 1; i <= num1; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num1 + " is: " + fact);
		scan.close();
	}
}
