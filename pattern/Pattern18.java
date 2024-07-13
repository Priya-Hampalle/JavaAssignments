package pattern;
/*
EEEEE
DDDD
CCC
BB
A
 */
public class Pattern18 {
public static void main(String[] args) {
	int i,j,n=5;
	
		for(i=n;i>=1;i--)
		{
    		for(j=1;j<=i;j++)
    		{
        			System.out.print((char)(i+64));
    		}
     		System.out.println("");
		}
}
}
