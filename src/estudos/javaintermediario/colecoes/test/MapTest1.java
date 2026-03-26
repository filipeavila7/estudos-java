package src.estudos.javaintermediario.colecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        // chave e valor
        // as chaves tem que ser unicas, se não ele subscreve com o ultimo valor que essa chave se relaciona
        Map<String, String> map = new HashMap<>();
        //Map<String, String> map = new LinkedHashMap()<>(); // mantem a ordem inserção
        map.put("teckado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "voce");
        map.putIfAbsent("vc", "voce2"); // so adciona se não existir


        System.out.println(map);
        // percorrer somentes as chaves
        for (String chave : map.keySet()) { 
            System.out.println(chave + " : " + map.get(chave)); // map.get(key) retrona o valor relacionado aquela chave
        }
        System.out.println("=-------=-------=");

        // percorrer os valore 
        for (String valor : map.values()) {
            System.out.println(valor);
        }


        System.out.println("=-------=-------=");
        
        // percorrer os 2
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
