package src.estudos.javaintermediario.datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("domingo");
        }


        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
       
        
    }
    

    
}
