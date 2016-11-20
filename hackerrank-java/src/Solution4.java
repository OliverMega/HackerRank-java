import java.util.Scanner;

/**
 * Java Stdin and Stdout II
 * 
 * @author HowardYang
 *
 */
public class Solution4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();

		// Write your code here.

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		
		scan.close();

	}

}
