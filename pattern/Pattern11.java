package pattern;
/*
ABCDE
BCDE
CDE
DE
E
*/
public class Pattern11 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print((char)(j+64));//Type casting for converting int value into ascii code.
			
		}
		System.out.println(" ");
	}
}
	
}
