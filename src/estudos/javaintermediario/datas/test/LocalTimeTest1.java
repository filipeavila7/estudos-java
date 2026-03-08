package src.estudos.javaintermediario.datas.test;

import java.time.LocalTime;

public class LocalTimeTest1 {
    public static void main(String[] args) {
       LocalTime localTime =  LocalTime.of(23, 59, 59);
       LocalTime localTime2Now = LocalTime.now();
       System.out.println(localTime);

       System.out.println(localTime2Now);

       System.out.println(localTime2Now.getHour());
       System.out.println(localTime.getMinute());
       System.out.println(localTime.getSecond());


       System.out.println(LocalTime.MIDNIGHT);
       System.out.println(LocalTime.MIN);
    }
}
