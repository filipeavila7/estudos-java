package src.estudos.javaintermediario.generics.test;

import src.estudos.javaintermediario.generics.dominio.Carro;
import src.estudos.javaintermediario.generics.service.CarroRetavelService;

public class ClasseGenericaTest1 {
    public static void main(String[] args) {
        CarroRetavelService carroRetavelService = new CarroRetavelService();


        Carro carro = carroRetavelService.buscarCarroDisponivel();
        System.out.println("usando carro por 1 mes...");
        carroRetavelService.retornarCarroAlugado(carro);
    }
}
