package assignment3;
//1.Write a Java program to sum values of an given array. the array is 'int[] values = {34, 56, 78, 20, 78, 90, 74};'.
public class Array1 {
	public static void main(String[] args) {
		int sum=0;
		int a[]= {34,56,78,20,78,90,74};
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("Sum of the given array is: "+sum);
	}

}
