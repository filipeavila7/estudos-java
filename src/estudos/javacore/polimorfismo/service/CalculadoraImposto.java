package src.estudos.javacore.polimorfismo.service;

import src.estudos.javacore.polimorfismo.dominio.Computador;
import src.estudos.javacore.polimorfismo.dominio.Produto;
import src.estudos.javacore.polimorfismo.dominio.Tomate;

// classe da regra de negocio, com metodos estaticos
public class CalculadoraImposto {
    // metodo estatico que recebe como argumento um objto do tipo Computador
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("relatorio de imposto computador:");
        // guardar valor em uma variavel para printar depois
        double imposto = computador.calcularImposto();

        // printar na tela
        System.out.println("computador:" + computador.getNome());
        System.out.println("valor:" + computador.getValor());
        System.out.println("valor com imposto:" + imposto);

    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("relatorio de imposto computador:");
        double imposto = tomate.calcularImposto();

        System.out.println("computador:" + tomate.getNome());
        System.out.println("valor:" + tomate.getValor());
        System.out.println("valor com imposto:" + imposto);

    }

    // METODO GENERICO
    // metodo que recebe de ambos, desaclopando o codigo torando o mais versatil
    // recebe uma variavel de refrencia do tipo produto
    public static void calcularImposto(Produto produto) {
        System.out.println("relatorio de imposto");

        double imposto = produto.calcularImposto();

        System.out.println("nome produto: " + produto.getNome());
        System.out.println("valor produto: " + produto.getValor());
        System.out.println("valor com imposto: " + imposto);

        // se o produto for uma instacia de tomate:
        // instace of serve para saber de qual instacia aquela variavel vaio ser, se caso for computador, ele vai ignorar esse bloco
        if (produto instanceof Tomate) {
            // eu sei que isso é um tomate (Tomate)
            // colocar um atributo que so o tomate tem / data de valiidade
            // digo que o produto é um tomate e declaro como variavel de refrencia tomate
            
            // uso o metodo
            // fazer cast rapidamente e ja usando o metodo
            // cast --> tranformar o produto em um tomate
            System.out.println(((Tomate) produto).getDataValidade());
        }

    }
}
