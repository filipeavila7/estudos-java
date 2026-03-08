package src.estudos.javaintermediario.format.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest2 {
    public static void main(String[] args) {
        Locale localePt = new Locale("pt", "BR");
        Locale localeJp = Locale.JAPAN;
        Locale localeIt = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localePt);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJp);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIt);

        double valor = 10000.2349;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));   
        }
    }
}
