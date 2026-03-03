package src.estudos.javacore.runtime.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import src.estudos.javacore.runtime.dominio.Leitor1;
import src.estudos.javacore.runtime.dominio.Leitor2;

public class TryWithResource {
    public static void main(String[] args) {
        lerArquivo();
        lerArquivoFeio();

        lerArquivoaFinal();

    }

    // try with resources permite criar um try que instacia o objeto que herda o
    // closeable, o proprio java fecha sem usar finally se a classe implementar o closeable
    // permite tb criar sem finally ou catch porem te obriga a usar um throws
    public static void lerArquivo() /* throws IOException */ {
        try (Leitor1 leitor1 = new Leitor1(); // retorna o metodo close() subescrito la da classe, fechando na ordem inversa
                Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivoFeio() {
        Reader reader = null; // reader é do tipo Readable, Closeable, ou seja ele precisa de um finaly para fechar sempre que for usado
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\shipin dovu\\Documents\\teste\\src\\estudos\\arquivo\\teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {// como o finally roda de qualquer jeito, tem chance de não passar pelo try e o reader vim como null
                    reader.close(); // cloese é do tipo checked
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // ler arquivo usando try com resources
    public static void lerArquivoaFinal(){
        // ja instacia dentro do try, não precisa de finally pra fechar pois com isso ja fecha automaticamente
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\shipin dovu\\Documents\\teste\\src\\estudos\\arquivo\\teste.txt"))) {
            System.out.println(reader.readLine()); // metodo para ler o arquivo que retorna uma string, por isso dentro do sout
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
