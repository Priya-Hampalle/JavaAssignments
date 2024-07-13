package stringAssginment;
//3)	Java Program to count the total number of punctuation characters exists in a String
public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;    
		String str = "India is : my country,All Indian!are my brother : sister.";    
		for (int i = 0; i < str.length(); i++)   
		{    
		  
		if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||str.charAt(i) == '-' ||  str.charAt(i) == ':')   
		{    
		count++;    
		}    
		}    
		System.out.println("The number of punctuations exists in the string is: " +count);    
		}    
		   
	}


