import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Java Currency Formatter
 * 
 * @author HowardYang
 *
 */
public class Solution13 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputDouble = new Scanner(System.in);
		double payment = inputDouble.nextDouble();
		inputDouble.close();
		
		Locale localeIndia = new Locale("en", "IN");
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(localeIndia).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

		
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}

}
