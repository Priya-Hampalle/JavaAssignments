package assignment3;
//6.	Write a Java program to calculate sum of odd numbers from an given array. the array is
//int[ ] values = {24, 36, 47, 27, 13, 9, 5};

public class Array6 {
public static void main(String[] args) {
	int[ ] values = {24, 36, 47, 27, 13, 9, 5};
	int sum=0;
	for(int i=0;i<values.length;i++) {
		if(values[i]%2==1) {
			sum=sum+values[i];
		}
		
	}
	System.out.println("sum of odd numbers from an given array: "+sum);
}
	
}
