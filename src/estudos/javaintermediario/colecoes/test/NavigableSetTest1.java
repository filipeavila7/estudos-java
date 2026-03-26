package src.estudos.javaintermediario.colecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import src.estudos.javaintermediario.colecoes.dominio.Manga;
import src.estudos.javaintermediario.colecoes.dominio.SmartPhone;

class SmartPhoneMarcaComparator implements Comparator<SmartPhone> {

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {

        return o1.getMarca().compareTo(o2.getMarca());
    }

}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }

}

public class NavigableSetTest1 {
    public static void main(String[] args) {
        // passsar um comparator no cosntrutor ou o obejeto implementar
        // imprime tudo na ordem de acordo com o comparator, no caso do id, e tb cada um é unico igual ao do set
        // treeSet usa o compareTo, e não equals e hashcode diferente do set
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartPhoneMarcaComparator()); // os objetos que vão aqui dentro tem que ser um comparable

        SmartPhone smartPhone = new SmartPhone("123", "nokia");

        set.add(smartPhone);

        System.out.println(set);
        System.out.println("-------------------------------");

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());


        mangas.add(new Manga(1L,"chainsaw man", 8, 0));
        mangas.add(new Manga(4L,"bleach", 50.8,  10));
        mangas.add(new Manga(6L,"jujutsu", 7, 20));
        mangas.add(new Manga(2L,"berserk", 80.8, 0));


        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-------------=------------");
        // oredem inversa
        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }
         System.out.println("-------------=------------");

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        // baseado no que vc ta passando


        Manga bleach = new Manga(6L,"bleach", 8, 20);
        //encontrar mangas com valores menores do que desse
        System.out.println(mangas.lower(bleach));

        //encontrar menores ou iguais
        System.out.println(mangas.floor(bleach));

        // maiores
        System.out.println(mangas.higher(bleach));

        // maior ou igual
        System.out.println(mangas.floor(bleach));


        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // retorna e remove o primeiro da lista
        System.out.println(mangas.size());


        System.out.println(mangas.size());
        System.out.println(mangas.pollLast()); // retorna e remove o ultimo da lista
        System.out.println(mangas.size());



    }

}
