package src.estudos.javaintermediario.streams.test;

import src.estudos.javaintermediario.streams.classes.Category;
import src.estudos.javaintermediario.streams.classes.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest12 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("berserk", 8, Category.FANTASY),
            new LightNovel("bleach", 3, Category.ACTION),
            new LightNovel("bleach", 3 , Category.ACTION),
            new LightNovel("jujutsu", 4 , Category.ACTION),
            new LightNovel("one punch man", 1, Category.FANTASY),
            new LightNovel("chainsaw man", 10, Category.DRAMA)

    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();

        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> action = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()){
                case DRAMA : drama.add(lightNovel); break;
                case FANTASY : fantasy.add(lightNovel); break;
                case ACTION : action.add(lightNovel); break;
            }
        }
        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.ACTION, action);
        categoryListMap.put(Category.FANTASY, fantasy);

        System.out.println(categoryListMap);
        // fazer de forma bem mais rapida em relação ao codigo de cima
        // vai agrupar pela categoria, a categoria vai ser a chave do map e os valores vaõ ser uma lista de novels
        Map<Category, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
