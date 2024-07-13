package stringAssginment;
//6)	Java Program to replace lower-case characters with upper-case and vice-versa
public class String6 {
	public static void main(String[] args) {
	    String s="Great Power Is KnoWledge";
	    StringBuffer sb=new StringBuffer(s);
	    for(int i = 0; i < s.length(); i++) {  
	    if(Character.isLowerCase(s.charAt(i))) { //Checks for lower case character 
	    sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));//Convert it into upper case using toUpperCase() function  
	    }
	    else if(Character.isUpperCase(s.charAt(i))) {//Checks for lower case character 
		    
		    sb.setCharAt(i, Character.toLowerCase(s.charAt(i)));//Convert it into upper case using toLowerCase() function  
		    }
	}
	     System.out.println("String after case conversion : " + sb);  
}
}
