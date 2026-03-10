package src.estudos.javaintermediario.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class fileTest1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\shipin dovu\\Documents\\teste\\src\\estudos\\arquivo\\file.py");
        try {
           //Boolean isDelete = file.delete();
           boolean isCreated = file.createNewFile(); // criar arquivo com base no caminho
           System.out.println(isCreated);
           boolean isExist = file.exists(); // verificar se o arquivo existe antes de poder apagar
           
           System.out.println("path " + file.getPath()); 
           System.out.println("path absoluto " + file.getAbsolutePath());
           
           
           System.out.println("is file " + file.isFile());   
           System.out.println("is directory " + file.isDirectory());   


           System.out.println("is hidden " + file.isHidden()); 
           
           
           System.out.println("is modified " +  new Date(file.lastModified()));  


           if (isExist) {
               System.out.println("deletado: " + file.delete());  // apagar o arquivo
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    
    }
}
