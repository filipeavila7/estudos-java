package src.estudos.javaintermediario.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// file
// file writer
// file reader
// buffedwriter
// bufferedreader


public class FileWriterTest1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\shipin dovu\\Documents\\teste\\src\\estudos\\arquivo\\teste.py");
        // append true --> n apaga tudo do arquivo e subscreve
        try (FileWriter fw = new FileWriter(file, true)) { //ja cria a file caso ela não exista
            fw.write("print(\"ola mundo\")\nprint(\"ola mundo\")");  // escrever na file
            
            fw.flush(); // garantir que tenha escrito tudo depoois de fechar
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
