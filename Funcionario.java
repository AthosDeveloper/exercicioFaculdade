package faculdade;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String numeroRegistro;
    private String orgaoLotacao;
    private double salario;

    public Funcionario(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
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

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;


    }

    @Override
    public String toString() {
        return "Seu nome é: " + this.getNome() + " CPF: " + this.getCpf() + " Número de registro: " + this.getNumeroRegistro() + " Órgão de lotação: " + this.getOrgaoLotacao() + " Salário atual: " + this.getSalario();
    }
}

