package src.estudos.javaintermediario.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest2 {
    public static void main(String[] args) {
        // validação ou busca com base em meta caracteres
        // patter --> padrão
        // matcher --> encontra aquele padrão
        // \d --> retorna todos os digitos
        // \D --> retorna tudo oq não for digito
        // \s --> todos os espaços em branco
        // \S --> todos os caracteres que não estaõ no espaço em branco
        // \w --> a-ZA-Z, digitos _
        // |W --> tudo oq não for incluso no \w
        String regex = "\\W";
        String texto = "abasfg@d#baaab";

        String texto2 = "a47hgu#t_593rt";
        // as expressões regulares precisam ser compiladas
        Pattern pattern = Pattern.compile(regex); // procurar pelo padrao --> ab
        
        Matcher matcher = pattern.matcher(texto2); // procurar padrão no texto


        System.out.println("texto: " + texto2);
        System.out.println("indice:0123456789 ");
        System.out.println("regex: " + regex);
        System.out.println("posicoes encotradas");
        
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
