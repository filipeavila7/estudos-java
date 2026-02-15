package src.estudos.introducao;

public class EstruturasCondicionais3 {
    public static void main(String[] args) {
        // operador ternario
        // doar se salario for maior que 5000:
        double salario = 6000;
        String mensagem = "eu vou doar uma grana ai ";
        String mensagemNaoDoar = "to sem grana";
        
        
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagem : mensagemNaoDoar;
        System.out.println(resultado); 


    }
}
