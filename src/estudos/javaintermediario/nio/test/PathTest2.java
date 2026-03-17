
package src.estudos.javaintermediario.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest2 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta"); // criar pasta na raiz do projeto
        
        if (Files.notExists(pastaPath)) { // caso não exista, ele cria
          Path pastaCriada = Files.createDirectory(pastaPath);
        }
        
        
    }
}
