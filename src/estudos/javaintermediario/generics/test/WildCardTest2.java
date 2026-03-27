package src.estudos.javaintermediario.generics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest2 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printConsulta(cachorros);
        printConsulta(gatos);

        List<Animal> animals = new ArrayList<>();
        

        printAnimalConsulta(animals);
        
        //printAnimalConsulta(cachorros);
        
    }
    // type eraser, passando uma lista de cachorros para uma de animal, msm cachorro sendo extendido por animal, ele da erro de compilação
    // esse erro acontece se tentar passar atrves de parametros, pois o java não etende que aqueles 2 tipos são iguais pelo polimorfismo por causa do type eraser
    private static void printConsulta(List< ? extends Animal> animals){ // essa lista vai receber tudo que extenda animal
      
        
        for (Animal animal : animals) {
            animal.consulta();
        }
        // isso funciona sem o ? extends
        //animals.add(new Cachorro());

    } // essa recebe todos os irmãos, impossivel adcionar na lisa, não sei oq vai vim , ent posso ter prpblema com os irmãos

    // essa garante que ira receber objetos doi tipo animal, onde a classe animal é a super
    private static void printAnimalConsulta(List<? super Animal> animals){ // recebe as classes que sao pai, no cso animal e object
        // posso adcionar na lista

        animals.add(new Gato());
        animals.add(new Cachorro());

    }
}
