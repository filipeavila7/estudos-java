package src.estudos.javacore.classesabstratas.dominio;

public class Filipe {
    private String nome;
    

    public Filipe(String nome) {
        this.nome = nome;
    }

    public void beijo(AnaJulia anaJulia){
        System.out.println(this.nome + " esta beijando a " + anaJulia.getNome());
    }

    
}
