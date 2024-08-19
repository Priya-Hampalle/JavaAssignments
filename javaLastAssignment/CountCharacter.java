package javaLastAssignment;
import java.util.HashMap;
//Write a java program to counting the occurrence of each character in a given string.
public class CountCharacter {

	public static void main(String[] args) {
		 String myStr = "javaisawsome";
	      System.out.println("String ="+myStr);
	     HashMap<Character,Integer> hashMap = new HashMap<>();
	      for (int i = myStr.length() - 1; i >= 0; i--) {
	         if (hashMap.containsKey(myStr.charAt(i))) {
	            int count = hashMap.get(myStr.charAt(i));
	            hashMap.put(myStr.charAt(i), ++count);
	         } else {
	            hashMap.put(myStr.charAt(i),1);
	         }
	      }
	      System.out.println("Counting occurrences of each character = "+hashMap);


	}

}
