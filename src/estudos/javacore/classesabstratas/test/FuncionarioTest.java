package src.estudos.javacore.classesabstratas.test;

import src.estudos.javacore.classesabstratas.dominio.Desenvolvedor;
import src.estudos.javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("shipon", 9000);

        Gerente gerente = new Gerente("shipas", 12000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("zipino", 15000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
