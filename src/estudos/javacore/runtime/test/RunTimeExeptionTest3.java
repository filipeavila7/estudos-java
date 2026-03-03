package src.estudos.javacore.runtime.test;

public class RunTimeExeptionTest3 {
    public static void main(String[] args) {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            
        } finally{ // sempre vai executar, tendo execao ou não, usado quando prxisa fechar algum recurso depois que usou
            System.out.println("fechando recurso");
        }
    }
}

