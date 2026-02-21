package src.estudos.javacore.associacao.dominio;

public class Jogador {
    private String nome;
    // atributo usando variavel de refernecia da classe time
    // time é um objeto de outra classe
    private Time time;


    public void imprime(){
        System.out.println(this.nome);

        // caso o nome do time n seja nulo
        if (time != null) {
            // usar atributo da classe time
            System.out.println(time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    // ESSES METODOS SAO DO JOGADOR E NÃO DO TIME
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
