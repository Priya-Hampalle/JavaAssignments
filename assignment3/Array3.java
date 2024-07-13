package assignment3;
//3.	Write a Java program to find the maximum and minimum value from a given an array. array is 
//'int array[ ] = {45, 67, 98, 63, 59, 24, 48}' 

public class Array3 {
	public static void main(String[] args) {
		int a[] = {45, 67, 98, 63, 59, 24, 48};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.out.println("The maximum value of given array is: "+max+" and minimum value is:"+min);
		
	}

}
