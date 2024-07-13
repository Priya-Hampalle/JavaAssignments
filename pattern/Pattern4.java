package pattern;
/*
5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
 */
public class Pattern4 {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
				if(i==5) {
				System.out.print(5);
				}
				else if(i==4) {
					System.out.print(4);
					}
				else if(i==3) {
					System.out.print(3);
					}
				else if(i==2) {
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
