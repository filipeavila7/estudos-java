package src.estudos.javaintermediario.streams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamsTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n+2).
                limit(11).
                forEach(System.out::println);
        // sequencia de fibonacci -> (0, 1)  (1, 2) (2,3) (3,5) (5, 8)
        // posicao 0 e 1

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]}).limit(10)
                //.map(a -> a[0])
                .forEach(a -> System.out.println(Arrays.toString(a)));


        ThreadLocalRandom random = ThreadLocalRandom.current();

        // gerr 90 numeros aleatorios de 1 a 500
        Stream.generate(()-> random.nextInt(1, 5000)).limit(90).
                forEach(System.out::println);
    }
}
