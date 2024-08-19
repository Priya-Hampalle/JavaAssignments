package javaLastAssignment;

import java.util.Scanner;

//Write a java program to reversing words in a sentence.
public class ReverseString {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String str = sc.nextLine();
        String rev = "";
        String s[] = str.split(" ");

        for(int i=0;i<s.length;i++){
            rev = s[i]+" "+rev;
        }
        
        System.out.println("Reversed sentence: " + rev);
  } 
}
