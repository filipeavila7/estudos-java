package src.estudos.javaintermediario.classesinternas.test;

public class ClassesInternasTest1 {
    private String nome = "shipin";

    // classe interna tem acesso a todos os atributos da classe que ela ta, ou seja da externa
    // nested classes --> aninhadas
    class ClasseInterna{
        public void imprimirAtributoDaClasseTest(){

            System.out.println(nome);
            System.out.println(this); // sempre vai se referir a classe que ele se encontra, no caso a classe interna
            System.out.println(ClassesInternasTest1.this); // referir ao this da classe externa 
        }
    }
    public static void main(String[] args) {
        ClassesInternasTest1 classeExterna = new ClassesInternasTest1();
        // para instaciar um objeto de uma classe interna, voce depende da classse em que ela esta ou seja a externa
        ClasseInterna classeInterna = classeExterna.new ClasseInterna();

        // outra forma de instanciar
        ClasseInterna classeInterna2 = new ClassesInternasTest1().new ClasseInterna();

        classeInterna.imprimirAtributoDaClasseTest();
    }
}
