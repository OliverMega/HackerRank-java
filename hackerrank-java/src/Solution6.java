import java.util.Scanner;

/**
 * Java Loops I
 * 
 * @author HowardYang
 *
 */
public class Solution6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i < 11; i++) {
			System.out.printf("%d x %d = %d%n", N, i, N*i);
		}
        
        in.close();

	}

}
