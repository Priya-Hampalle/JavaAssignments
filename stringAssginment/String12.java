package stringAssginment;
//12)	Java Program to find the largest and smallest word in a string
public class String12 {

	public static void main(String[] args) {
		 	String string = "Java Program to find the largest and smallest word in a string";  
	        String word = "";
	        String small = "";
	        String large="";  
	        String[] words = new String[100];  
	        int length = 0;  
	        string = string + " ";  //Add extra space after string to get the last word in the given string  
	      
	        for(int i = 0; i < string.length(); i++){  
	              
	            if(string.charAt(i) != ' ')
	            { 
	                word = word + string.charAt(i);//Split the string into words  
	             
	            }  
	            else{   
	                words[length] = word;  //Add word to array words  
	                length++;  //Increment length 
	                word = "";  //Make word an empty string
	               
	            } 
	            
	        }
		        small = large = words[0]; //Initialize small and large with first word in the string  
		        for(int k = 0; k < length; k++){  //Determine smallest and largest word in the string 
		            if(small.length() > words[k].length())  //If length of small is greater than any word present in the string		              			             			           
		                small = words[k];   //Store value of word into small  
		            if(large.length() < words[k].length()) //If length of large is less than any word present in the string   
		                large = words[k];  //Store value of word into large 
		        }      
		        System.out.println("Smallest word: " + small);  
		        System.out.println("Largest word: " + large);  
		    }  
 }  

	          
	      



