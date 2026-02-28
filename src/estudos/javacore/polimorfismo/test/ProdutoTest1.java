package src.estudos.javacore.polimorfismo.test;

import src.estudos.javacore.polimorfismo.dominio.Computador;
import src.estudos.javacore.polimorfismo.dominio.Televisao;
import src.estudos.javacore.polimorfismo.dominio.Tomate;
import src.estudos.javacore.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest1 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzen 5060", 7000);
        Tomate tomate = new Tomate("tomate comum", 5);
        Televisao televisao = new Televisao("sansung 8k", 9000);        
        // usar metodo estatico da classe para não preciasr instanciar objeto
        // usar metodo que aceita um tipo de produto, pois a classe computador é um produto pq herdou a classe de produto
        // inves de criar um metodo pra cada produto ex computador, tomate etc, crie um metodo que aceite todos os tipos de produto (Produto produto) uq e é a superclasse que eles herdam
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
