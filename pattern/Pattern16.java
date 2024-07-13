package pattern;
/*
    E
   DE
  CDE
 BCDE
ABCDE
*/
public class Pattern16 {
public static void main(String[] args) {
	int n = 5;
	
	for (int i = 1; i <= n; i++) {
		for (int k = 1;k<=n-i; k++) {
			System.out.print(" ");
		}
		int x=n-i+1;
		for (int j = 1; j <= i; j++) {
			
			System.out.print((char)(x+64));
			x++;
			
		}
		System.out.println();
}
}
}
