package src.estudos.javaintermediario.streams.test;

import java.util.ArrayList;
import java.util.List;

import src.estudos.javaintermediario.streams.classes.LightNovel;

public class StreamsTest3 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
        new LightNovel("berserk", 8),
        new LightNovel("bleach", 3),
        new LightNovel("bleach", 3),
        new LightNovel("jujutsu", 4),
        new LightNovel("one punch man", 1),
        new LightNovel("chainsaw man", 10)

    ));
    public static void main(String[] args) {
        lightNovels.forEach(System.out::println); // imprimir com metodo da lista

        lightNovels.stream().forEach(System.out::println); // imprimir com o metodo da stream

        long count = lightNovels.stream().filter(ln -> ln.getPrice() <= 4).count(); // contar quantos tem o preço menor que 4
        
        System.out.println(count);

        long count2 = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 4).count(); // tirar repetidos, ficar atendo ao equals e hash code

        System.out.println(count2);
    }
}
