package src.estudos.javacore.associacao.test;

import src.estudos.javacore.associacao.dominio.Escola;
import src.estudos.javacore.associacao.dominio.Professor;

public class EscolaTest1 {
    public static void main(String[] args) {

        Professor professor = new Professor("shipino");
        Professor professor2 = new Professor("shipino3");
        // criar um array com os objetos, pos o argumento pede um array de professores
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("ship escola", professores );

        escola.imprime();
        
}
}