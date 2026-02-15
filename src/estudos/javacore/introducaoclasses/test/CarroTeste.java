package src.estudos.javacore.introducaoclasses.test;

import src.estudos.javacore.introducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        // criar 2 objetos a partir da mesma classe
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        // atribuir valor aos atributos dos 2 objetos 
        carro.nome = "Peugeot";
        carro.modelo = "206";
        carro.ano = 2013;

        carro2.nome = "BMW";
        carro2.modelo = "X4";
        carro2.ano = 2020;

       // carro = carro2; podemos tb igualar as variaveis de referencia para os valores serem iguais 


        // imprimir os valores dos objetos
        System.out.println("Nome: " + carro.nome + ", Modelo: " + carro.modelo + ", Ano: " + carro.ano);
        System.out.println("Nome: " + carro2.nome + ", Modelo: " + carro2.modelo + ", Ano: " + carro2.ano);

    }
}