package src.estudos.javacore.enumeracoes.dominio;

public class Cliente2 {

    // tb pode usar uma classe enum dentro da classe principal
    

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente2(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente2 [nome=" + nome + ", tipoCliente=" + tipoCliente + ", tipoPagamento=" +  tipoPagamento +" tipoClienteInt ]" + tipoCliente.getNomeRelatorio();
    }


    
    




    

    
    

    
}
