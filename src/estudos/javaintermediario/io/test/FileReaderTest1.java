package src.estudos.javaintermediario.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\shipin dovu\\Documents\\teste\\src\\estudos\\arquivo\\teste.py");
        
        try(FileReader fr = new FileReader(file)) {
            //char [] in = new char[30];
            // fr.read(in);
            // for (char c : in) {
            //     System.out.println(c);
            // }

            int i;
            while ((i=fr.read()) != -1) { // -1 significa que ele chegou no final da leitura do arquivo
                System.out.print((char)i); // ele retorna int, faça um cast para retornar em char e ver o que esta escrito
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
