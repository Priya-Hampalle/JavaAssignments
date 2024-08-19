package javaLastAssignment;
//Write a java program to counting digits in given number
public class CountDigit {

	public static void main(String[] args) {
		int count = 0, num = 656763452;

	    while (num != 0) {
	    
	      num =num/10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);

	}

}
