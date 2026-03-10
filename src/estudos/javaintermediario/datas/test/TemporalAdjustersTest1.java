package src.estudos.javaintermediario.datas.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;


class ObterProximoDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        temporal.get(ChronoField.DAY_OF_WEEK);
        return null;
    }
    
}


public class TemporalAdjustersTest1 {
    
    public static void main(String[] args) {
        LocalDate now = LocalDate.now().with(null);
        
    }
}
