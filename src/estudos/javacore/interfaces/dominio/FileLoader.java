package src.estudos.javacore.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Crregando dados de um arquivo");
        
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
        
    }


    @Override
    public void checkPermission() {
        System.out.println("fazendo cehcagem de dados de um arquivo");
    }

    
    
}
