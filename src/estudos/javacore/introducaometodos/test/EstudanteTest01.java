package src.estudos.javacore.introducaometodos.test;

import src.estudos.javacore.introducaometodos.dominio.Estudante;
import src.estudos.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "shipin";
        estudante.idade = 18;
        estudante.sexo = 'M';

        estudante2.nome = "shipino";
        estudante2.idade = 48;
        estudante2.sexo = 'M';

        // passa os objetos como parametro do metodo, e usa o metodo imprimir do objeto impressora
        impressora.imprime(estudante);
        impressora.imprime(estudante2);

        
    }
}
