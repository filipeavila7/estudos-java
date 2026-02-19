package src.estudos.javacore.introducaometodos.test;

import src.estudos.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // utilizar metodo de setar o nome
        pessoa.setNome("shipin");
        pessoa.setIdade(19);
        
        // utilizar metodo get para pegar os atributo
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        
        
    }
    
}
