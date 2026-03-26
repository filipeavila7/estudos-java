package src.estudos.javaintermediario.colecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;



public class NavigableMapTest1 {
    public static void main(String[] args) {
        NavigableMap<String, String> map =  new TreeMap<>();

        map.put("E", "lestra: E");
        map.put("B", "lestra: B");
        map.put("C", "lestra: C");
        map.put("D", "lestra: D");
        map.put("F", "lestra: F");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // pegar todo mundo que vem antes do c, incluse o c pq ta true
        System.out.println(map.headMap("C", true));

       



    }
}
