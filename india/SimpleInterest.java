package india;

import java.util.Scanner;
//14.Write a Java program to Calculate Simple Interest for a given amount,rate of interest and time duration.
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principal amount: ");
		double p = scan.nextDouble();
		System.out.println("Enter Interest rate in percentage: ");
		int r = scan.nextInt();
		System.out.println("enter time period: ");
		int n = scan.nextInt();
		double SI;
		SI = (p *n * r) / 100;
		System.out.println("Simple Interest= " + SI);
		scan.close();
	}
}
