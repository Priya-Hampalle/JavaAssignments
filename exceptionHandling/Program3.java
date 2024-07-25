package exceptionHandling;

import java.util.Scanner;

// Write a Java program to implement finally block when the exception is not caught."
class Array {

	void index() {
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
		catch (ArithmeticException ae) {
			System.out.println("Provide valid index");
		}
		finally {
			System.out.println("Handeled by finally block");
		}
       sc.close();
	}

}

public class Program3 {

	public static void main(String[] args) {
		Array arr=new Array();
		try {
		arr.index();
		}catch(Exception e) {
			
		}

	}

}
