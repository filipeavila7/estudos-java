package src.estudos.javaintermediario.generics.test;

import java.util.ArrayList;

import java.util.List;

import src.estudos.javaintermediario.generics.dominio.Barco;

public class MetodoGenericoTest1 {
    public static void main(String[] args) {
        print("ola mundo");

        criarArrayComObjeto(new Barco("barco"));
        
    }

    // metodo generico que recebe o tipo no argumento e cria um array com esse tipo 
    private static <T> void criarArrayComObjeto(T objeto){
        List<T> list = new ArrayList<>(List.of(objeto));
        System.out.println(list);
    }

    public static <T> T print (T obj){
        System.out.println(obj);
        return obj;
    }

    // só recebe um tipo que é um comparable
    public static <T extends Comparable<T>> void comparavel(T obj){

    }
}

