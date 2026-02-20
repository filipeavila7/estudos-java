package src.estudos.javacore.modificadorstatic.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    // modificador estatico, deixa de pertencer a um objeto em si, e comça a pertencer a toda classe
    // caso o valor dele seja alterado, alterara em todos os outros objetos
    private static double velocidadeLimite = 250;

    
    // usar metodos statics quando ele n usa atributos da classe

    // exemplo, precisar criar uma classe de conversao de temperatura, para n precisar instaciar um objeto para realizar a conversao, apenas use um metodo estatico que fara o calculo

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public void imprime(){
        System.out.println("--------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade max: " + this.velocidadeMaxima);
        // por ser estatico, tera que ser acessado pela prorpia classe
        System.out.println("Velocidade limit: " + Carro.velocidadeLimite);
    }

    // metodos estaticos so podem acessar variaveis estaticas
    // metodo estatico, pertence a classe, e não ao objeto
    public static void setVelocidadeLimite(double velocidadeLimite){
        // n usar this, pois tem a possiblidade de que o objeto n tenha valor nenhum
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }
   
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    
    
    
}
