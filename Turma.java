package faculdade;

public class Turma {
    private  double nota;


    private  static final int maxEstancia = 2;
    private static final int contadorEstancia = 0;

    public Turma(double nota) {
        if (contadorEstancia == maxEstancia) {

            throw new IllegalStateException("Instância inválida, um professor deve ter apenas duas turmas.");
        }
        this.nota = nota;

    }

    public void setNota(double nota) {


        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return " nota da turma: " + this.nota;
    }

}
