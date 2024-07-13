package india;

import java.util.Scanner;

//6.Write a Java program to print the area and perimeter of a rectangle
public class Rectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Length:");
		double l = scan.nextDouble();
		System.out.println("Enter Breath:");
		double b = scan.nextDouble();
		double A, P;
		A = l * b;
		P = 2 * (l + b);
		System.out.println("Area of rectangle is:" + A);
		System.out.println("Perimeter of rectangle is:" + P);
		scan.close();

	}
}
