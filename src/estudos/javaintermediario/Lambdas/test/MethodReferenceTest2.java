package src.estudos.javaintermediario.Lambdas.test;

import java.util.ArrayList;
import java.util.List;

import src.estudos.javaintermediario.Lambdas.dominio.Anime;
import src.estudos.javaintermediario.Lambdas.service.AnimeComparators;

// método não estatico
public class MethodReferenceTest2 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();

        List<Anime> animesList = new ArrayList<>(List.of(new Anime("berserk", 43), new Anime("bleach", 300),
        new Anime("jujutsu", 90))); 

        // usar o metodo do objeto pois é não estatico
        animesList.sort(animeComparators::compareByEpisodesNoStatic);

        // outra forma menos enxuta 
        animesList.sort((a1, a2) -> AnimeComparators.compareByEpisodes(a1, a2));

        System.out.println(animesList);
    }
}
