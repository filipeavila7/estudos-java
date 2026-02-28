package src.estudos.javacore.classesabstratas.test;

import src.estudos.javacore.classesabstratas.dominio.AnaJulia;
import src.estudos.javacore.classesabstratas.dominio.Filipe;

public class BeijoTest {
    public static void main(String[] args) {
        Filipe filipe = new Filipe("Filipe");
        AnaJulia anaJulia = new AnaJulia("Ana julia");


        filipe.beijo(anaJulia);
    }
}
