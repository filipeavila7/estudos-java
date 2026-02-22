package src.estudos.javacore.heranca.dominio;

public class Pessoa {
    protected String nome; // com o protected, todas as subclasses poderao usar os atributos como se fossem publicos
    protected String cpf; // permite tb que outras classes do msm pacote acessem os atributos                                  
    protected Endereco endereco;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    } 


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
}
