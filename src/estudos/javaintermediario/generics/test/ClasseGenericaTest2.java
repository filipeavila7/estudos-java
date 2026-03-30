package src.estudos.javaintermediario.generics.test;

import java.util.ArrayList;
import java.util.List;

import src.estudos.javaintermediario.generics.dominio.Barco;
import src.estudos.javaintermediario.generics.dominio.Carro;
import src.estudos.javaintermediario.generics.service.RentavelService;

public class ClasseGenericaTest2 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(List.of(new Carro("bmw"), new Carro("ferrari")));
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("iate"), new Barco("lancha")));

        // classe generica 
        RentavelService<Carro> rentavelService = new RentavelService<>(carros);
        Carro carro = rentavelService.buscarObjetosDisponivel();
        rentavelService.retornarObjetoAlugado(carro);

        System.out.println("===================");

        RentavelService<Barco> rentavelService2 = new RentavelService<>(barcos);
        Barco barco = rentavelService2.buscarObjetosDisponivel();
        rentavelService2.retornarObjetoAlugado(barco);
    }
}
