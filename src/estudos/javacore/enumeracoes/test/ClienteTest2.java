package src.estudos.javacore.enumeracoes.test;

import src.estudos.javacore.enumeracoes.dominio.Cliente2;
import src.estudos.javacore.enumeracoes.dominio.TipoPagamento;
import src.estudos.javacore.enumeracoes.dominio.TipoCliente;

public class ClienteTest2 {
    public static void main(String[] args) {
        
        Cliente2 cliente = new Cliente2("shipin", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(TipoPagamento.DEBITO.CalcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.CalcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        
        //Ele busca um TipoCliente com base no valor do atributo nomeRelatorio.
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("pessoa fisica");
        System.out.println(tipoCliente2);
    }
}
