package src.estudos.javaintermediario.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        // criar caminho da pasta
        File fileDiretorio = new File("C:\\Users\\shipin dovu\\Documents\\teste\\src\\estudos\\arquivo\\pasta");

        // criar pasta
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);

        // criar um arquivo dentro da nova pasta passando a referencia da pasta no construtor
        File fileArquivo = new File(fileDiretorio, "arquivo.js");

        try {
            boolean isFileCreated = fileArquivo.createNewFile();
            System.out.println(isFileCreated);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        // renomear file
        File fileRenamed =  new File(fileDiretorio, "renomeado.js");
        boolean isRenomeado = fileArquivo.renameTo(fileRenamed);
        System.out.println(isRenomeado);

    }
}
