package src.estudos.javacore.associacaoex.test;

import src.estudos.javacore.associacaoex.dominio.Aluno;
import src.estudos.javacore.associacaoex.dominio.Local;
import src.estudos.javacore.associacaoex.dominio.Professor;
import src.estudos.javacore.associacaoex.dominio.Seminario;

public class ExercicioTest {
    public static void main(String[] args) {
        Local local = new Local("japao");
        Aluno aluno = new Aluno("shipin", 18);
        Professor professor = new Professor("shipino", "codeiro");
        Aluno[] alunosSeminario = { aluno };

        Seminario seminario = new Seminario("mago java", alunosSeminario, local);
        Seminario[] seminariosProf = {seminario};
        professor.setSeminarios(seminariosProf);

        professor.imprime();
    }

}
