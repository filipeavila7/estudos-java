package src.estudos.javacore.introducaometodos.dominio;

public class Funcionario2 {
    private String nome;
    private int idade;
    private double [] salario;
    private double media;


    public void imprimirDados(){
        
        if (salario == null) {
            return;
        }

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.print("Salários:");
        System.out.println("");

        // for para percorrer o array dos salarios
        for (double sal : salario) {
            System.out.println(sal);
        }
        
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public double[] getSalario() {
        return salario;
    }


    public void setSalario(double[] salario) {
        this.salario = salario;
    }


    public double getMedia() {
        return media;
    }




    // metodo que imprime a media salarial do funcionario, tambem usa como parametro o objeto
    public void mediaSalario(){

        if (salario == null) {
            return;
        }

        // logica da media, somar todos os valores do array e dividir pelo o seu leght (tamanho)
       

        // criar uma variavel do tipo array double (mesma que a do atributo) e igualar ela ao atributo funcionario.salsrio
        double [] salarioMedia = salario;
        // percorre os salarios para fazer a media
        for (double sal : salarioMedia) {
            media += sal;
        }

        media = media / salarioMedia.length;
        System.out.println("Media salarial: " + media);


    }

    


    
}
