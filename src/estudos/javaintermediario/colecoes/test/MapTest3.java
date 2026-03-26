package src.estudos.javaintermediario.colecoes.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import src.estudos.javaintermediario.colecoes.dominio.Consumidor;
import src.estudos.javaintermediario.colecoes.dominio.Manga;

public class MapTest3 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("shipin");
        Consumidor c2 = new Consumidor("shipadas");

        Manga manga1 = new Manga(1L, "chainsaw man", 50.8);
        Manga manga2 = new Manga(4L, "bleach", 50.8);
        Manga manga3 = new Manga(6L, "jujutsu", 70.8);
        Manga manga4 = new Manga(2L, "berserk", 80.8);
        
        // adcionar lista de valores dentro do map cada uma com uma chave que no caso é o consumidor
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();

        // criar as listas
        List<Manga> mangaConsumidorList1 = List.of(manga1, manga3);
        List<Manga> mangaConsumidorList2 = List.of(manga2, manga4);

        // adcionar as listas no map
        consumidorManga.put(c1, mangaConsumidorList1);
        consumidorManga.put(c2, mangaConsumidorList2);
    

        for (Map.Entry<Consumidor, List<Manga>> entry: consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + ":");
            for (Manga mangas : entry.getValue()) {
                System.out.println(mangas.getNome());
            }
        }
    }

}
