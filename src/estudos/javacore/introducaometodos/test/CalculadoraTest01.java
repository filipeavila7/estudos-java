package src.estudos.javacore.introducaometodos.test;

import src.estudos.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        // criar o objeto 
        Calculadora calculadora = new Calculadora();

        // utilizar o metodo do objeto, passando como parametro/argumentos  os 2 numeros para a soma
        calculadora.somaDoisNumeros(10, 30);
        calculadora.subDoisNumeros(100, 49);
        calculadora.multiDoisNumeros(20, 3);
        calculadora.divDoisNumeros(10, 2);

        // colocar double pois o metodo retorna um double
        double result =  calculadora.divideDoisNumeros(30, 3);
        System.out.println(result);


    }
}
