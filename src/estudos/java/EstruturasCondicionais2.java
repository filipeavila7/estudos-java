package src.estudos.java;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {
        // idade menor que 15 -> infantil
        // idade maior que 15 e menor que 18 -> juvenil
        // idade maior que 18 -> adulto

        int idade = 18;

        if (idade < 15) {
            System.out.println("infantil");
        }else if(idade >= 15 && idade < 18){
            System.out.println("juvenil");
        }else if (idade >= 18) {
            System.out.println("maior de idade");
        }
    }
}
