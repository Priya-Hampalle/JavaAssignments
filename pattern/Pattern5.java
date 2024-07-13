package pattern;
/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
 */
public class Pattern5 {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
				if(j==5) {
				System.out.print(5);
				}
				else if(j==4) {
					System.out.print(4);
					}
				else if(j==3) {
					System.out.print(3);
					}
				else if(j==2) {
					System.out.print(2);
					}
				else {
					System.out.print(1);
				}
				
			}
			System.out.println(" ");
		}
	}

}
