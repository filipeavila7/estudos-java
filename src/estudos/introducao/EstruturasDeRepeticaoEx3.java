package src.estudos.introducao;

public class EstruturasDeRepeticaoEx3 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
        // a condição é que o valor da parcela tem que ser >= 1000

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            //vai dividindo ate valorTotal / 30 mil
            double valorParcela = valorTotal / parcela;
            // mas mostrara somente o resultado da divisao que for maior que mii
            if (valorParcela < 1000) {
                break; // o continue ignora tudo que tem em baixo e o loop volta
            }
            System.out.println("parcela: " + parcela + " R$ " + valorParcela);
            }
        }
    }

