package src.estudos.javaintermediario.colecoes.test;

import java.util.HashMap;
import java.util.Map;

import src.estudos.javaintermediario.colecoes.dominio.Consumidor;
import src.estudos.javaintermediario.colecoes.dominio.Manga;

public class MapTest2 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("shipin");
        Consumidor c2 = new Consumidor("shipadas");

        Manga manga1 = new Manga(1L, "chainsaw man", 50.8);
        Manga manga2 = new Manga(4L, "bleach", 50.8);
        Manga manga3 = new Manga(6L, "jujutsu", 70.8);
        Manga manga4 = new Manga(2L, "berserk", 80.8);
        
        
        Map<Consumidor, Manga> consumidorManga = new HashMap<>();

        consumidorManga.put(c1, manga1);
        consumidorManga.put(c2, manga4);


        for (Map.Entry<Consumidor, Manga> entry: consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue().getNome());
        }

    }

}
