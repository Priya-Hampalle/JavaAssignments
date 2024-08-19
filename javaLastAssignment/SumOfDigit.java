package javaLastAssignment;
//Write a java program to find sum of digits in given number
public class SumOfDigit {

	public static void main(String[] args) {
		int sum = 0, num = 452;

	    while (num != 0) {
	    
	     sum=sum+num%10;
	     num=num/10;
	    }

	    System.out.println("Number of digits: " + sum);

	}

	}

