package src.estudos.javaintermediario.Lambdas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import src.estudos.javaintermediario.Lambdas.dominio.Anime;
import src.estudos.javaintermediario.Lambdas.service.AnimeComparators;

// para metodos static
public class MethodReferenceTest1 {
    public static void main(String[] args) {
        List<Anime> animesList = new ArrayList<>(List.of(new Anime("berserk", 43), new Anime("bleach", 300),
        new Anime("jujutsu", 90))); 

        Collections.sort(animesList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //Collections.sort(animesList, (a1, a2) -> AnimeComparators.compareBytitle(a1, a2));
        Collections.sort(animesList , AnimeComparators::compareBytitle);
        Collections.sort(animesList , AnimeComparators::compareByEpisodes);
        System.out.println(animesList);
    }
}
