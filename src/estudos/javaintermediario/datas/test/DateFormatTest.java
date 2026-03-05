package src.estudos.javaintermediario.datas.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        DateFormat dft1 = DateFormat.getDateInstance(DateFormat.SHORT); // definir formatacao
        System.out.println(dft1.format(c.getTime())); // passar a data atual no tipo date pra formatar

        System.out.println("=======================");

        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);


        for (DateFormat dft : df) {
            System.out.println(dft.format(c.getTime())); // transformar calendar em date com gettime
        }
    }
}
