package CWH;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendar {
    public static void main(String[] args)
    {
        // calendar class is abstract class
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());   // gives current time
        System.out.println(c.getTimeZone());  // gives timezone
        System.out.println(c.getTimeZone().getID()+"\n");

        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));  // 12 format
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+"\n"); // 24 format

        // printing time
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        // gregorian calender
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2027));
        System.out.println(cal.getWeekYear());


    }
}
