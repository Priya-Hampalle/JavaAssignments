package india;

import java.util.Scanner;

//4.Write a Java program to print the area and perimeter of a circle.
public class Circle {
	public static void main(String[] args) {
		double pi = 3.14, A, P;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int r = scan.nextInt();
		A = pi * r * r;
		P = 2 * pi * r;
		System.out.println("Area of Circle is: " + A);
		System.out.println("Perimeter of Circle is : " + P);
		scan.close();

	}
}
