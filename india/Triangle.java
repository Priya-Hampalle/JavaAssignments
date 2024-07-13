package india;

import java.util.Scanner;

//7.Write a Java program to print the area of a traingle
public class Triangle {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Base:");
		double b = scan.nextDouble();
		System.out.println("Enter Perpendicular height:");
		double h = scan.nextDouble();
		double A;
		A=0.5*b*h;
		System.out.println("Area of Triangle is:"+A);
		scan.close();

}
}