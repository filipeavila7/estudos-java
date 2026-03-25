package src.estudos.javaintermediario.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import src.estudos.javaintermediario.colecoes.dominio.Manga;

public class BinarySearchTest2 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(1L,"chainsaw man", 50.8));
        mangas.add(new Manga(4L,"bleach", 50.8));
        mangas.add(new Manga(6L,"jujutsu", 70.8));
        mangas.add(new Manga(2L,"berserk", 80.8));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(4L,"bleach", 50.8);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch));




    }
}
