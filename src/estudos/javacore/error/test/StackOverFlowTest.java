package src.estudos.javacore.error.test;

public class StackOverFlowTest {
    public static void main(String[] args) {
        recusvidade();
    }

    // causar um erro de estouro de memeoria 
    // erros não podem ser recuperados, eles param a execução do programa
    public static void recusvidade(){
        recusvidade();
    }
}
