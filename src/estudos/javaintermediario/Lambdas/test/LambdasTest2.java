package src.estudos.javaintermediario.Lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasTest2 {
    public static void main(String[] args) {
        List<String> nomes = List.of("shipin", "patock", "ship");


        List<Integer> integers = map(nomes, nome -> nome.length()); // recebe String e retorna Integer por causa do length
        System.out.println(integers);


        List<Integer> integers2 = map(nomes, String::length); // mais simplificado
        System.out.println(integers2);
    }
    // tipo e retorno T R
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){ // tranformar um tipo em outro
        List<R> result = new ArrayList<>(); // retorna uma lista de outro tipo
        for (T e : list) {
          R r = function.apply(e); // apply recebe T e retorna R
          result.add(r);
        }
        return result;
    
    
    }


}