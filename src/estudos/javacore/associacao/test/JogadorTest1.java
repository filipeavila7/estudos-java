package src.estudos.javacore.associacao.test;

import src.estudos.javacore.associacao.dominio.Jogador;

public class JogadorTest1 {
    public static void main(String[] args) {
        Jogador jg1 = new Jogador("shipin");
        Jogador jg2 = new Jogador("supin");
        Jogador jg3 = new Jogador("shipino");

        // array de objetos
        Jogador[] jogadores = { jg1, jg2, jg3 };

        // percorrer o array com variavel do tipo Jogador e usar o metodo de imprimir pra cada objeto no array
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }

}
