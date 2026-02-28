package src.estudos.javacore.classesabstratas.dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }


    // subescrever o metodo 
    @Override
    public void calcularBonusSalario() {
        this.salario = salario * 1.05;
    }
    

    
}
