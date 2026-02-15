package src.estudos.introducao;

public class EstruturasCondicionaisex {
    public static void main(String[] args) {
        double salarioAnual =  50458;


        if (salarioAnual <= 34712){
            System.out.println(salarioAnual * 1.097);
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            System.out.println(salarioAnual * 1.3735);
        } else{
            System.out.println(salarioAnual * 1.495);
        }
    }
}
