package stringAssginment;
//4)	Java Program to count the total number of vowels and consonants in a string
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int vCount = 0, cCount = 0;    
         
	     
	        String str = "Java Is AwSome";    
	        str = str.toLowerCase();    
	            
	        for(int i = 0; i < str.length(); i++) {    
	              
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                   
	                vCount++;    
	            }    
	              
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	                  
	                cCount++;    
	            }    
	        }    
	        System.out.println("Number of vowels: " + vCount);    
	        System.out.println("Number of consonants: " + cCount);    
	    }    
	}


