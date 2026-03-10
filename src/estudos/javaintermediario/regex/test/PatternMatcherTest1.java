package src.estudos.javaintermediario.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest1 {
    public static void main(String[] args) {
        // validação ou busca com base em meta caracteres
        // patter --> padrão
        // matcher --> encontra aquele padrão
        String regex = "aba";
        String texto = "abasfgdsabaaab";
        String texto2 = "abababa";
        // as expressões regulares precisam ser compiladas
        Pattern pattern = Pattern.compile(regex); // procurar pelo padrao --> ab
        
        Matcher matcher = pattern.matcher(texto2); // procurar padrão nno texto


        System.out.println("texto: " + texto2);
        System.out.println("indice:0123456789 ");
        System.out.println("regex: " + regex);
        System.out.println("posicoes encotradas");
        
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
