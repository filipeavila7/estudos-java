package src.estudos.javacore.interfaces.test;


import src.estudos.javacore.interfaces.dominio.DataLoader;
import src.estudos.javacore.interfaces.dominio.DatabaseLoader;
import src.estudos.javacore.interfaces.dominio.FileLoader;

public class DataLoadertest1 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();


    }
}
