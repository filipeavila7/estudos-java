package src.estudos.javacore.construtores.test;

import src.estudos.javacore.construtores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        // o contrutorobriga a passar os atributos na criacao do objeto
        Anime anime = new Anime("bleach", "shonen", 200, "acao", "k");
        // sobrecarga de construtor
        Anime anime2 = new Anime();
        
        anime.imprime();
    }
}
