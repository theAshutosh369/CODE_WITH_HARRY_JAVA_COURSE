package CWH_java_course;

import java.util.*;

public class main{

    static void processArray( )
    {
        Scanner s = new Scanner(System.in);
        long n ;
        ArrayList<Long> arr = new ArrayList<>();
        while( true)
        {
            n = s.nextLong();
            if( n<0 ) break;
            else {
                arr.add(n);
            }
        }
        long c =0 ;

        for(int i = 0; i < arr.size(); i++) {
            if( arr.get(i)%6 == 0 )
            {
                c++;
            }
        }
        System.out.println( c );

    }
    public static void main ( String[] args ) {
        processArray();

    }
}
