package src.estudos.javacore.introducaometodos.test;

import src.estudos.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        

        estudante.nome = "shipin";
        estudante.idade = 18;
        estudante.sexo = 'M';

        estudante2.nome = "shipino";
        estudante2.idade = 48;
        estudante2.sexo = 'M';

        // imprime todos os atributos do objeto, usando esse metodo
        estudante.imprimir();
    }
}
