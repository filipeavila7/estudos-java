package src.estudos.javacore.introducaoclasses.test;

import src.estudos.javacore.introducaoclasses.dominio.Estudante;

public class Estudante02Test {
    public static void main(String[] args) {
        // tipo e variavel     // novo objeto
       Estudante estudante =  new Estudante();

       estudante.nome = "teste";

       System.out.println(estudante.nome);
       System.out.println(estudante.idade); // 0
    }
}
