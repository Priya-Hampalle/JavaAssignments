package javaLastAssignment;
//Write a java program to removing duplicates in an Array.
public class DuplicateArray {

	public static void main(String[] args) {
		int values[ ] = {23, 45, 23, 56, 88, 99, 55, 34, 45, 67, 11, 88, 99, 11, 34};
		 System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < values.length; i++) {  
	            for(int j = i + 1; j < values.length; j++) {  
	                if(values[i] == values[j])  
	                    System.out.print(values[j]+ " ");  
	            }  
	        }  

	}

}
