package src.estudos.javacore.interfaces.dominio;


// interfaces usam implements ao inves de extends e são obrigadas a subscrever metodos abstratos
// uma classe pode herdar multiplas interfaces
public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
        
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
        
    }

    @Override
    public void checkPermission() {
        System.out.println("fazendo checagem do banco de dados");
    }

    



    


    
    
}
