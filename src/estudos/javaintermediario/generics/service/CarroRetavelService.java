package src.estudos.javaintermediario.generics.service;

import java.util.ArrayList;
import java.util.List;

import src.estudos.javaintermediario.generics.dominio.Carro;

public class CarroRetavelService {
    private List<Carro> carrosDisponiveis =  new ArrayList<>(List.of(new Carro("bmw"), new Carro("ferrari")));

    public Carro buscarCarroDisponivel(){
        System.out.println("buscando carro disponivel....");
        Carro carro = carrosDisponiveis.remove(0); // remover da lista e retorna
        System.out.println("alugando carro" + carro);
        System.out.println("carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    // devolver carro alugado
    public void retornarCarroAlugado(Carro carro){
        System.out.println("devolvendo carro" + carro);
        carrosDisponiveis.add(carro); // colocar de volta na lista
        System.out.println("carros disponivei para alugar");
        System.out.println(carrosDisponiveis);
    
    
    }
}
