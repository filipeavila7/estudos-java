package src.estudos.javaintermediario.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest1 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        mangas.add("chainsaw man");
        mangas.add("bleach");
        mangas.add("jujutsu kaisen");
        mangas.add("berserk");
        Collections.sort(mangas); // ordem alfabetica

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(120.89);
        dinheiros.add(30.81);
        dinheiros.add(10.21);

        Collections.sort(dinheiros);

        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }


        for (String manga : mangas) {
            System.out.println(manga);
        }
    }
}
