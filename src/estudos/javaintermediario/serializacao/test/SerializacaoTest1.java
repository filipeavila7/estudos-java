package src.estudos.javaintermediario.serializacao.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import src.estudos.javaintermediario.serializacao.dominio.Aluno;

public class SerializacaoTest1 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "shipin", "2345");
        
        
        serializar(aluno);
        deserializar();
   
   
   
   
    }

    // serializar um objeto, guardando os dados dele em bytes em um arquivo txt
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.txt"); // criar o caminho
        // output para mandar os dados e passar o caminho
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ler oque ta escrito no arquivo
    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.txt");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
           Aluno aluno = (Aluno)ois.readObject();
           System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
