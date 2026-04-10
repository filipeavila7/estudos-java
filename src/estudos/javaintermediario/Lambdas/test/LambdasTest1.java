package src.estudos.javaintermediario.Lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdasTest1 {
    public static void main(String[] args) {
        List<String> nomes = List.of("shipin", "zipin", "shipo");
        // nome é o parametro do metodo accept
        forEach(nomes,  nome -> System.out.println(nome)); // implementar o metodo accept do consumer com a lambda
    }


    private static <T> void forEach(List<T> lista, Consumer<T> consumer){
        for(T e : lista){
            consumer.accept(e);
        }
    }
}
