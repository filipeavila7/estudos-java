package src.estudos.introducao;
// aula 02, tipos primitivos
public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, short, long, boolean

        // declarar o tipo e o nome da variavel
        int num1 = 10;
        int num2 = 20;
        int resultado = num1 + num2;
        long numeroGrande = 100000l;
        double salarioDouble = 2000;
        float salarioFloat = 2500.8f; // f para entender que é float e n double ou d para double
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 87;
        int forcarValor = (int)1000000000l;

        // string
        String nome = "shipin";

        // imprimir o resultado
        System.out.println("o resultado é: "+ resultado);
        System.out.println(idadeByte);
        System.out.println(caracter);
        System.out.println(forcarValor);
        System.out.println(nome);
    }
}


