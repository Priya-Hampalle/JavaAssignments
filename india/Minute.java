package india;

import java.util.Scanner;

//10.Write a Java program to convert minutes into years and days.
public class Minute {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter minutes:");
		int min = scan.nextInt();
		int hour,year,day;
		hour=min/60;
		day=hour/24;
		year=day/365;
		System.out.println(min+"m:"+hour+"h:"+day+"d:"+year+"y");
		
	}
}
