package src.estudos.javacore.associacao.test;

import java.util.Scanner;

import src.estudos.javacore.associacao.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner entrada = new Scanner(System.in).useLocale(java.util.Locale.US);

        while (true) {
            System.out.print("Digite um número: ");
            double num1 = entrada.nextDouble();

            System.out.print("Digite outro número: ");
            double num2 = entrada.nextDouble();

            calculadora.somaDoisNumeros(num1, num2);

        }
        
        
    }
}
