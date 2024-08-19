package javaLastAssignment;
//Write a java program to print the number of words in given string.
public class WordString {

	public static void main(String[] args) {
		String msg = "Write a java program to print the number of words in given string.";
	      System.out.println("The given String is: " + msg);
	      int total = 1;
	      int i = 0;
	      while (i < msg.length()) { 
	         if ((msg.charAt(i) == ' ') && (msg.charAt(i + 1) != ' '))  {
	            total++;
	         }
	         i++;
	      } 
	     
	      System.out.println("Number of words in the given string: " +  total);

        
    }
}
