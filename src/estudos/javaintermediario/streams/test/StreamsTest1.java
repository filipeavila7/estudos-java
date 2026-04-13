package src.estudos.javaintermediario.streams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import src.estudos.javaintermediario.streams.classes.LightNovel;

// 1 -> ordenar pelo title
// 2 -> retornar as 3 primeiras titulos dos light novels com o preço menor que 4
public class StreamsTest1 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
        new LightNovel("berserk", 8),
        new LightNovel("bleach", 3),
        new LightNovel("jujutsu", 4),
        new LightNovel("one punch man", 1),
        new LightNovel("chainsaw man", 10)

    ));
   public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovels);

        List<String> titulos = new ArrayList<>();
 
        for (LightNovel lightNovel: lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titulos.add(lightNovel.getTitle());

            }

            if (titulos.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titulos);
     
}
}
