package faculdade;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario implements Pagamento {
    List<Professor> supervisionados = new ArrayList<>();

    public Coordenador(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, int professorSupervisionado) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);

    }
public void adicionarSupervisionados(Professor supervisionado) {
    if (this.supervisionados.size() < 3) {
        this.supervisionados.add(supervisionado);
    }
    System.out.println("O limite máximo de professores foi atingido.");
}


    @Override
    public double aumentarValor() {

        return (this.getSalario() * 1.05) + super.getSalario();

    }

}
