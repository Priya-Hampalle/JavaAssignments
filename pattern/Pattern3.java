package pattern;
/*
1 1 1 1 1
2 2 1 1 1
3 3 3 1 1
4 4 4 4 1
5 5 5 5 5
 */
public class Pattern3 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if((i==2&&j==1)||(i==2&&j==2)) {
					System.out.print(2);
				}
				else if((i==3&&j==1)||(i==3&&j==2)||(i==3&&j==3)) {
					System.out.print(3);
				}
				else if((i==4&&j==1)||(i==4&&j==2)||(i==4&&j==3)||(i==4&&j==4)) {
					System.out.print(4);
				}
				else if((i==5&&j==1)||(i==5&&j==2)||(i==5&&j==3)||(i==5&&j==4)||(i==5&&j==5)) {
					System.out.print(5);
				}
				else {
					System.out.print(1);
				}
				
			}
			System.out.println(" ");
		}
	}


}
