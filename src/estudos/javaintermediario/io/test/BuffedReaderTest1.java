package src.estudos.javaintermediario.io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BuffedReaderTest1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\shipin dovu\\Documents\\teste\\src\\estudos\\arquivo\\teste.py");

        try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)) {
                    String linha;
                    
                    while ((linha = br.readLine()) != null) {
                        System.out.println(linha);
                    }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
