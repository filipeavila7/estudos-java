package src.estudos.javacore.classesabstratas.dominio;

// uma classe abstrata não pode ser instaciada, ssve para ser superclasse 
// se uma classe abstrata herdar uma outra classe abstrata com um metodo abstrato, ela n tem a obrigação de subescrever o metodo mas as subclasses concretas tem
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonusSalario();
    }

    

    // caso a classe abstrata subscrever o metodo abstrato da superclasse abstrata, as subclasses não precisaraam subscrever
    @Override
    public void imprime() {
        System.out.println("imprimindo");
        
    }




    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
    }
    // metodos abstratos so podem existir dentro de classes abstratas
    // metodo abstrato, força todas as subclasses a subscrever esse metodo, ele é apenas um molde
    public abstract void calcularBonusSalario();

    

    
}
