package src.estudos.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, llong, double e float -> 0
        // char -> espaço em branco
        // boolean -> false
        // string -> nulo
        String[] nomes = new String[3];

        nomes[0] = "shipin";
        nomes[1] = "patock";
        nomes[2] = "flp";

        // caso tente atribuir um novo tamanho no array, apagara os outros
        nomes = new String[4];
        // metodo lenght do array para saber o tamanho dele
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        
    }
}       