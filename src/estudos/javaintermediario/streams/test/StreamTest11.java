package src.estudos.javaintermediario.streams.test;

import src.estudos.javaintermediario.streams.classes.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("berserk", 8),
            new LightNovel("bleach", 3),
            new LightNovel("bleach", 3),
            new LightNovel("jujutsu", 4),
            new LightNovel("one punch man", 1),
            new LightNovel("chainsaw man", 10)

    ));
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());
        // contat quantos tem
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        // retorna o maior de acordo com o preço
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);


        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));


        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        // ja retorna tudo dentro de um objeto so
        DoubleSummaryStatistics collect = lightNovels.stream().
                collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(collect);

        // juntar tydo em uma string só e separar por ", "
        String collect1 = lightNovels.stream().map(LightNovel::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(collect1);
    }
}
