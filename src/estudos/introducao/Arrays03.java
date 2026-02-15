package src.estudos.introducao;

public class Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        // criar array diretamente com valores
        int[] numeros2 = {1,2,3,4,5};

        // outra forma
        int [] numeros3 = new int[]{1,2,3,4};

        // foreach, forma mais simples de percorrer o array
        for (int i : numeros3) {
            System.out.println(i);
            
        }

    }
}
