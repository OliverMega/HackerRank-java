import java.util.Scanner;

/**
 * 
 */

/**
 * Java End-Of-File
 * 
 * @author HowardYang
 *
 */
public class Solution9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = 1;
		
		while (input.hasNext()) {
			String sentances = input.nextLine();
			
			System.out.println(n + " " + sentances);
			n++;
		}
		
		input.close();
	}

}
