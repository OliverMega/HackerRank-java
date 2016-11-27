import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 */

/**
 * Java Date and Time
 * 
 * @author HowardYang
 *
 */
public class Solution12 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        int y = Integer.parseInt(year);
        
        // Java 7 Version 
        int dayOfWeek = 0;
        
        String[] weeks = {"SUNDAY", "MONDAY", "TUESDAY", "WEDENSDAY", "THURESDAY", "FRIDAY", "SATURDAY"};
        
        Calendar my_calendar = Calendar.getInstance();
        my_calendar.set(y, m - 1, d);
        dayOfWeek = my_calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (dayOfWeek < 0) {
			dayOfWeek = 0;
		}
        
        System.out.println(weeks[dayOfWeek]);
        
        // Java 8 Version
        LocalDate getDayOfWeeks = LocalDate.of(y, m, d);
        System.out.println(getDayOfWeeks.getDayOfWeek().toString());
        
        
        in.close();
	}

}
