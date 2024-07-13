package pattern;
/*
        5
      4 5
    3 4 5
  2 3 4 5
1 2 3 4 5
 */
public class Pattern10 {
	public static void main(String[] args) {
		int n = 5;
		
		for (int i = 1; i <= 5; i++) {
			for (int k = 1;k<=n-i; k++) {
				System.out.print("  ");//give two spaces here
				
			}
			int x=n-i+1;//5
			for (int j = 1; j <= i; j++) {
				
				System.out.print(x + " ");
				x++;
				
			}
			System.out.println();
		}

	}
}
/*First Iteration (i = 1):
n - i = 5 - 1 = 4 (4 spaces printed)
x starts at 5 - 1 + 1 = 5, prints 5

Second Iteration (i = 2):
n - i = 5 - 2 = 3 (3 spaces printed)
x starts at 5 - 2 + 1 = 4, prints 4 5
Third Iteration (i = 3):

n - i = 5 - 3 = 2 (2 spaces printed)
x starts at 5 - 3 + 1 = 3, prints 3 4 5
Fourth Iteration (i = 4):

n - i = 5 - 4 = 1 (1 space printed)
x starts at 5 - 4 + 1 = 2, prints 2 3 4 5
Fifth Iteration (i = 5):

n - i = 5 - 5 = 0 (0 spaces printed)
x starts at 5 - 5 + 1 = 1, prints 1 2 3 4 5
*/