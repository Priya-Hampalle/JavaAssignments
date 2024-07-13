package stringAssginment;
//5)	Java Program to divide a string in 'N' equal parts.
public class String5 {
	
	void divideStringInParts(String s, int n) {
		int l=s.length();
		if(l%n!=0) {
			System.out.println("Given string can not divide into equal parts");
			
		}
		else {
			int part=l/n;
			System.out.println("Given Strings have"+ n +" eual part as below:");
			for(int i=0;i<l;i+=part) {
				System.out.println(s.substring(i, i + part));
			}
		}
		}
	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwx";
		//size find out
		int n=4;
		String5 s5=new String5();
		s5.divideStringInParts(s,n);
		
	}
	

}
