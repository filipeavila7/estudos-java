package src.estudos.javacore.sobrecargametodos.test;

import src.estudos.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        // settar os atributos todos de uma vez
        anime.init("bleach", "shonen", 300);
        
        anime.init("bleach", "shonen", 300, "acao");
        
        anime.imprime();
    }
}
