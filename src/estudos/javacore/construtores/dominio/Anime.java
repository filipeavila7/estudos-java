package src.estudos.javacore.construtores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String studio;

    // construtor, nunca retorna nada
    public Anime(String nome, String tipo, int episodios, String genero){
        // chmar um construtor sem argumentos
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int episodios, String genero, String studio){
        // chmar um construtor
        // o java sabe qual contrutor é, com base no tipo dos parametros
        this(nome, tipo, episodios, genero);
        this.studio =  studio;
    }

    // sobrecarga de construtores, poder usar ou não o construtor
    public Anime(){

    }

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    
    }

    // sobrecarga de metodos: um metodo  com o mesmo nome de outro,porem, com quantidade e tipos de parametro diferentes
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        System.out.println(this.genero);
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    } 

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
