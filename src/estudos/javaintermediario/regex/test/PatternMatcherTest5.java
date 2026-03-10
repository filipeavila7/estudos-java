package src.estudos.javaintermediario.regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest5 {
    public static void main(String[] args) {
        // validação ou busca com base em meta caracteres
        // patter --> padrão
        // matcher --> encontra aquele padrão
        // \d --> retorna todos os digitos
        // \D --> retorna tudo oq não for digito
        // \s --> todos os espaços em branco
        // \S --> todos os caracteres que não estaõ no espaço em branco
        // \w --> a-ZA-Z, digitos _
        // \W --> tudo oq não for incluso no \w
        // [] --> range de caracteres [a-zA-Z] 
        // String regex = "[a-zA-Z]";
        // ? zero ou uma
        // * ou mais 
        //  + uma ou mais 
        // {n,m} de n ate m
        // () agupamento
        // | o(v|c)o --> ovo ou oco
        // $ fim da linha 
        // . entre o numero 1.3 


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";

        String texto2 = "shipin@email.com.br, 123shipas@gmail.com, @!shipi@hotmail.com, teste@gmail.com";
        // as expressões regulares precisam ser compiladas
        Pattern pattern = Pattern.compile(regex); // procurar pelo padrao --> ab
        
        Matcher matcher = pattern.matcher(texto2); // procurar padrão no texto

        System.out.println(Arrays.toString(texto2.split(",")));

        System.out.println("@!shipi@hotmail.com".matches(regex));  

        System.out.println("texto: " + texto2);
        System.out.println("indice:0123456789 ");
        System.out.println("regex: " + regex);
        System.out.println("posicoes encotradas");
        
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }


        int numeroHexa = 0X59F86A; // ox para numeros hexadecimal, a letra nãp pode pasar de F
        System.out.println(numeroHexa);
    }
}
