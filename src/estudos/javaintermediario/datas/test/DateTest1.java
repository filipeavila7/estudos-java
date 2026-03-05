package src.estudos.javaintermediario.datas.test;

import java.util.Date;

public class DateTest1 {
    public static void main(String[] args) {
        Date date = new Date(1772720383844L); // long milisegundos --> 1970
        date.setTime(date.getTime() + 3600000);
        System.out.println(date);
    }
}
