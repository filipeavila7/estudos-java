package src.estudos.javaintermediario.datas.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours(7);


        Duration duration = Duration.between(now, nowAfterTwoYears); // diferença entre 2 datas
        Duration duration2 = Duration.between(timeNow, timeMinusSevenHours); // diferença entre 2 horarios
        System.out.println(duration);
        System.out.println(duration2);


        Duration duration3 = Duration.ofDays(30); // retorna quantas horas tem 30 dias
        System.out.println(duration3);
    }
}
