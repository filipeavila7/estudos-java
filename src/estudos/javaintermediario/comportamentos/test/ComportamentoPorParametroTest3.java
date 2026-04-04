package src.estudos.javaintermediario.comportamentos.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest3 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1,2,3,4,5,6,7);
        System.out.println(filter(numeros, num -> num % 2 == 0)); // retorna so os pares
        
    }

    // filtro generico
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
            List<T> filtereList = new ArrayList<>();

            for (T t : list) {
                if (predicate.test(t)) {
                    filtereList.add(t);
                }
            }
            return filtereList;
        }
}
