package src.estudos.javacore.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExemptionTest1 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("C:\\Users\\shipin dovu\\Documents\\teste\\src\\estudos\\arquivo\\teste.txt");
        // sou obrigado a fazer um try, se não ele não compila, jvm me obriga a tratar caso haver exeções
        try {
            file.createNewFile(); // tenta executar
            System.out.println("arquivo criado com sucesso");
          // pegar exception
        } catch (IOException e) { // caso de errado, pegue a exeção do objeto e de o nome de e (exepetion)
            e.printStackTrace();

        }
        
    }
}
