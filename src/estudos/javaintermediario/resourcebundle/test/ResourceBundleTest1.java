package src.estudos.javaintermediario.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest1 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        // colocar o caminho do arquivo e a lingua e local
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
    
        // pegar chave para retronar o valor
        System.out.println(bundle.getString("hello"));    
        System.out.println(bundle.getString("good.morning"));    


        bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));    
        System.out.println(bundle.getString("good.morning"));
    
    }
}
