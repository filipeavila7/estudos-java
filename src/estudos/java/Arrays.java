package src.estudos.java;
// aula 07 
public class Arrays {
    public static void main(String[] args) {
        // definir que o array tera um tamanho de 3 espaços usando new como se criasse um objeto
        int[] idades = new int[3]; // variavel do tipo reference, somente tipos reference podem ser nulos
        idades[0] = 21; // atribuir valor em cada indice    
        idades[1] = 15;
        idades[2] = 12;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }

}
