
package src.estudos.javacore.interfaces.dominio;

public interface DataLoader {
    // por padrão ja é publico e abstrato na interface, nem precisa colocar
    void load();


    //por padrao, todos os atributos são constantes
    public static final int MAX_DATA_SIZE = 10;

    // metodo concreto na interface
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissão");
    }

    // metodos estaticos não podem ser subescritos nas classes filhas pois ele é excluisivo dessa interface
    public static void retriveMaxDataSize(){
        System.out.println("dentro da interface");
    }
}
