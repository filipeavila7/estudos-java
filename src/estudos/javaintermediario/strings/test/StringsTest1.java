package src.estudos.javaintermediario.strings.test;
// as strings são imutaveis
// pool de strinhs é um bloco de strings dentro do heap de memoria
// a string so é criada uma vez no pool, caso vc crie outra variavel com o msm ela fara refrencia a essa msm string ja criada
// em caso de vc criar uma c=string com o new, ele criara fora do bloco de strings e fara um outro espaço na memoria do heap
// ou seja os valores serão diferentes pois ambos estao fazendo referencia pra strings diferentes
public class StringsTest1 {
    public static void main(String[] args) {
        String nome = "shipin"; //String constant pool
        String nome2 = "shipin";
        nome = nome.concat(" patock");

        String nome3 = new String("shipin");

        
        System.out.println(nome == nome2); // true, estao fazendo refrencia pro msm objeto shipin no toolde striings
        System.out.println(nome2 == nome3); // falso, uma é do pool de strings e a outra é em otro lugar da memoria
        System.out.println(nome);
    
    }

}
