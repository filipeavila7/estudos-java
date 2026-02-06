package src.estudos.java;
// aula 05 
public class EstruturasCondicionais {
    public static void main(String[] args) {
        int num = 9;
        
        if (num % 2 == 0) {
            System.out.println("é par");
        }else{
            System.out.println("é impar");
        }

        int valor = 5;

        if (valor >= 7) {
            System.out.println("aprovado");
        }else if(valor <= 5){
            System.out.println("reprovado");

        }else if(valor == 6){
            System.out.println("recuperação");
        }else{
            System.out.println("nota inválida");
        }
    }


    

   
    
}
