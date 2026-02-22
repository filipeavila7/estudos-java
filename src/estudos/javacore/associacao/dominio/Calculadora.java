package src.estudos.javacore.associacao.dominio;

public class Calculadora {
    private double num1;
    private double num2;


    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void somaDoisNumeros(double num1 , double num2){
        this.num1 = num1;
        this.num2 = num1;   

        double resultado = num1 + num2;

        System.out.println("A soma dos numeros é: "+ resultado);
    }

    public void subDoisNumeros(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;

        double resultado = num1 - num2;

        System.out.println("A subtração dos numeros é: "+ resultado);

    }
    
    public void MultiDoisNumeros(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;

        double resultado = num1 * num2;

        System.out.println("A multiplicação dos numeros é: "+ resultado);

    }

    public void divDoisNumeros(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;

        double resultado = num1 / num2;
        if (num2 == 0) {
            System.out.println("Impossível dividir por 0");
            return;
        }

        System.out.println("A divisão dos numeros é: "+ resultado);

    }

    
}
