package src.estudos.javaintermediario.classesinternas.test;

public class ClassesInternasTest3 {

    private String name = "shipin" ;

    static class InnerClass { // não pode acesar atributos não estáticos da classe maior
        private String lastName = "patock";
        void print (){
            System.out.println(new ClassesInternasTest3().name + " " + lastName);
        }
        
    }
    public static void main(String[] args) {
        InnerClass inner =  new InnerClass(); 

        inner.print();
    }
}
