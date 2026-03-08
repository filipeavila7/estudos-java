package src.estudos.javaintermediario.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime; // junção das 2
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest1{
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2026, Month.AUGUST, 16);
        LocalTime time = LocalTime.of(13, 55, 44);

        LocalDateTime localDateTime2 = date.atTime(time); // passar um tempo especcico
        localDateTime = time.atDate(date); // passar dia especifico
        System.out.println(localDateTime2);
    }
}
