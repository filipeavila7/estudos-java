package src.estudos.javacore.heranca.test;

import src.estudos.javacore.heranca.dominio.Funcionario;

public class HereancaTest2 {
    public static void main(String[] args) {
        // o bloco de inicializacao estatico da super classe é inicializado assim que a jvm inicializar a classe filha
        // o bloco de inicializacao estatico da classe filha é executado
        // carrega os blocos de inicializacao da super classe e o seu construtor
        // carrega depois os blocos da classe filha e o cosntrutor
        Funcionario funcionario = new Funcionario("shipas", "85743295", 9000);
    }
}
