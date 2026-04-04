package src.estudos.javaintermediario.classesinternas.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import src.estudos.javaintermediario.generics.dominio.Barco;

public class ClassesAnonimasTest2 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("canoa furada"), new Barco("lancha")));

        barcoList.sort(new Comparator<Barco>() {
            // classe anonima para trnasformar os objetos em comparator para poder usar o sort para organizar os nomes por ordem alfabetica
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
            
        });

        System.out.println(barcoList);
    }
}
