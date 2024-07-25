package exceptionHandling;

import java.util.Scanner;

// Write a Java program to handle ArrayIndexOutOfBoundsException 

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		int a[]=new int[7];
		System.out.println("Enter elements in array");
		int ele=sc.nextInt();
		System.out.println("Enter the position to be stored");
		int index=sc.nextInt();
		a[index]=ele;
		System.out.println(a[index]);
		}
		catch (ArrayIndexOutOfBoundsException be) {
			System.out.println("Provide valid index");
		}
       sc.close();
	}

}
