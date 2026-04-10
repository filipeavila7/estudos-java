package src.estudos.javaintermediario.comportamentos.interfaces;

import src.estudos.javaintermediario.comportamentos.dominio.Car;


@FunctionalInterface // interface funcional, possui só um metodo abstrado
public interface CarPredicate {
    boolean test(Car car); // ometodo disz como a minhas lambda vai funcionar, o contrato
}

// anonimas, funções, conciso
// (parametro) -> <expressão>
// (Car  car) -> car.getColor().equals("red");