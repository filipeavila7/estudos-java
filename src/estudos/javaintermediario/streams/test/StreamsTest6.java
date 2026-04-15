package src.estudos.javaintermediario.streams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


import src.estudos.javaintermediario.streams.classes.LightNovel;

public class StreamsTest6 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
        new LightNovel("berserk", 1),
        new LightNovel("bleach", 3),
        new LightNovel("bleach", 3),
        new LightNovel("jujutsu", 4),
        new LightNovel("one punch man", 1),
        new LightNovel("chainsaw man", 10)));

    public static void main(String[] args) {
       boolean anyMatch = lightNovels.stream().anyMatch(ln -> ln.getPrice() > 8); // retorna true se existe um lightnovel com preço maior que 8

       System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0)); // retorna true se todos da lista tem o preço maior que 0
       System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0)); 

       // retorna um optional, usando o metodo para tratar o optional (is present) fazwndo retronar void, printando o elemento
       lightNovels.stream().filter(ln -> ln.getPrice() >  3)
       .findAny()
       .ifPresent(System.out::println);

       lightNovels.stream().filter(ln -> ln.getPrice() > 3).sorted(Comparator.comparing(LightNovel::getPrice).reversed())
       .findFirst().
       ifPresent(System.out::println);


    }
}
