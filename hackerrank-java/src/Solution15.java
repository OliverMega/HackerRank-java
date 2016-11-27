import java.util.Scanner;

/**
 * Java substring
 * 
 * @author HowardYang
 *
 */
public class Solution15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        // 取字串S的某些字元
        System.out.println(S.substring(start, end));
        
        in.close();
	}

}
