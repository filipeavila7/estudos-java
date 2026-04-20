package src.estudos.javaintermediario.streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest9 {
    public static void main(String[] args) {
        // rangedClosed conta com o ultimo numero tambem
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println(" ");
        // range vai ate 49
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println(" ");

        // criar uma stream de strings com o of
        Stream.of("shipin", "shipo", "teste").map(String::toUpperCase)
                .forEach(System.out::println);

        int [] nums = {1,2,3,4,5};
        // transforma array de numeros em um intStream
        Arrays.stream(nums).average() // retornar a media
                .ifPresent(System.out::println);

        // pegar linhas d eum arquivo, tranforma em uma stream de strings
        try(Stream<String> lines = Files.lines(Paths.get("file2.txt"))) {
            lines.filter(l -> l.contains("java")) // filtra se alguma linha contem java
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
