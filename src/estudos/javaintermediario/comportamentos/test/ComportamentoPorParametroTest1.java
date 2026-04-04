package src.estudos.javaintermediario.comportamentos.test;

import java.util.ArrayList;
import java.util.List;

import src.estudos.javaintermediario.comportamentos.dominio.Car;

public class ComportamentoPorParametroTest1 {
    private static List<Car> filterCarByColor(List<Car> cars, String cor){
            List<Car> colorCars = new ArrayList<>();
            for (Car car : cars) {
                if (car.getColor().equals(cor)) {
                    colorCars.add(car);
                }
            }
            return colorCars;
        }


        private static List<Car> filterCarByAge(List<Car> cars, int year){
            List<Car> oldCars = new ArrayList<>();
            for (Car car : cars) {
                if (car.getYear() < year) {
                    oldCars.add(car);
                }
            }
            return oldCars;
        }


    public static void main(String[] args) {    

        List<Car> cars = List.of(new Car("green", 2011), 
        new Car("black", 1998), 
        new Car("red", 2020));


        System.out.println(filterCarByAge(cars, 2015)); 

        System.out.println(filterCarByColor(cars, "red"));  


    }
}
