package src.estudos.javacore.modificadorfinal.dominio;

public class Carro {
    private String nome;
    // final declara uma constante, não pode ser alterada o valor durante a execução
    public static final double VELOCIDADE_LIMITE = 250;

    // variavel de referencia que nunca podera ser mudada
    public final Comprador COMPRADOR = new Comprador();

    /*
     * static{
     * outra forma de atribuir valor a variavel constante
     * VELOCIDADE_LIMITE = 250;
     * 
     * }
     * 
     * 
     * public Carro() {
     * VELOCIDADE_LIMITE = 250;
     * }
     * 
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static double getVelocidadeLimite() {
        return VELOCIDADE_LIMITE;
    }

    // metodo final em uma superclasse define que ometodo jamais podera ser subescrito em uma classe filha 
    public final void imprime(){
        System.out.println(this.nome);
    }

    

}
