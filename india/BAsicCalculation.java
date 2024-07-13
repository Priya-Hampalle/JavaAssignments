package india;

import java.util.Scanner;

//16.Write a Java program to perform basic Calculator operations.
public class BAsicCalculation {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number 1 : ");
		int num1 = scan.nextInt();
		System.out.println("enter the number 2 :");
		int num2 = scan.nextInt();
		System.out.println("enter the Operator Name");
		String Operator = scan.next();
		
		switch(Operator) 
		{
		case "Addition":
			System.out.println("Addition of number = "+(num1+num2));
			break;
		case "Substraction":
			System.out.println("Substraction of number = "+(num1-num2));
			break;
		case "Multiplication":
			System.out.println("Multiplicationof number = "+(num1*num2));
			break;
		case "Division":
			System.out.println("Division of number = "+(num1/num2));
			break;
		default:
			System.out.println("Invalid operation");
		}
		scan.close();
		

}
}
