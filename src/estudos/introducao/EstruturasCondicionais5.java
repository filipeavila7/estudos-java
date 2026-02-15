package src.estudos.introducao;

public class EstruturasCondicionais5 {
    public static void main(String[] args) {
        // imprima o dia da semana considerando 1 como domingo

        int dia = 5;      
        // tipos que vc pode por no switch -> char, int, byte, short, enum, string 

        switch (dia) {
            case 1:   
                System.out.println("Domingo");
                break; // breake pra quebrar a sequencia
            case 2:   
                System.out.println("Segunda");
                break;
            case 3:   
                System.out.println("Terça");
                break;
            case 4:   
                System.out.println("Quarta");
                break;
            case 5:   
                System.out.println("Quinta");
                break;
            case 6:   
                System.out.println("Sexta");
                break;
            case 7:   
                System.out.println("Sábado");
                break;
            default:
                // deaflt caso a opção seja invalida no caase
                System.out.println("opção invalida");
                break;
        
           
        }

        char sx = 'M';
        
        switch (sx) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':                      
                System.out.println("Feminino");
                break;
        
            default:
                System.out.println("opção invalida");
                break;
        }
    }
}
