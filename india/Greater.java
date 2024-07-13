package india;

import java.util.Scanner;

//11.Write a Java program that takes three numbers from the user and prints the greatest number.
public class Greater {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter minutes:");
		int x = scan.nextInt();
		System.out.println("Enter minutes:");
		int y = scan.nextInt();
		System.out.println("Enter minutes:");
		int z = scan.nextInt();
		int num;
		if(x>y)
		{
			num=x;
		}
		else
		{
			num=y;
		}
		if(num>z)
		{
			System.out.println("The greatest number is :"+num);
		}
		else{
			{
				System.out.println("The greatest number is : "+z);
			}
		}
}
	
}