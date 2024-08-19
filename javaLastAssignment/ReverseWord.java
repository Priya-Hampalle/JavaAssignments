package javaLastAssignment;

import java.util.Scanner;

//rite a java program to reverse each word in a sentence
public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String str = sc.nextLine();
        String rev = "";
        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++) {
        	String word=words[i];
        	String revword="";
        	for(int j=word.length()-1;j>=0;j--) {
        		revword=revword+word.charAt(j);
        	}
        	rev=rev+revword+" ";
        }
        System.out.println(rev);

	}

}
