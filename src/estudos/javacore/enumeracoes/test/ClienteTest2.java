package src.estudos.javacore.enumeracoes.test;

import src.estudos.javacore.enumeracoes.dominio.Cliente2;
import src.estudos.javacore.enumeracoes.dominio.Cliente2.TipoPagamento;
import src.estudos.javacore.enumeracoes.dominio.TipoCliente;

public class ClienteTest2 {
    public static void main(String[] args) {
        
        Cliente2 cliente = new Cliente2("shipin", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
    }
}
