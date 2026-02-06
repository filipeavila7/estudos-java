package src.estudos.java;
// aula 04
public class Operadores {
    public static void main(String[] args) {
        // + - / % *
        // o resultado de 2 numeros inteiros sempre sera um numero inteiro
        float num1 = 10;
        float num2 = 20;
        float resultado = num1 / num2;

        System.out.println("valor: " + resultado);

        // % resto da divisao

        int resto = 29 % 2;
        System.out.println(resto);


        // operadores lógicos, sempre retornarão um valor boleano
        // maior e menor > < 
        // menor igual ou maior igual >= <=
        // == comparação
        // != diferente

        boolean isDezMaiorQueVinte = 10 > 20; // false
        boolean isDezMenorQueVinte = 10 < 20; // true
        boolean isDezIgualVinte = 10 == 20; // false
        boolean isDezIgualDez = 10 == 10; // true
        boolean isDezDiferenteQueVinte = 10 != 20; // true


        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteQueVinte);

        // operadores logicos and e or e not (&&) e (||) e (!)
        int idade =  35;
        float salario = 3500;
        boolean isDentroDalei = idade > 30 && salario >= 4612;
        System.out.println(isDentroDalei); 


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float vlrPlay = 5000;

        // true 
        boolean isPlaystation = valorTotalContaCorrente > vlrPlay || valorTotalContaPoupanca > vlrPlay;
        System.out.println(isPlaystation);

        if (isDentroDalei){
            System.out.println("ele esta dentro da lei");
        }else{
            System.out.println("ele não esta dentro");
        }


        // atribuição: += , -= , *=, /=, %=
        double bonus = 1800; 
        bonus += 1000; 
        bonus -= 1000; 
        bonus *= 1000; 
        bonus /= 1000; 
        bonus %= 1000; 

        System.out.println(bonus);


        int contador = 0;
        contador += 1;
        contador ++;
        
        System.out.println(contador); // 2   



    }
}
