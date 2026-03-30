package src.estudos.javaintermediario.generics.service;

import java.util.List;


public class RentavelService<T> {
    private List<T> objetosDisponiveis;

    

    public RentavelService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetosDisponivel(){
        System.out.println("buscando objeto disponivel....");
        T objeto = objetosDisponiveis.remove(0); // remover da lista e retorna oque removeu
        System.out.println("alugando " + objeto);
        System.out.println("disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
        return objeto;
    }

    // devolver carro alugado
    public void retornarObjetoAlugado(T objeto){
        System.out.println("devolvendo " + objeto);
        objetosDisponiveis.add(objeto); // colocar de volta na lista
        System.out.println("disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
    
    
    }
}
