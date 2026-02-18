package src.estudos.javacore.introducaometodos.dominio;

public class ImpressoraEstudante {
    // um metodo que recebe uma variavel do tipo reference, no cas um objeto
    public void imprime (Estudante estudante){

                             
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
