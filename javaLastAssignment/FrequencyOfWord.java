package javaLastAssignment;

import java.util.Scanner;

//Develop a program that counts the frequency of each word in a given sentence.
public class FrequencyOfWord {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the String: ");
	      String str = s.nextLine();
	      
	      str = str.toLowerCase();
	      String words[] = str.split(" ");
	      int wordsLen = words.length;
	      
	      System.out.println("Occurrences of Each Word: ");
	      for(int i=0; i<wordsLen; i++)
	      {
	         int count = 1;
	         for(int j=(i+1); j<(wordsLen-1); j++)
	         {
	            if(words[i].equals(words[j]))
	            {
	               count++;
	               for(int k=j; k<(wordsLen-1); k++)
	                  words[k] = words[k+1];
	               wordsLen--;
	               j--;
	            }
	         }
	         if(count==1)
	            System.out.println("The word " +words[i]+ " occurs only 1 time.");
	         else
	            System.out.println("The word " +words[i]+ "occurs " + count+" times.");
	         count = 0;
	      }

	}

}
