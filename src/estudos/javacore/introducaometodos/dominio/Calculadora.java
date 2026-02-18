package src.estudos.javacore.introducaometodos.dominio;

public class Calculadora {
    // void sigfica que o metodo não retornará nada
    // metodo que soma 2 valores, precisando de 2 parametros do tipo int
    public void somaDoisNumeros(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void subDoisNumeros(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public void multiDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void divDoisNumeros(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    // criar um metodo que retorne algo, colocando um tipo inves de void
    public double divideDoisNumeros(double num1, double num2) {
        // caso tente dividir por 0, o return pode funcionar quase como um break
        if (num2 == 0) {
            return 0;

        }
        System.out.println("imposivel dividir por zero");
        return num1 / num2;
    }

    public void Dividir2numeros(double num1, double num2) {
        if (num2 == 0) {
            // void não retorna nada, apenas saídaa
            System.out.println("imposivel dividir por zero");
            return; // é o break dos metodos voids, que não retornam nada
        } else {
            System.out.println(num1 / num2);
        }
    }


    public void alteraDoisnumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;

        System.out.println("dentro do altera 2 numeros");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    // receber um array de numeros e somar todos os valores
    public void somaArray(int[] numeros){
        int soma = 0;

        for (int num : numeros) {
            soma += num;
           
        }
        System.out.println(soma);
    }

    // transforma em um array
    public void somaVarArgs(int ...numeros){
        int soma = 0;

        for (int num : numeros) {
            soma += num;
           
        }
        System.out.println(soma);
    }
}
