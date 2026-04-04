package src.estudos.javaintermediario.comportamentos.interfaces;

import src.estudos.javaintermediario.comportamentos.dominio.Car;

public interface CarPredicate {
    boolean test(Car car);
}
