package src.estudos.javacore.heranca.dominio;

// herdar os atributos e metodos da classe pessoa:
public class Funcionario extends Pessoa{
    private double salario;

    // subscrever o metodo de pessoa, colocando o msm nome
    public void imprime(){
        super.imprime();   // executa o metodo da classe pai pessoa mas com os atributos do funcionario
        System.out.println(this.salario); // colocar o novo attbuto que faz parte de funcionario
    }

    public void relatorioPagamento(){
        // com o protected eu posso assar os atributos msm eles não estando aqui apenas na classe pai
        System.out.println(this.nome + "recebi um salario de: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
