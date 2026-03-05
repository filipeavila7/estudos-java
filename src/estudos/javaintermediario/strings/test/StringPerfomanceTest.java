package src.estudos.javaintermediario.strings.test;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concactString(100000);
        long fim = System.currentTimeMillis();

        System.out.println("tempo gasto para a string: " + (fim - inicio));

        System.out.println("====================================");

        inicio = System.currentTimeMillis();
        concactStringBuilder(100000);
        fim = System.currentTimeMillis();

        System.out.println("tempo gasto para a string: " + (fim - inicio));
    
        System.out.println("====================================");


        inicio = System.currentTimeMillis();
        concactStringBuffer(100000);
        fim = System.currentTimeMillis();

        System.out.println("tempo gasto para a string: " + (fim - inicio));
        
        
        
        
        
    
    
    }

    private static void concactString(int tamanho) {
        String texto = ""; // 0, 01, 012, 0123
        for (int i = 0; i < tamanho; i++) {
            texto += i;

        }
    }

    // foco em desempem=nho
    private static void concactStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho); // 0, 01, 012, 0123
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
            

        }
    }


    private static void concactStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho); // 0, 01, 012, 0123
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }

}
