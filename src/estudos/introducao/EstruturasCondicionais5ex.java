package src.estudos.introducao;

public class EstruturasCondicionais5ex {
    public static void main(String[] args) {
        // dados os valores 1 a 7, imprima sw é dia útil ou final de swmana
        // considerando 1 como domingo
        int dia = 1;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
                
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            
            default:
                System.out.println("invalido");
                break;
        }
    }
}
