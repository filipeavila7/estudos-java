package src.estudos.javaintermediario.streams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import src.estudos.javaintermediario.streams.classes.LightNovel;

public class StreamsTest2 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
        new LightNovel("berserk", 8),
        new LightNovel("bleach", 3),
        new LightNovel("jujutsu", 4),
        new LightNovel("one punch man", 1),
        new LightNovel("chainsaw man", 10)

    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream().sorted(Comparator.comparing(LightNovel::getTitle)) // organizar em ordem alfabetica
        .filter(ln -> ln.getPrice() <= 4) // filtrar por preço menor que 4
        .limit(3) // mostrar so os 3 primeiros
        .map(ln -> ln.getTitle()) // transformar no titulo, objeto lightnovel -> titulo
        .collect(Collectors.toList()); // transformar em uma lista


        System.out.println(titles);
    }
}
