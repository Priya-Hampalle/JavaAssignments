package stringAssginment;

import java.util.Scanner;

//9)	Java Program to find Reverse of the string
public class String9 {
	public static void main(String args[])
	   {
	      String str, rev = "";
	      Scanner scan = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = scan.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- ) {
	         rev = rev + str.charAt(i);
	      }
	      System.out.println("Reverse of the string is:"+rev);
	      scan.close();
	   }
}
