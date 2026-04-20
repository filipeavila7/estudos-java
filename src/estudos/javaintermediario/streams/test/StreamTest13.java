package src.estudos.javaintermediario.streams.test;

import src.estudos.javaintermediario.streams.classes.Category;
import src.estudos.javaintermediario.streams.classes.LightNovel;
import src.estudos.javaintermediario.streams.classes.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("berserk", 8, Category.FANTASY),
            new LightNovel("bleach", 3, Category.ACTION),
            new LightNovel("bleach", 3, Category.ACTION),
            new LightNovel("jujutsu", 4, Category.ACTION),
            new LightNovel("one punch man", 1, Category.FANTASY),
            new LightNovel("chainsaw man", 10, Category.DRAMA)

    ));

    public static void main(String[] args) {
        // retrona a chave do map sendo uma promotion caso ela seja menor que 6
        // under, caso seja maior, normal
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(Collectors
                .groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION :
                        Promotion.NORMAL_PRICE
                ));
        System.out.println(collect);

        System.out.println("+=========================+");
        // Map<Categorio, Map<Promotion, LightNovels>>>
        // segundo groupBy para ficar com um map coom chave de categoria, e o map contendo promotion e lightNovels
        Map<Category, Map<Promotion, List<LightNovel>>> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors
                .groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION :
                        Promotion.NORMAL_PRICE
                )));

        System.out.println(collect2);
    }
}