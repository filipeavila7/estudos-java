package src.estudos.javaintermediario.datas.test;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest1 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2007, 12, 12, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        
        // diferença de dias entre o aniversario e a data de hj
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.HOURS.between(aniversario, now)); 
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now)); 
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now)); 
        System.out.println(ChronoUnit.SECONDS.between(aniversario, now)); 
    }
}
