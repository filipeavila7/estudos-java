package src.estudos.javaintermediario.comportamentos.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import src.estudos.javaintermediario.comportamentos.dominio.Car;
// import src.estudos.javaintermediario.comportamentos.interfaces.CarPredicate;

public class ComportamentoPorParametroTest2 {
    private static List<Car> cars = List.of(new Car("green", 2011), 
        new Car("black", 1998), 
        new Car("red", 2020));
    
    
    public static void main(String[] args) {
        // subscrevemos o metodo test da interface com classe anonima
        // List<Car> greenCars = filter(cars,  new CarPredicate() {
        //     @Override
        //     public boolean test(Car car){
        //         return car.getColor().equals("green"); // verifica se a cor é verde
        //     }
        // });

        // arrow, msm coisa da de cima so que bem reduzida
        // arrow vai criar toda aquele overhide do test, pegando a variavel car recebida no metodo test
        List<Car> greenCars2 = filter(cars, car -> car.getColor().equals("green"));
       

        System.out.println(greenCars2);
    }


    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate){
            List<Car> filterCars = new ArrayList<>();
            for (Car car : cars) {
                if (carPredicate.test(car)) { // se retornar true, adciona na lista
                    filterCars.add(car);
                }
            }
            return filterCars;
        }

        
}
