package src.estudos.javaintermediario.Lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;


public class MethodReferenceTest3 {
    public static void main(String[] args) {
        List<String> nomes =  new ArrayList<>(List.of("shipin", "ichigo", "shipino", "zipin")); 

        // usar o compareTo direto da classe String
        nomes.sort(String::compareTo);

        // recebe string e retorna integer
        // usa o parseint direto da classe integer para fazer a transformação
        Function<String, Integer> numStringToInteger = Integer::parseInt; 
        System.out.println(numStringToInteger.apply("18"));

        // biPredicate recebe 2 paramentros inves de 1 e checa se um existe 
        BiPredicate<List<String> , String> checkName = List::contains;
        System.out.println(checkName.test(nomes, "ship"));
    }
}
