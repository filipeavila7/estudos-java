package src.estudos.javaintermediario.generics.service;

import java.util.ArrayList;
import java.util.List;

import src.estudos.javaintermediario.generics.dominio.Barco;


public class BarcoRentavelService {
    private List<Barco> BarcosDisponiveis =  new ArrayList<>(List.of(new Barco("iate"), new Barco("lancha")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("buscando Barco disponivel....");
        Barco barco = BarcosDisponiveis.remove(0); // remover da lista e retorna
        System.out.println("alugando Barco" + barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(BarcosDisponiveis);
        return barco;
    }

    // devolver Barco alugado
    public void retornarBarcoAlugado(Barco barco){
        System.out.println("devolvendo Barco" + barco);
        BarcosDisponiveis.add(barco); // colocar de volta na lista
        System.out.println("Barcos disponivei para alugar");
        System.out.println(BarcosDisponiveis);
    
    
    }
}
