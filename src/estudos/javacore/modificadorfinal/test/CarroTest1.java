package src.estudos.javacore.modificadorfinal.test;

import src.estudos.javacore.modificadorfinal.dominio.Carro;
import src.estudos.javacore.modificadorfinal.dominio.Comprador;
import src.estudos.javacore.modificadorfinal.dominio.Ferrari;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        // os valores dos atributos de uma variavede referencia constante, podem ser alterados
        carro.COMPRADOR.setNome("shipin");

        System.out.println(carro.COMPRADOR);

        Comprador comprador2 = new Comprador();

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("ferrari");
        ferrari.imprime();

        
    }
}
