package src.estudos.javaintermediario.streams.test;

import src.estudos.javaintermediario.streams.classes.Category;
import src.estudos.javaintermediario.streams.classes.LightNovel;
import src.estudos.javaintermediario.streams.classes.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamTest16 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("berserk", 8, Category.FANTASY),
            new LightNovel("bleach", 3, Category.ACTION),
            new LightNovel("bleach", 3, Category.ACTION),
            new LightNovel("jujutsu", 4, Category.ACTION),
            new LightNovel("one punch man", 1, Category.FANTASY),
            new LightNovel("chainsaw man", 10, Category.DRAMA)

    ));

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 100000000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumLongStreamIterateParallel(num);
    }
    private static void sumFor(long num){
        System.out.println("sum for");
        long result = 0;
        long init = System.currentTimeMillis();

        for (long i = 1; i <=num ; i++) {
            result += i;

        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("StreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        // ir do 1 ao 100000 e somar tudo
        result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    // paralelo, inves de usar uma treadh, usa varias
    // no caso piora a performance pois esta iterando de 1 por 1
    // pois não tem valor fixo definido, ele não sabe ate onde ele vai
    private static void sumParallelStreamIterate(long num){
        System.out.println("ParallelStreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        // ir do 1 ao 100000 e somar tudo
        result = Stream.iterate(1L, i -> i+1).parallel().limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("LongStreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        // ir do 1 ao 100000 e somar tudo
        result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterateParallel(long num){
        System.out.println("LongStreamIterateParallel");
        long result = 0;
        long init = System.currentTimeMillis();
        // ir do 1 ao 100000 e somar tudo
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}