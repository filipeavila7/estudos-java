package src.estudos.javacore.heranca.test;

import src.estudos.javacore.heranca.dominio.Endereco;
import src.estudos.javacore.heranca.dominio.Funcionario;
import src.estudos.javacore.heranca.dominio.Pessoa;

public class HereancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();


        endereco.setRua("rua 3");
        endereco.setCep("038454");

        Pessoa pessoa = new Pessoa("ichigo", "9485495");

        

       

        Funcionario funcionario = new Funcionario("shipin", "38595696",  7000);

        

        funcionario.imprime();
    
    }
}
