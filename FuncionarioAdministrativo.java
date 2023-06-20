package faculdade;

public class FuncionarioAdministrativo extends Funcionario implements Reembolco, Pagamento {
 private String funcaoAdministrativa;
 private String senioridade;
private final double taxa = 0.8;
    public FuncionarioAdministrativo(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    @Override
    public double aplicarReembolco() {
        double reembolcoAplicado = super.getSalario() * taxa;
        return reembolcoAplicado;
    }

    public String getFuncaoAdministrativa() {

        return funcaoAdministrativa;
    }


    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }


    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade){

        this.senioridade = senioridade;
    }


    @Override
    public double aumentarValor() {
        return (this.getSalario() * 0.1) + this.getSalario();

     }

    @Override
    public String toString() {
        return " Função administrativa: " + this.getFuncaoAdministrativa() + " senioridade: " + this.getSenioridade();
    }
}
