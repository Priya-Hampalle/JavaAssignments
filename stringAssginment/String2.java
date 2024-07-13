package stringAssginment;
//2)	Java Program to count the total number of characters in second word
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="Java isAwsome and OOL";
		
			String[] sp = s.split(" ");
			System.out.println("second word is :" + sp[1]);
			System.out.println("the length of 2nd charector is :"+sp[1].length());

	}

}
