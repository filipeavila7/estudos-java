package src.estudos.javacore.introducaometodos.dominio;

// classe que contem metodos para imprimir dados relacionado aos funcionarios
public class FuncionarioImprimir {
    // metodo de imprimir os dados do usuario, recebendo como parametro o proprio objeto
    public void imprimirDados(Funcionario funcionario){

        System.out.println("Nome: "+ funcionario.nome);
        System.out.println("Idade: "+ funcionario.idade);
        System.out.print("Salários:");
        System.out.println("");

        // for para percorrer o array dos salarios
        for (double sal : funcionario.salario) {
            System.out.println(sal);
        }
        
    }
                
    // metodo que imprime a media salarial do funcionario, tambem usa como parametro o objeto
    public void mediaSalario(Funcionario funcionario){
        // logica da media, somar todos os valores do array e dividir pelo o seu leght (tamanho)
        double media = 0;

        // criar uma variavel do tipo array double (mesma que a do atributo) e igualar ela ao atributo funcionario.salsrio
        double [] salarioMedia = funcionario.salario;
        // percorre os salarios para fazer a media
        for (double sal : salarioMedia) {
            media += sal;
        }

        media = media / salarioMedia.length;
        System.out.println("Media salarial: " + media);


    }
}
