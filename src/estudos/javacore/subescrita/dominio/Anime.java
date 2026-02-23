package src.estudos.javacore.subescrita.dominio;

public class Anime {
    private String nome;

    

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // sobrescrever um metodo da classe object
    @Override // pra ter certeza que ta subescrevendo um metodo existente
    public String toString(){
        return "Anime: " + this.nome;
    }

    
}
