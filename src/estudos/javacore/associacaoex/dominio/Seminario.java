package src.estudos.javacore.associacaoex.dominio;

public class Seminario {
    private String titulo;
    // um seminario tem varios alunos e um local
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }


    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }


    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public Aluno[] getAlunos() {
        return alunos;
    }



    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }



    public Local getLocal() {
        return local;
    }



    public void setLocal(Local local) {
        this.local = local;
    }

    
}
