package src.estudos.javacore.enumeracoes.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double CalcularDesconto(double valor){
        return valor * 0.1; // subscrever o metodo e retornar um descontto de 10%
    }
    }, CREDITO{
        @Override
        public double CalcularDesconto(double valor){
        return valor * 0.05; // desconto de 0%
    }
    };

    

    // metodo abstrato, serve apenas para ser subescrito
    public abstract double CalcularDesconto(double valor);
        
    
}
