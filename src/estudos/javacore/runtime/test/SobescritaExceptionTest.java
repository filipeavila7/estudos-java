package src.estudos.javacore.runtime.test;

import src.estudos.javacore.runtime.dominio.Funcionario;
import src.estudos.javacore.runtime.dominio.Pessoa;

public class SobescritaExceptionTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        // caso vc subescreva um metodo que lance exceções, não é obrigaao a tratr elas
        funcionario.salvar();

        
    }
}
