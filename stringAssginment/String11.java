package stringAssginment;
//11)	Java program to find the duplicate words in a string
public class String11 {
	public static void main(String[] args) {
		String s="Sa Re Ga Ma Pa Da Ni Sa Ni Sa Da Pa Ma Ga Re Sa";
		int count;
		s = s.toLowerCase(); 
		String words[]=s.split(" ");  
		System.out.println("THe Duplicate word in a given string: ");  
		   for(int i = 0; i <words.length; i++) {  
	           count = 1;  
	           for(int j = i+1; j <words.length; j++) { //Counts each character present in the string  
	        	   if(words[i].equals(words[j])) {    
	                    count++;      
	                  words[j]="0"; //Set string[j] to 0 to avoid printing visited character 
	               }
	           }
	              if(count > 1 && words[i] != "0") { // //A character is considered as duplicate if count is greater than 1 
	               System.out.println(words[i]); 
	               }
	           }
	}
}
