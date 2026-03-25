package src.estudos.javaintermediario.colecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import src.estudos.javaintermediario.colecoes.dominio.Manga;
import src.estudos.javaintermediario.colecoes.dominio.SmartPhone;

class SmartPhoneMarcaComparator implements Comparator<SmartPhone>{

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        
        return o1.getMarca().compareTo(o2.getMarca());
    }

}


public class NavigableSetTest1 {
    public static void main(String[] args) {
        // passsar um comparator no cosntrutor ou o obejeto implementar
        // imprime tudo na ordem de acordo com o comparator, no caso do id, e tb cada um é unico igual ao do set
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartPhoneMarcaComparator()); // os objetos que vão aqui dentro tem que ser um comparable

        SmartPhone smartPhone = new SmartPhone("123", "nokia");

        set.add(smartPhone);

        System.out.println(set);
        System.out.println("-------------------------------");

        NavigableSet<Manga> mangas = new TreeSet<>();


        mangas.add(new Manga(1L,"chainsaw man", 50.8, 0));
        mangas.add(new Manga(4L,"bleach", 50.8,  10));
        mangas.add(new Manga(6L,"jujutsu", 70.8, 20));
        mangas.add(new Manga(2L,"berserk", 80.8, 0));


        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
