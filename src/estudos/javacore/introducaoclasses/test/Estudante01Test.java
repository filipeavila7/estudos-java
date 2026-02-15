package src.estudos.javacore.introducaoclasses.test;

import src.estudos.javacore.introducaoclasses.dominio.Estudante;

public class Estudante01Test {
 public static void main(String[] args) {
    // importar a classe estudante e criar um novo objeto a partir dela
    Estudante estudante = new Estudante(); // estudante é uma variável do tipo reference
    // só possso acessar os atributos do objeto, pela a minha variavel de referencia estudante
    // atribuir valor aos atributos do objeto
    estudante.nome = "shipin";
    estudante.idade = 18;
    estudante.sexo = 'M';

    System.out.println(estudante.nome);
    System.out.println(estudante.idade);
    System.out.println(estudante.sexo);

    
 }
}
