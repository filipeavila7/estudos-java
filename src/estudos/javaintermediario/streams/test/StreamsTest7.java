package src.estudos.javaintermediario.streams.test;

import java.util.List;

// reduce -> pegar varos elementos de uma stream e reduzir a 1 valor

public class StreamsTest7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2,3 ,50 ,7 ,8);
        int soma = 0;
        for (Integer i : list) {
            soma += i;
        }
        System.out.println(soma);
        // tambem retorna um optional, usa ifpresent para tratar
        list.stream().reduce((x, y) -> x+y).ifPresent(System.out::println);

        // coloca um valor inicial para não ter que tratar o optional, fazendo retornar um integer agr

        Integer reduce = list.stream().reduce(0, (x, y) -> x+y);
        System.out.println(reduce);

        // method reference para somar os valores da
        list.stream().reduce(Integer::sum).ifPresent(System.out::println);
        list.stream().reduce(0, Integer::sum);

        System.out.println("---------------------------");
        list.stream().reduce((x, y) -> x*y).ifPresent(System.out::println);

        System.out.println(list.stream().reduce(0, (x, y) -> x*y)); 

        System.out.println(list.stream().reduce(0, Integer::max)); // retorna o maior 
    }   
}
