package src.estudos.javacore.introducaometodos.dominio;

public class Calculadora {
    // void sigfica que o metodo não retornará nada
    // metodo que soma 2 valores, precisando de 2 parametros do tipo int
    public void somaDoisNumeros(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public void subDoisNumeros(int num1, int num2){
        System.out.println(num1 - num2);
    }
    public void multiDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public void divDoisNumeros(int num1, int num2){
        System.out.println(num1 / num2);
    }

    // criar um metodo que retorne algo, colocando um tipo inves de void
    public double divideDoisNumeros(double num1, double num2){
        return num1 / num2;
    }
}
