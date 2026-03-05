package src.estudos.javaintermediario.strings.test;

public class StringTest2 {
    public static void main(String[] args) {
        String nome = " ichigo";
        
        System.out.println(nome.charAt(3));
        System.out.println(nome.length());
        System.out.println(nome.replace("i", "p")); // trocar uma letra por outra
        System.out.println(nome.toUpperCase());
        System.out.println(nome.substring(0, 2));
        System.out.println(nome.substring(2, nome.length()));
        System.out.println(nome.trim());

    }
}
