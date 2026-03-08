package src.estudos.javaintermediario.format.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest1 {
    public static void main(String[] args) {
        Locale localePt = new Locale("pt", "BR");
        Locale localeJp = Locale.JAPAN;
        Locale localeIt = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localePt);
        nfa[2] = NumberFormat.getInstance(localeJp);
        nfa[3] = NumberFormat.getInstance(localeIt);

        double valor = 10000.2349;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));   
        }
    }
}
