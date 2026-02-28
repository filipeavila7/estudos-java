package src.estudos.javacore.polimorfismo.test;

import src.estudos.javacore.polimorfismo.dominio.Computador;
import src.estudos.javacore.polimorfismo.dominio.Produto;
import src.estudos.javacore.polimorfismo.dominio.Tomate;
import src.estudos.javacore.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Corei7", 5000); 
        Tomate tomate = new Tomate("tomate americano", 7);
        tomate.setDataValidade("12/08/2026");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
    
}
