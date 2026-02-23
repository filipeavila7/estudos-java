package src.estudos.javacore.heranca.dominio;

public class Pessoa {
    protected String nome; // com o protected, todas as subclasses poderao usar os atributos como se fossem publicos
    protected String cpf; // permite tb que outras classes do msm pacote acessem os atributos                                  
    protected Endereco endereco;

    static{
        System.out.println("dentro do bloco estatico de pessoa");
    }

    {
        System.out.println("dentro do bloco de inicializacao nao estatico de pessoa 1");
    }

    {
        System.out.println("dentro do bloco de inicializacao nao estatico de pessoa 2");
    }
    

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

        System.out.println("dentro do construtor de pessoa");
    }


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
