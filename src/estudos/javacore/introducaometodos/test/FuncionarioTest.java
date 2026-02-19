package src.estudos.javacore.introducaometodos.test;

import src.estudos.javacore.introducaometodos.dominio.Funcionario;
import src.estudos.javacore.introducaometodos.dominio.FuncionarioImprimir;

public class FuncionarioTest {
    public static void main(String[] args) {
        // instaciar um novo usuario
        Funcionario funcionario = new Funcionario();
        // instaciar um objeto de imprimir para usar os metodos relativos a ele
        FuncionarioImprimir imprimir = new FuncionarioImprimir();      

        // atribuir valores
        funcionario.nome = "Filipe";
        funcionario.idade = 18;
        funcionario.salario = new double[] {8000, 9000, 7000.60};

        // usar o metodo do objeto uimprimir, passando como parametro o novo ususario criado
        imprimir.imprimirDados(funcionario);
        imprimir.mediaSalario(funcionario);
    }

        
}
