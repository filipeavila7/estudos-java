package src.estudos.javacore.modificadorstatic.test;

import src.estudos.javacore.modificadorstatic.dominio.Carro;

public class CarroTest1 {
    // static pois é um metodo da classe --> Carrotest1.main(args)
    public static void main(String[] args) {
        Carro c1 = new Carro("Ferrari", 280);
        Carro c2 = new Carro("BMW", 275);
        Carro c3 = new Carro("Audi", 290);

        // System.out.println(Carro.velocidadeLimite);

        Carro.setVelocidadeLimite(180);

        // System.out.println(Carro.velocidadeLimite);

        c1.imprime();
        c2.imprime();
        c3.imprime();


    }
}
