package src.estudos.introducao;

public class ArraysMultiDimensionais02 {
    public static void main(String[] args) {
        int [] array = {1,2,4,5,6,7};
        int [][] arrayInt = new int [3][];

        // declarar o tamanho dos arrays secundarios de forma diferente, tamanhos diferentes em cada array
        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{3,4,5,6};

        // adcionar valor direto no array dimensional, array base  com 3 posicoes, com a primeira tendo 2, segunda 3 e terceira 5
        int [][] arrayInt2  = {{0,9}, {1,2,3}, {4,6,7,6,7}};


         // array que percorre os arrays
        for (int[] arrayBase : arrayInt2) {
            // percorrer os arrqys percorridos
            for (int num: arrayBase) {
                System.out.println(num);
            }
        }
    }
}
