package src.estudos.javacore.enumeracoes.dominio;

// classe especial do tipo enumeração
// os atributos vao ser do tipo TipoCliente
// força acriar o objeto somente com esses 2 valores no atributo de tipo
// use enum quando vc tem uma quantidade de valores limitadas para um atributo de um objeto
public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    // crir um atributo parruma classe enum, chamado valor e colocar esses valores nos atributos de enumm
    public final int VALOR;

    // construtor
    TipoCliente(int valor){
        this.VALOR = valor;
    }


    



}
