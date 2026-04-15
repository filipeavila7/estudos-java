package src.estudos.javaintermediario.streams.test;

import java.util.ArrayList;
import java.util.List;

import src.estudos.javaintermediario.streams.classes.LightNovel;

public class StreamsTest8 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
        new LightNovel("berserk", 1),
        new LightNovel("bleach", 3),
        new LightNovel("bleach", 3),
        new LightNovel("jujutsu", 4),
        new LightNovel("one punch man", 1),
        new LightNovel("chainsaw man", 10)));
    public static void main(String[] args) {
        lightNovels.stream()
        .map(LightNovel::getPrice) // pega so os preços
        .filter(priece -> priece > 3) // pega so os maiores que 3
        .reduce(Double::sum) // soma todos os preços maiores que 3
        .ifPresent(System.out::println); // retorna option, caso exista, printa


        double sum = lightNovels.stream()  
        .mapToDouble(LightNovel::getPrice) // transfoma em double, e não em stream<double>, mais rapido e retorna primitivo
        .filter(p -> p > 3).sum(); // podendo usar o sum direto sem ter que usar reduce

        System.out.println(sum);
    }
}
