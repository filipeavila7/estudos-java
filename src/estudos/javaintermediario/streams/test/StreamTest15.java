package src.estudos.javaintermediario.streams.test;

import src.estudos.javaintermediario.streams.classes.Category;
import src.estudos.javaintermediario.streams.classes.LightNovel;
import src.estudos.javaintermediario.streams.classes.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest15 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("berserk", 8, Category.FANTASY),
            new LightNovel("bleach", 3, Category.ACTION),
            new LightNovel("bleach", 3, Category.ACTION),
            new LightNovel("jujutsu", 4, Category.ACTION),
            new LightNovel("one punch man", 1, Category.FANTASY),
            new LightNovel("chainsaw man", 10, Category.DRAMA)

    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        // Map<category, List<Promotion>>
        // agrupar por categoria
        // mapping transforma em promotion e o toSet em um set de promotion
        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory,
                mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);

        // linked hashSet para manter a ordem de inserção
        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory,
                mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));

    }

    private static Promotion getPromotion(LightNovel ln){
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}