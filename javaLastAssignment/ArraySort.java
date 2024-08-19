package javaLastAssignment;
//ite a java program to sort an array without using sort().
public class ArraySort {

	public static void main(String[] args) {
		int a[]= {90,20,98,70,50};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}

		System.out.println();
		for (int i = 0; i < a.length; i++)   
		{  
		for (int j = i + 1; j < a.length; j++)   
		{  
		int tmp = 0;  
		if (a[i] > a[j])   
		{  
		tmp = a[i];  
		a[i] = a[j];  
		a[j] = tmp;  
		}  
		}  
		
		System.out.print(a[i]+ " ");  
		}
		

	}

}
