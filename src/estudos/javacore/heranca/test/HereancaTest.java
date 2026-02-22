package src.estudos.javacore.heranca.test;

import src.estudos.javacore.heranca.dominio.Endereco;
import src.estudos.javacore.heranca.dominio.Funcionario;
import src.estudos.javacore.heranca.dominio.Pessoa;

public class HereancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();


        endereco.setRua("rua 3");
        endereco.setCep("038454");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("ichigo");
        pessoa.setCpf("08976367842");

        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("shipin");
        funcionario.setCpf("98485353");
        funcionario.setEndereco(endereco);

        funcionario.setSalario(8000);

        funcionario.imprime();
    
    }
}
