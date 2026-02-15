package src.estudos.introducao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while , do while e for
        int count = 0;
        while (count <= 10) {
            System.out.println(count);
            count += 1;
            // ++ count 
            
        }

        count = 0;
        do{ // executa pelo menos uma vez, mesmo que a condição seja falsa
            System.out.println("dentro do do-while");
            ++ count;
        }while (count < 15);    
           

        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        
    }

    
}
