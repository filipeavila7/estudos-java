package src.estudos.javaintermediario.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest1 {
    public static void main(String[] args) {

        Queue<String> fila = new PriorityQueue<>();

        fila.add("A");
        fila.add("B");
        fila.add("D");
        fila.add("x");
        fila.add("W");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }




    }
}
