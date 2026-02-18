package src.estudos.javacore.introducaometodos.test;

import src.estudos.javacore.introducaometodos.dominio.Gato;

public class GatoTest {
    public static void main(String[] args) {
        Gato gato = new Gato();


        gato.nome = "Xamp";
        gato.raca = "Vira-lata";
        gato.idade = 1;

        gato.miar();
        gato.correr();
    }
}
