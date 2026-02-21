package src.estudos.javacore.associacao.dominio;

public class Escola {

    private String nome;
    private Professor[] professores;


    // passar nome da escola e lista de professores na hora de instaciar
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println(this.nome);
        // se o array de professoreas for nulo, quebra o metodo
        if (professores == null) {
            return;
        }
        // interar o array e printat o nome dos professores
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

}
