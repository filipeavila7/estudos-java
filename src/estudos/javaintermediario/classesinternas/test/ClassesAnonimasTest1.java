package src.estudos.javaintermediario.classesinternas.test;

// classes anonimas, trocar o comportamento do metodo por um breve periodo de tempo

class Animal{
    public void walk(){
        System.out.println("animal esta andando");
    }
}


public class ClassesAnonimasTest1 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            // criar uma subclasse anonima e subscrever o metodo
            @Override
            public void walk(){
                System.out.println("animal classe anonima esta andando");
            }
        };

        animal.walk();    
    
    }
}
