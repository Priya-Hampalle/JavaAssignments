package india;

import java.util.Scanner;

//9.Write a Java program that reads a number in inches and converts it to meters.
public class Inch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		double inch = scan.nextDouble();
		double m;
		m = 0.0254 * inch;
		System.out.println(inch + "inches =" + m + "metre");
		scan.close();
	}
}
