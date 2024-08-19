package javaLastAssignment;
//Write a java program to check given number is prime or not.
public class PrimeNum {

	public static void main(String[] args) {
		int num = 79;
	      System.out.println("The given number is: " + num);
	      
	      int count = 0;
	      
	      if(num == 2) {
	         System.out.println(num + " is a prime number");
	      } else {
	         
	         for(int i = 1; i <= num; i++) {
	            if(num % i == 0) {
	               count++;
	            }
	         }
	         
	         if(count == 2) {
	            System.out.println(num + " is a prime number");
	         } else {
	            System.out.println(num + " is not a prime number");
	         }
	      }

	}

}
