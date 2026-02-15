package src.estudos.introducao;

public class ArraysMultiDimensionais {
    public static void main(String[] args) {
        // 1,2,3,4,5 meses
        // 31, 28, 31, 30 dias
        // arrays dentro de arrays
        int[][] dias = new int[3][3];
        // janeiro tem 31 dias
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;
        // percorrer o primeiro array
        for (int i = 0; i < dias.length; i++) {
            // percorrer o array na posição 0 do primeiro array, ou seja, o primeiro array dentro do array
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        // uma chave do tipo array pra percorrer o hjarray
        for (int[] arrBase : dias) {
            // percorrer o valor dos arrays tendo como base a refrencia arrBase
            for (int num: arrBase) {
                System.out.println(num);
            }
        }


       
    }
}
