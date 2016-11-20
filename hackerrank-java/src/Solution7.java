import java.util.Scanner;

/**
 * Java Loops II
 * 
 * @author HowardYang
 *
 */
public class Solution7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = 0;
            for (int j = 0; j < n; j++) {
				if (j == 0) {
					sum += (a + (int) (Math.pow(2, j) * b));
				} else {
					sum += (int) (Math.pow(2, j) * b);
				}
				System.out.print(sum + " ");
			}
            System.out.println();
        }
        in.close();
	}

}
