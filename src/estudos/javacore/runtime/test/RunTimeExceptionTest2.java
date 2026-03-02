package src.estudos.javacore.runtime.test;

public class RunTimeExceptionTest2 {
    // execeções unchecked --> opcional tratar ou não
    public static void main(String[] args) {
        divisao(2, 0);
    }
    // n é obrigatorio mas vc pode colocar uma assinatura no seu metodo avisando para quem for utilizar, que ele pode dar uma execeção
    private static int divisao (int a, int b) throws IllegalArgumentException{
        if (b == 0) {
            // tratar a exeção como do tipo argumento invalido
            throw new IllegalArgumentException("b não pode ser 0");
        }
            return a / b; // metodo acaba aqui, caso n tenha nehuma exceção
       
    }
}
