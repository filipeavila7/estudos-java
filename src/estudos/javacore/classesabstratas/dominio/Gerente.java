package src.estudos.javacore.classesabstratas.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario); // super para chamar o construtor da classe pai
    }

    @Override
    public void calcularBonusSalario() {
        this.salario = salario * 1.20;
    
    }

    
    
}
