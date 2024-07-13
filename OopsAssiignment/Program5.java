package OopsAssiignment;

import java.util.Scanner;

//Write a Java program to overload a add() method.

public class Program5 {
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
	void add() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a=scan.nextInt();
		System.out.println("Enter 2nd number:");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("Addition is :"+c);
		scan.close();
	}
	void add(int a,int b,float c) {
		double d=a+b+c;
		System.out.println("Addition is :"+d);
	}
	public static void main(String[] args) {
		Program5 p=new Program5();
		System.out.println("Addition is :"+p.add(3, 5));
		p.add();
		p.add(1, 2, 4.5f);
	}

}
