package pattern;
/*
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
 */
public class Pattern19 {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			if(j==0) {
				System.out.print('A');
			}
			else if(j==1) {
				System.out.print('B');
			}
			else if(j==2) {
				System.out.print('C');
			}
			else if(j==3) {
				System.out.print('D');
			}
			else if(j==4) {
				System.out.print('E');
			}
		}
		System.out.println(" ");
	}
}
}
