package stringAssginment;
//10)	Java program to find the duplicate characters in a string
public class String10 {
public static void main(String[] args) {
	String s="I love Pandora Planet";
	int count;
	char string[]=s.toCharArray();  //Converts given string into character array  
	System.out.println("THe Duplicate characters in a given string: ");  
	   for(int i = 0; i <string.length; i++) {  
           count = 1;  
           for(int j = i+1; j <string.length; j++) { //Counts each character present in the string  
               if(string[i] == string[j] && string[i] != ' ') {  
                   count++;  
                   string[j] = '0'; //Set string[j] to 0 to avoid printing visited character 
               }
           }
              if(count > 1 && string[i] != '0') { // //A character is considered as duplicate if count is greater than 1 
               System.out.println(string[i]); 
               }
           }
	   }

}
