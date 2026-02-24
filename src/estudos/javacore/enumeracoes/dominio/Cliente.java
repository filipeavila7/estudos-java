package src.estudos.javacore.enumeracoes.dominio;

public class Cliente {
    private String nome;
    // tipo cliente é do tipo Tipoliente que é uma classe do tipo enum, onde os atributos sao do tipo enum
    private TipoCliente tipoCliente;


    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    


    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", tipoCliente=" + tipoCliente + "]";
    }




    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }


    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    
    
    



    
    

    
}
