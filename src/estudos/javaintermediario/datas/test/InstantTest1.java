package src.estudos.javaintermediario.datas.test;

import java.time.Instant;

public class InstantTest1 {
    public static void main(String[] args) {
        Instant now = Instant.now(); // zulo time Z

        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
    }
}
