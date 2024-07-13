package pattern;
/*
11111
01111
00111
00011
00001
 */
public class Pattern7 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==2&&j==1) {
					System.out.print(0);
				}
				else if((i==3&&j==1)||(i==3&&j==2)) {
					System.out.print(0);
				}
				else if((i==4&&j==1)||(i==4&&j==2)||(i==4&&j==3)) {
					System.out.print(0);
				}
				else if((i==5&&j==1)||(i==5&&j==2)||(i==5&&j==3)||(i==5&&j==4)) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
			}
			System.out.println(" ");
		}
	}

}
