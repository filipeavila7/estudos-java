package src.estudos.javacore.associacaoex.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    // um professro tem varios seminarios
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        // imprimir professor
        System.out.println("professor: " + this.nome);
        if (this.seminarios == null) {
            return;
        }
        // imrpimir os seminario cadastrados 
        System.out.println("===SEMINARIOS CADASTRADOS===");
        // percorrer o array de seminarios
        for (Seminario seminario : this.seminarios) {
            // mostrar titulo dos seminarios percorridos
            System.out.println(seminario.getTitulo());
            // // pegar nome do local
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println("===ALUNOS===");
            // percorrer os alunops no metodo get alunos do seminario
            for (Aluno aluno : seminario.getAlunos()) {
                // printar o nome, usando o metodo do objeto aluno getNome
                System.out.println("aluno: " + aluno.getNome());
            }
        }
        
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }



    public Seminario[] getSeminarios() {
        return seminarios;
    }



    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    

    
}
