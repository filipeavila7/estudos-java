package src.estudos.javacore.polimorfismo.service;

import src.estudos.javacore.polimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em um banco de dados");
        
    }
}
