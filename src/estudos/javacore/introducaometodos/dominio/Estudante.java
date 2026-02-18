package src.estudos.javacore.introducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    // não precisa passar o parametro de objeto do estudante
    // pois o metodo ja tem acesso a todos os atributos dessa classe
    public void imprimir(){
        // this se refere ao proprio objeto
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
