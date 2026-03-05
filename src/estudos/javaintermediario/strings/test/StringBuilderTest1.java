package src.estudos.javaintermediario.strings.test;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        String nome = "shipin";
        nome.concat("patock");

        System.out.println(nome);

        // não é imutavel como a String
        StringBuilder sb = new StringBuilder("shipin");
        sb.append(" patock").append(" 1"); // adcionar valores
        sb.reverse();
        sb.delete(0, 5);
        System.out.println(sb);
    }
}
