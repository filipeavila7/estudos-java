package src.estudos.javaintermediario.Lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import src.estudos.javaintermediario.Lambdas.dominio.Anime;
import src.estudos.javaintermediario.Lambdas.service.AnimeComparators;

// referecia para construtor
public class MethodReferenceTest4 {
    public static void main(String[] args) {

        //Supplier<AnimeComparators> newAnimSupplier = () -> new AnimeComparators();
        // criar obejto a partir da interface funcional supplier
        Supplier<AnimeComparators> newAnimSupplier = AnimeComparators::new; 


        AnimeComparators animeComparators = newAnimSupplier.get(); // criar o obejto

        List<Anime> animesList = new ArrayList<>(List.of(new Anime("berserk", 43), new Anime("bleach", 300),
        new Anime("jujutsu", 90))); 

        animesList.sort(animeComparators::compareByEpisodesNoStatic);

        // BiFunction<String, Integer, Anime> aBiFunction = (title,episodes) -> new Anime(title, episodes);

        //cirar objeto com cosntrutor obrigatorio
        BiFunction<String, Integer, Anime> aBiFunction = Anime::new;

        // passar os valores no aply para criar
        System.out.println(aBiFunction.apply("one piece", 900));

    }
}
