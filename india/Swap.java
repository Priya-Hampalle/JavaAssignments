package india;

import java.util.Scanner;

//8.Write a Java program to swap two variables.
public class Swap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		double x = scan.nextDouble();
		System.out.println("Enter 2nd number:");
		double y = scan.nextDouble();
		double swap = x;
		x = y;
		y = swap;

		System.out.println("Print swapped value Of x:" + x);
		System.out.println("Print swapped value Of y:" + y);
		scan.close();
	}
}
