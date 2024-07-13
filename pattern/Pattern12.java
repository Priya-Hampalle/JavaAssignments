package pattern;
/*
EDCBA
EDCB
EDC
ED
E
 */
public class Pattern12 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print((char)(j+64));//Type casting for converting int value into ascii code.
				
			}
			System.out.println(" ");
		}
	}

}
