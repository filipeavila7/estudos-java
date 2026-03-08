package src.estudos.javaintermediario.datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly =  new Locale("it", "IT");
        Locale localeCh =  new Locale("it", "CH");
        Locale localIndia = new Locale("hi", "IN");
        Locale localJapao = new Locale("ja", "JP");


        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCh);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localJapao);


        System.out.println("italia: " + df1.format(calendar.getTime()));
        System.out.println("suiça: " + df2.format(calendar.getTime()));
        System.out.println("india: " + df3.format(calendar.getTime()));
        System.out.println("japao: " + df4.format(calendar.getTime()));


        System.out.println(localeCh.getDisplayCountry());
    }
}
