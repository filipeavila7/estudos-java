package src.estudos.javacore.introducaometodos.dominio;

public class Gato {
    public String nome;
    public String raca;
    public int idade;


    public void miar(){
        System.out.println(this.nome + " esta miando!");
    }

    public void correr(){
        System.out.println(this.nome + " esta correndo!");
    }
}
