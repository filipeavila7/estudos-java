package src.estudos.javacore.introducaometodos.test;

import src.estudos.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);

        // com varArgs eu ja posso passar o array de valores diretamente no parametro
        calculadora.somaVarArgs(1,2,3,5,6,7);
    }
}
