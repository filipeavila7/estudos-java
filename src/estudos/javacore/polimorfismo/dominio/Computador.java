package src.estudos.javacore.polimorfismo.dominio;

public class Computador extends Produto {

    public static final double IMPOSTO_POR_CENTO = 1.2;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    // subscrever o metodo da interface
    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }
    


    


    
}
