package pattern;
/*
    A
   CBA
  EDCBA
 GFEDCBA
IHGFEDCBA
 */
public class Pattern14 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
    		{
 				System.out.printf(" ");
    		} 
			for(int j=(i*2-1);j>=1;j--) {
				System.out.print((char)(j+64));
			}
			System.out.println(" ");
		}
	}
}
