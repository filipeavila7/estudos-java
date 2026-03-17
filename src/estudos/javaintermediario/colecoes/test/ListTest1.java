package src.estudos.javaintermediario.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        // forçar em tempo de compilação que esse list so tera string
        // polimorfismo
        List<String> nomes = new ArrayList<>(); // arrayist é um tipo de list e é uma string

        nomes.add("shipin");
        nomes.add("patock");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("--------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i)); // pegar os valores do indices passando o indice
        }
    }
}
