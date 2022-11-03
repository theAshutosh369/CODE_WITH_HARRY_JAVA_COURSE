package CWH;

import java.util.Date;

public class date_n_time {
    public static void main(String[] args) {
        // java starting data 1 jan 1970 la manat
        System.out.println(System.currentTimeMillis()); // starting pasunevdhe millisec zalele ahet
        System.out.println(System.currentTimeMillis()/1000); // starting pasunevdhe sec zalele ahet

        System.out.println(System.currentTimeMillis()/1000/60); // starting pasunevdhe min zalele ahet

        System.out.println(System.currentTimeMillis()/1000/3600); // starting pasunevdhe hours zalele ahet
        System.out.println(System.currentTimeMillis()/1000/3600/24); // starting pasunevdhe divas zalele ahet
        System.out.println(System.currentTimeMillis()/1000/3600/24/365); // starting pasunevdhe varsh zalele ahet

        System.out.println("----------------------------------");
        Date d = new Date();
        System.out.println("todays date is : "+d);
        System.out.println(d.getTime());
        System.out.println(d.getDate()); // depricated methods ahet
        System.out.println(d.getDay());
        System.out.println(d.getYear());

    }
}
