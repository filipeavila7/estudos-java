package src.estudos.javaintermediario.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BuffedWriterTest1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\shipin dovu\\Documents\\teste\\src\\estudos\\arquivo\\teste.py");
        // append true --> n apaga tudo do arquivo e subscreve
        try (FileWriter fw = new FileWriter(file, true);
                // colocar dentro de um buffer para melhorar o desempenho
                BufferedWriter br = new BufferedWriter(fw)) { // ja cria a file caso ela não exista
            br.write("print(\"ola mundo\")\nprint(\"ola mundo\")"); // escrever na file
            br.newLine();
            br.flush(); // garantir que tenha escrito tudo depoois de fechar
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}