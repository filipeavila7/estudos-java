package src.estudos.javacore.associacao.test;



import src.estudos.javacore.associacao.dominio.Jogador;
import src.estudos.javacore.associacao.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        // criar um jogador
        Jogador jogador1 = new Jogador("shipas");
        jogador1.imprime();
        // criar um time
        Time time = new Time("brasil");

        // associar esse jogadora um time
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
