package src.estudos.javacore.blocosinicializacao.test;

import src.estudos.javacore.blocosinicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Bleach");

        System.out.println(anime.getEpisodios());
    }
}
