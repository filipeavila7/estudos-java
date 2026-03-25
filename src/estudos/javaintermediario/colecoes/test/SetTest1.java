package src.estudos.javaintermediario.colecoes.test;

import java.util.HashSet;
import java.util.Set;

import src.estudos.javaintermediario.colecoes.dominio.Manga;

public class SetTest1 {
    public static void main(String[] args) {
        // não permite itens duplicados dentro da coleção
        Set<Manga> mangas = new HashSet<>();

        // depende do equals e do hash code subsescrito para saber se é igual ou não
        // caso não tenha overhide, ele ve pelo valor de memoria do obejto
        mangas.add(new Manga(1L,"chainsaw man", 50.8, 0));
        mangas.add(new Manga(4L,"bleach", 50.8,  10));
        mangas.add(new Manga(6L,"jujutsu", 70.8, 20));
        mangas.add(new Manga(2L,"berserk", 80.8, 0));
        mangas.add(new Manga(2L,"berserk", 80.8, 0));


        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
