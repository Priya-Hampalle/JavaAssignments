package exceptionHandling;

import java.util.ArrayList;
import java.util.Scanner;

//Write a Java program that reads a list of integers values from the user and 
//should throw an exception if any integer value is duplicate.
class DuplicateElement extends Exception {
	public String getMessage() { // inbuild method
		return "Duplicate values are present";
	}
}

class Demo {

	void arraytake() {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[7];
		System.out.println("Enter elements in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
		}
		try {
			Demo.uniqueelement(arr);
		} catch (DuplicateElement de) {
			System.out.println(de.getMessage());
		}
	}
static void uniqueelement(int arr[]) throws DuplicateElement {
		System.out.println("let us find Duplicate elements in given array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					DuplicateElement de = new DuplicateElement();
					throw de;

				}
			}
		}
		System.out.println("No more duplicate values");
	}
}

public class Program4 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.arraytake();
		
	}

}
