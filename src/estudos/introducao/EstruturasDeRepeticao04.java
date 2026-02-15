package src.estudos.introducao;

public class EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int)valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            // caso o valor seja menor que mil, ele vai ignorar o sout e vai rodar o loop ate essa condição for falsa
            if (valorParcela < 1000) {
                continue; 
            }
            System.out.println("parcela: " + parcela + " R$ " + valorParcela);
        }
    }
}
