import java.util.Scanner;

/**
 * 
 */

/**
 * @author HowardYang
 *
 */


public class Solution11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			input.close();
			// Start to answer. 
			String s = String.valueOf(n);
			if (n == Integer.parseInt(s) && n >= -100 && n <= 100) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
			// End of Answer
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
