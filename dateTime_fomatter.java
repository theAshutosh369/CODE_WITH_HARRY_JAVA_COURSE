package CWH;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTime_fomatter
{
    public static void main(String[] args)
    {
        LocalDateTime dt = LocalDateTime.now(); // this is date
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // this is format
        System.out.println(dtf);
        String date = dt.format(dtf);
        System.out.println(date);
    }
}
