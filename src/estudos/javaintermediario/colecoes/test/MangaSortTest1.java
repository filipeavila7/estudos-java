package src.estudos.javaintermediario.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import src.estudos.javaintermediario.colecoes.dominio.Manga;

class mangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
    
}

public class MangaSortTest1 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(1L,"chainsaw man", 50.8));
        mangas.add(new Manga(4L,"bleach", 50.8));
        mangas.add(new Manga(6L,"jujutsu", 70.8));
        mangas.add(new Manga(2L,"berserk", 80.8));

        System.out.println(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


        Collections.sort(mangas, new mangaByIdComparator());

        // para usar sort direto no manga, é preciso passar um objeto do tipo comparator
        mangas.sort(new mangaByIdComparator());
        System.out.println("===============");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
