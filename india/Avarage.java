package india;

import java.util.Scanner;

//5.Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
public class Avarage {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		double x = scan.nextDouble();
		System.out.println("Enter 2nd number:");
		double y = scan.nextDouble();
		System.out.println("Enter 3rd number:");
		double z = scan.nextDouble();
		double avg;
		avg = (x + y + z) / 3.0;
		System.out.println("Avarage of three number is: " + avg);
		scan.close();
	}
}