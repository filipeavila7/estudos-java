package src.estudos.javacore.introducaoclasses.test;

import src.estudos.javacore.introducaoclasses.dominio.Professor;

public class Professor01Test {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Zipin";
        professor.idade = 25;
        professor.sexo = 'M';
    

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
