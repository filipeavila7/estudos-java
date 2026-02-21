package src.estudos.javacore.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest1 {
    public static void main(String[] args) {
        // classe para poder inserir dados no console
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite o seu nome: ");
        // guardar a instacia entrada usando o metodo dentro de uma variavel e usar o metodo para escrever strings (nextline)
        String nome = entrada.nextLine();

        System.out.print("digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("digite M para masculino ou F para feminino: ");
        // pegar a primeira posicao da palavra, ou seja o primeiro caracter
        char sx = entrada.next().charAt(0);

        // printar no console a variavel onde vc escreveu usando o metodo nextline
        System.out.print("seu nome é: " + nome);
        System.out.println("");
        System.out.print("sua idade é: " + idade);
        System.out.println("");
        System.out.println("seu sexo é: " + sx);
    }
}
