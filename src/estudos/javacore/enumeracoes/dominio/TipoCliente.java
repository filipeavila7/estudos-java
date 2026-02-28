package src.estudos.javacore.enumeracoes.dominio;

// classe especial do tipo enumeração
// os atributos vao ser do tipo TipoCliente
// força acriar o objeto somente com esses 2 valores no atributo de tipo
// use enum quando vc tem uma quantidade de valores limitadas para um atributo de um objeto
public enum TipoCliente {
    PESSOA_FISICA(1, "pessoa fisica"),
    PESSOA_JURIDICA(2, "pessoa juridica");

    // crir um atributo para uma classe enum, chamado valor e colocar esses valores
    // nos atributos de enumm
    private int valor;
    private String nomeRelatorio;

    /**
     * Retorna um TipoCliente com base no nomeRelatorio informado.
     *
     * O método percorre todos os valores do enum usando values()
     * e compara o atributo nomeRelatorio de cada constante com o
     * valor recebido por parâmetro.
     *
     * Se encontrar um nome igual, retorna o respectivo TipoCliente.
     * Caso não encontre nenhum correspondente, retorna null.
     *
     * Exemplo:
     * TipoCliente.tipoClientePorNomeRelatorio("pessoa fisica")
     * retorna: PESSOA_FISICA
     */
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    // construtor privado pois ja define os valores na propria classe
    private TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

}
