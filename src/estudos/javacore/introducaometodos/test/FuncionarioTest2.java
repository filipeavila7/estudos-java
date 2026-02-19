package src.estudos.javacore.introducaometodos.test;

import src.estudos.javacore.introducaometodos.dominio.Funcionario2;

public class FuncionarioTest2 {
    public static void main(String[] args) {
        Funcionario2 funcionario = new Funcionario2();


        funcionario.setNome("shipin");
        funcionario.setIdade(19);
        funcionario.setSalario(new double[] {300, 5443, 5435});
        funcionario.imprimirDados();
        funcionario.mediaSalario();
        System.out.println(funcionario.getMedia());
    }
}
