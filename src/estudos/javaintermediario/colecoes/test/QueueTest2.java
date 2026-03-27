package src.estudos.javaintermediario.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

import src.estudos.javaintermediario.colecoes.dominio.Consumidor;
import src.estudos.javaintermediario.colecoes.dominio.Manga;

public class QueueTest2 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("shipin");

        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());

        
        mangas.add(new Manga(1L,"chainsaw man", 50.8, 0));
        mangas.add(new Manga(4L,"bleach", 50.8,  10));
        mangas.add(new Manga(6L,"jujutsu", 70.8, 20));
        mangas.add(new Manga(2L,"berserk", 80.8, 0));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
