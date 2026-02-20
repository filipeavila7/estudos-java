package src.estudos.javacore.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // bloco de inicialização e os blocos de inicializao estaticos sao carregados apenas uma vez
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            // começar do 1
            episodios[i] = i + 1;

        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int i : this.episodios) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
