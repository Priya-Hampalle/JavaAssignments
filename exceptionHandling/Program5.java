package exceptionHandling;

import java.util.Scanner;
//custom Exception
//Write a Java program to create a method that takes a string as an input and 
//throw an exception if the string does not contain vowels."
class VowelException extends Exception{
	public String getMessage() {
		return"Given string contain vowels!!!";
	}
}
class Test{
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		try {
			Test.containsVowel(str);
		} catch (Exception ve) {
			System.out.println(ve.getMessage());
		}
	}
		static void containsVowel (String str)  throws Exception {
	    String vowels = "AEIOUaeiou" ;
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	           
	                if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
	                	VowelException ve=new VowelException();
	                    throw ve;
	                }
		}
	        System.out.println("Given string does not contain vowels.");
	}
}
public class Program5 {

	public static void main(String[] args) {
		Test t=new Test();
		t.input();
	
	}

}
