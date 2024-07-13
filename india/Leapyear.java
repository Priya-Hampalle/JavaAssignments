package india;
//13.Write a Java program that takes a year from the user and prints whether it is a leap year or not.

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of month : ");
		int yr = scan.nextInt();
		if(yr%4==0)
		{
			System.out.println(yr+"year is leap year");
		}
		else
		{
			System.out.println(yr+"year is not leap year");
		}
		scan.close();
	}
	
}
