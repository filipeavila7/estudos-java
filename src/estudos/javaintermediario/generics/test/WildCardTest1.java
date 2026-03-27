package src.estudos.javaintermediario.generics.test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("consultando cachorro");

    }

}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("consultando o gato");

    }

}

public class WildCardTest1 {
    public static void main(String[] args) {
        Cachorro [] cachorros = {new Cachorro(), new Cachorro()};
        Gato [] gatos = {new Gato(), new Gato()};

        printConsulta(cachorros);
        printConsulta(gatos);


        Animal[] animals = {new Cachorro(), new Gato()};
        printConsulta(animals);
    }

    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
        //animals[1] = new Gato();
    }
}
