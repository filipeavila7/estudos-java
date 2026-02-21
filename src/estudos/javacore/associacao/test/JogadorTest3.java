package src.estudos.javacore.associacao.test;

import src.estudos.javacore.associacao.dominio.Jogador;
import src.estudos.javacore.associacao.dominio.Time;

// um time tem varios jogadores, e um jogador tem um time

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("shipin");
        Jogador jogador2 = new Jogador("shipino");
        Time time = new Time("Brasil");
        // array de objetos
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);

        // passar array de jogadores para colocar varios jogadores dentro de um time
        time.setJogadores(jogadores);
        System.out.println("-------------JOGADORES-------------");
        jogador.imprime();

        System.out.println("---------TIME---------");
        time.imprime();
        
    }
}
