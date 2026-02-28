package src.estudos.javacore.polimorfismo.test;

import src.estudos.javacore.polimorfismo.dominio.Computador;
import src.estudos.javacore.polimorfismo.dominio.Produto;
import src.estudos.javacore.polimorfismo.dominio.Tomate;

public class ProdutoTest2 {
    public static void main(String[] args) {
        // criar um objeto computador usando uma variavel de refrencia do tipo produto
        // eu sei que a minha classe filha herdará todos os atributos da superclasse 
        // caso o objeto tenha algum atributo especifico ou metodo especifico dele, não poderá ser usado usando outra variavel de referencia, no caso a de produto
        Produto produto = new Computador("Corei7", 5000); 

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("--------------------");

        Produto produto2 = new Tomate("tomate americano", 7); 

        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());


    }
}
