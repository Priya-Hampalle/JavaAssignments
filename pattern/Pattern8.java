package pattern;
/*
10000
02000
00300
00040
00005
 */
public class Pattern8 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==i) {
					System.out.print(i+1);
				}
				else {
					System.out.print(0);
				}
			}
			System.out.println(" ");
		}
	}
}
