package src.estudos.javaintermediario.colecoes.test;

import src.estudos.javaintermediario.colecoes.dominio.SmartPhone;

public class EqualsTest1 {
    public static void main(String[] args) {
        String nome = "shipin patock";
        String nome2 = new String("shipin patock");
        System.out.println(nome.equals(nome2)); // compara o valor da string
        // == compara se a refrencia esta fazendo referencia pro msm valor
        // equals compara se os valores sao iguais

        
        SmartPhone s1 = new SmartPhone("1a", "iphone");
        SmartPhone s2 = new SmartPhone("1a", "iphone");


        System.out.println(s1.equals(s2)); // false, msm os valores dos atributos sendo iguais, são referecias a 2 objetos diferentes
    }
}
