package src.estudos.javaintermediario.streams.test;

import src.estudos.javaintermediario.streams.classes.Category;
import src.estudos.javaintermediario.streams.classes.LightNovel;
import src.estudos.javaintermediario.streams.classes.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("berserk", 8, Category.FANTASY),
            new LightNovel("bleach", 3, Category.ACTION),
            new LightNovel("bleach", 3, Category.ACTION),
            new LightNovel("jujutsu", 4, Category.ACTION),
            new LightNovel("one punch man", 1, Category.FANTASY),
            new LightNovel("chainsaw man", 10, Category.DRAMA)

    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors
                        .maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect2);

        // tirar o optional
        Map<Category, LightNovel> collect3 = lightNovels.stream()
                .collect(groupingBy(
                        LightNovel::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),
                                Optional::get
                        )
                ));
        System.out.println(collect3);
    }
}