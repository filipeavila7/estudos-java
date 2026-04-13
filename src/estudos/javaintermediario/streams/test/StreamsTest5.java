package src.estudos.javaintermediario.streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest5 {
    public static void main(String[] args) {
        List<String> words = List.of("shi", "shu", "sha");

        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));


        List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());

        Stream<String> stream = Arrays.stream(letters);

        List<String> collect2 = words.stream()
        .map(w -> w.split(""))
        // flatMap
        .flatMap(Arrays::stream).collect(Collectors.toList()); // Arrays::stram, transforma os arrays String em Streams, junto com o flatMap que retrona um List<String> ao inves de um  List<String[]>

        System.out.println(collect);

        System.out.println(collect2);
    }
}
