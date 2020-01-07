package hackerrank.java;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FindDay {

    public static void main(String...arg){
        int dd = 8;
        int mm = 6;
        int yy = 2015;

        Calendar calendar = new GregorianCalendar(yy,mm-1,dd);
        System.out.println(calendar.get(calendar.DAY_OF_WEEK));
    }
}
