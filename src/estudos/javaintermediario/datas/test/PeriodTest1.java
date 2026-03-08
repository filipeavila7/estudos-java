package src.estudos.javaintermediario.datas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);
    
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofWeeks(12); // retornar quantos dias tem em 12 semanas
        System.out.println(p1);

        System.out.println(p2);


       
    
    }
}
