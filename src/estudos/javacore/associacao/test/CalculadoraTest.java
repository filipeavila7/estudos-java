package src.estudos.javacore.associacao.test;

import java.util.Scanner;

import src.estudos.javacore.associacao.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner entrada = new Scanner(System.in).useLocale(java.util.Locale.US);

        while (true) {
            System.out.println("");
            System.out.println("o======== CALCULADORA ========o");
            System.out.println("Digite 1 para somar.");
            System.out.println("Digite 2 para subtrair.");
            System.out.println("digite 3 para multiplicar.");
            System.out.println("Digite 4 para dividir.");
            System.out.println("Digite 5 para sair.");
            System.out.print("Digite: ");
            int opcao = entrada.nextInt();

            if (opcao == 5) {
                break;
            }

            switch (opcao) {
                case 1:
                    while (true) {
                        System.out.println("");
                        System.out.println("o======== SOMA ========o");

                        System.out.print("Digite um número: ");
                        double num1 = entrada.nextDouble();

                        System.out.print("Digite outro número: ");
                        double num2 = entrada.nextDouble();

                        calculadora.somaDoisNumeros(num1, num2);
                        System.out.println("");
                        System.out.println("Digite 1 para continuar.");
                        System.out.println("Digite qualquer numero para voltar.");
                        System.out.print("Digite: ");
                        int opcao2 = entrada.nextInt();

                        if (opcao2 == 1) {
                            continue;
                        }else {
                            break;
                        }
                        
                    }break;

                    case 2:
                        while (true) {
                        System.out.println("");
                        System.out.println("o======== SUBTRAÇÃO ========o");

                        System.out.print("Digite um número: ");
                        double num1 = entrada.nextDouble();

                        System.out.print("Digite outro número: ");
                        double num2 = entrada.nextDouble();

                        calculadora.subDoisNumeros(num1, num2);
                        System.out.println("");
                        System.out.println("Digite 1 para continuar.");
                        System.out.println("Digite qualquer numero para voltar.");
                        System.out.print("Digite: ");
                        int opcao2 = entrada.nextInt();

                        if (opcao2 == 1) {
                            continue;
                        }else {
                            break;
                        }
                        
                    }break;
                    case 3:
                        while (true) {
                        System.out.println("");
                        System.out.println("o======== MULTIPLICAÇÃO ========o");

                        System.out.print("Digite um número: ");
                        double num1 = entrada.nextDouble();

                        System.out.print("Digite outro número: ");
                        double num2 = entrada.nextDouble();

                        calculadora.MultiDoisNumeros(num1, num2);
                        System.out.println("");
                        System.out.println("Digite 1 para continuar.");
                        System.out.println("Digite qualquer numero para voltar.");
                        System.out.print("Digite: ");
                        int opcao2 = entrada.nextInt();

                        if (opcao2 == 1) {
                            continue;
                        }else {
                            break;
                        }
                        
                    }break;
                
                 
                    case 4:
                        while (true) {
                        System.out.println("");
                        System.out.println("o======== DIVISÃO ========o");

                        System.out.print("Digite um número: ");
                        double num1 = entrada.nextDouble();

                        System.out.print("Digite outro número: ");
                        double num2 = entrada.nextDouble();

                        calculadora.divDoisNumeros(num1, num2);
                        System.out.println("");
                        System.out.println("Digite 1 para continuar.");
                        System.out.println("Digite qualquer numero para voltar.");
                        System.out.print("Digite: ");
                        int opcao2 = entrada.nextInt();

                        if (opcao2 == 1) {
                            continue;
                        }else {
                            break;
                        }
                        
                    }break;

                    default:
                        System.out.println("Digite uma opção válida");

                    
                    
                    

            }

        }

    }
}
