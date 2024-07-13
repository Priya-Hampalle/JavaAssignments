package stringAssginment;
//13)	Java Program to separate the Individual Characters from a String
public class String13 {

	public static void main(String[] args) {
		 String string = "charactersofstring";  
	        System.out.println("Individual characters from given string:");  
	      
	        for(int i = 0; i < string.length(); i++){  
	            System.out.print(string.charAt(i) + "  ");  
	        }
	}

}
