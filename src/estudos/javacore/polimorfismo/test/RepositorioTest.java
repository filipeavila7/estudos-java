package src.estudos.javacore.polimorfismo.test;

import src.estudos.javacore.polimorfismo.repository.Repositorio;
import src.estudos.javacore.polimorfismo.service.RepositorioArquivo;
//import src.estudos.javacore.polimorfismo.service.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        // declarar tipo da interface pois ambos herdam ela, tipo mais generico
        Repositorio repositorio = new RepositorioArquivo();

        repositorio.salvar();
    }
}
