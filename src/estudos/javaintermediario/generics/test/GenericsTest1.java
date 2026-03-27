package src.estudos.javaintermediario.generics.test;

import java.util.ArrayList;
import java.util.List;

//import src.estudos.javaintermediario.colecoes.dominio.Consumidor;

public class GenericsTest1 {
    public static void main(String[] args) {
        // generics --> definir o tipo em tempo de compilação, mantendo a
        // retrocompatibilidade com sistemas mais antigos
        // type eraser
        List<String> lista = new ArrayList<>();


        lista.add("shipin");
        lista.add("shipin");


        for (String string : lista) {
            System.out.println(string);
        }

        //add(lista, new Consumidor("shipin"));
    }
    

    //private static void add(List<> lista, Consumidor consumidor){
    //    lista.add(consumidor);
    //}

}
