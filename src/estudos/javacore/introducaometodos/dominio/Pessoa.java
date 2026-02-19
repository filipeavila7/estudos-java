package src.estudos.javacore.introducaometodos.dominio;

public class Pessoa {
    // atributos privados
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    // criar um metodo para acessar os atributos privados e atribuir valores a ele
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade < 0) {
            System.out.println("idade invalida");
            return;
        }

        this.idade = idade;
    }
    // sem void, pois precisa de um retorno
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

}
