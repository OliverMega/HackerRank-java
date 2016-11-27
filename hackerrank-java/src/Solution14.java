import java.util.Scanner;

/**
 * Java String Introducing
 * 
 * @author HowardYang
 *
 */
public class Solution14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();
		/* Enter your code here. Print output to STDOUT. */
		// Print sum the lengths of a & b.
		System.out.println(A.length() + B.length());
		
		// Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
		//  比較字母順序大小A的字串的字母大於B，回傳"Yes"，否則回傳"No"
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		// 開頭字從小寫變大寫
		// 先將開頭字母變成大寫，再接剩下的字串
		System.out.println(A.toUpperCase().charAt(0) + A.substring(1) + " " + B.toUpperCase().charAt(0) + B.substring(1));
		
	}

}
