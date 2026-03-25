package src.estudos.javaintermediario.colecoes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import src.estudos.javaintermediario.colecoes.dominio.Manga;

public class IteratorTest1 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        // linkedList sabe qual posição vem antes e depois, é mais rapido para remover
        List<Manga> mangaLinked = new LinkedList<>();

        mangas.add(new Manga(1L,"chainsaw man", 50.8, 0));
        mangas.add(new Manga(4L,"bleach", 50.8,  10));
        mangas.add(new Manga(6L,"jujutsu", 70.8, 20));
        mangas.add(new Manga(2L,"berserk", 80.8, 0));

        // for (Manga manga : mangas) {
        //     if (manga.getQuantidade() == 0) {
        //         mangas.remove(manga);
        //     }
        // }


        Iterator<Manga> iterator = mangas.iterator();

        while (iterator.hasNext()) { // enquanto existir proximo na fila:
            Manga mangaNext = iterator.next();
            if (mangaNext.getQuantidade() == 0) {
                iterator.remove();
            }

        }
        System.out.println(mangas);


        // percorre automaticamnte e ja remove com base na vriavel de referencia
        mangas.removeIf(manga -> manga.getQuantidade() == 0 ); // variavel de rferencia dentro
    }
}
