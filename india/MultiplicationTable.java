package india;
//3.Write a Java program that takes a number as input and prints its multiplication table up to 10.
import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
		int x=scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			int z= x*i;
			System.out.println(z);
		}
		scan.close();
	}

}
