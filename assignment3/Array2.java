package assignment3;
//2.Write a Java program to calculate the average value of array elements. the array is
// int array[ ] = {55, 66, 44, 22, 55, 77}

public class Array2 {
	public static void main(String[] args) {
		int sum=0; double avg=0.00;
		int a[ ] = {55, 66, 44, 22, 55, 77};
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];	
		}
		avg=sum/a.length;
		System.out.println("The avarage of the array given is : "+avg);
	}

}
