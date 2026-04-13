package src.estudos.javaintermediario.streams.test;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;

public class StreamsTest4 {
    public static void main(String[] args) {
        List<List<String>>  list = new ArrayList<>();
        List<String> graphicDesigners = List.of("shipin", "shipo", "shipadas");
        List<String> developpers = List.of("ichigo", "artorias", "gael");
        List<String> estudants = List.of("mairo", "getsuga", "shipo");      

        list.add(graphicDesigners);
        list.add(developpers);
        list.add(estudants);

        for (List<String> pessoas : list) {
            for (String nome : pessoas) {
                System.out.println(nome);
            }
        }
        System.out.println("-----------------------------");

        list.stream()
        .flatMap(Collection::stream) // flatmap, triar o atributo de dentro, mais fundo que o map, para cada lista dentro da lista, ele retorna em stream de string
        .forEach(System.out::println);
        
    }
    

}
