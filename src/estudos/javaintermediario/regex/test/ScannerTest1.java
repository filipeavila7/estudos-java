package src.estudos.javaintermediario.regex.test;

public class ScannerTest1 {
    public static void main(String[] args) {
        String texto = "shipin, shipas, shopun, true, 200";

        // criar um array com os textos quebrados pela virgula regex
        String [] nomes = texto.split(","); // O método split() divide a string sempre que encontra ,

        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
