package src.estudos.javaintermediario.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        // forçar em tempo de compilação que esse list so tera string
        // polimorfismo
        List<String> nomes = new ArrayList<>(); // arrayist é um tipo de list e é uma string
        List<String> nomes2 = new ArrayList<>(); // arrayist é um tipo de list e é uma string

        nomes.add("shipin"); 
        nomes.add("patock");
        nomes2.add("shipino");
        nomes2.add("zipin");

        nomes.addAll(nomes2); // addAll recebe uma coleção, passa todos os valores de uma lista para outra se o tipo for igual

        //nomes.remove("shipin"); // remover pelo objeto string ou pelo indice, usa o equaasl para achar, maiim motivo para list usar wrappers

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("--------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i)); // pegar os valores do indices passando o indice
        }


        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
