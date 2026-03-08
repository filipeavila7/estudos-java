package src.estudos.javaintermediario.datas.test;

import java.time.LocalDate; // novo pacote de data indrotuzido no java 8
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        // pegar somente a data 
        LocalDate date = LocalDate.of(2026, Month.MARCH, 6);

        // pegar data de agora
        LocalDate agora = LocalDate.now();

        // usar metodos
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.ERA));
        System.out.println(date);
        System.out.println(agora);
    }
}
