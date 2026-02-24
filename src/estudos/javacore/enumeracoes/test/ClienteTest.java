package src.estudos.javacore.enumeracoes.test;

import src.estudos.javacore.enumeracoes.dominio.Cliente;
import src.estudos.javacore.enumeracoes.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        // tipo enum do TipoCliente
        Cliente cliente1 = new Cliente("shipin", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("zipin", TipoCliente.PESSOA_JURIDICA);
        



        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
