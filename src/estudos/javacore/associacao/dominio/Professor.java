package src.estudos.javacore.associacao.dominio;

public class Professor {

    
    public Professor(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
