package src.estudos.javaintermediario.format.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {
    public static void main(String[] args) {
        // modelo de data
        String pattern = "dd 'do' MM 'de' yyyy G 'as' HH:mm:ss z"; 
        // passar o modelo no construtor
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        // usar o metodo format passando uma data como argumento
         System.out.println(simpleDateFormat.format(new Date())); 
    }
}
