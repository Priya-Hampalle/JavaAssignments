package pattern;
/*
    A
   B B
  C C C
 D D D D
E E E E E
 */
public class Pattern13 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
    		{
 				System.out.printf(" ");
    		} 
			for(int j=1;j<=i;j++) {
				
				System.out.print(((char)(i+64))+" ");
			}
			System.out.println(" ");
		}
	}
}
