package src.estudos.javaintermediario.classesinternas.test;

public class ClassesInternasTest2 {
    // classes locais --> classes dentro de um metodo
    private String nome = "shipin";

    void print(){
        String ultimoNome = "patock"; // tem q ser final, serve para parametros no metodo tb
        class ClasseLocal{
            public void printLocal(){
                System.out.println(nome + " " + ultimoNome);
            }

        }
        // unica forma de usar a classe, instanciando ela no metodo
        new ClasseLocal().printLocal(); // usar o metodo
    }
    

    public static void main(String[] args) {
        ClassesInternasTest2 externa = new ClassesInternasTest2();
        // usar o metodo que tem a classe dentro, esse metodo criar a classe e ja usa o metodo que tem dentro da classe
        externa.print();

    }
}
