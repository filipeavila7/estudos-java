package src.estudos.javaintermediario.colecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(nome, "nome não pode ser nulo");
        Objects.requireNonNull(id, "id não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }


    

    

    public Manga(Long id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }






   

    

    @Override
    public String toString() {
        return "Manga [id=" + id + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }






    // forma para poder organizar a lista pelo id
    @Override
    public int compareTo(Manga outroManga) {
        // negativo se o this for menor do que o "outroManga"
        // se this for igual ao outroMnaga retrona 0
        // retorna positivo se o this for maior que outroMnaga

        // if (this.id < outroManga.getId()) {
        //     return -1;
        // }

        // if (this.id == outroManga.getId()) {
        //     return 0;
        // }

        // return 1;


        return this.id.compareTo(outroManga.getId());


    }




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Manga other = (Manga) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }






    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }






    public int getQuantidade() {
        return quantidade;
    }






    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    

    
}
