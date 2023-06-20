package faculdade;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario  implements Reembolco, Pagamento {

    private String nivelGraduacao;
    private String disciplinaMinistrada;
private int quantidadeAluno;


List<Turma> turmas = new ArrayList<>();
List<Estagiario> estagiarios = new ArrayList<>();

final double taxa = 0.8;
    public Professor(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplinaMinistrada, int quantidadeAluno) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;

        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeAluno = quantidadeAluno;
    }





    @Override
    public double aplicarReembolco() {
double reembolcoAplicado = this.getSalario() * taxa;
        return reembolcoAplicado;
    }


    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantidadeAluno() {
        return quantidadeAluno;
    }

    public void setQuantidadeAluno(int quantidadeAluno) {
        this.quantidadeAluno = quantidadeAluno;
    }

    @Override
    public double aumentarValor() {

        return (super.getSalario() * 0.1) + super.getSalario();


    }


    @Override
    public String toString() {
        return "Nível de graduação: " + this.getNivelGraduacao() + " Disciplina ministrada: " + this.getDisciplinaMinistrada() + " Quantidade de alunos: " + this.getQuantidadeAluno();
    }
}
