package india;

import java.util.Scanner;

//12.Write a Java program to find the number of days in a month.
public class month {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of month : ");
		int num = scan.nextInt();
		switch(num) 
		{
		case 1,3,5,7,8,10,12:
			
				System.out.println("Number of days Present in this month is 31days");
			
			break;
		case 2:
			
				System.out.println("Number of days present in month is 29 days");
						break;
		case 4,6,9,11:
			
				System.out.println("Number of days present in month is 30 days");
			
			
		scan.close();
		
	}
	}

}
