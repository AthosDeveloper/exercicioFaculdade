package faculdade;

public class Estagiario implements Reembolco {
    private static final int maxInstancia = 3;
    private  static int contadorInstancia = 0;
private double bolca;
final double taxa = 0.8;
    public Estagiario(double bolca) {
        if (contadorInstancia == maxInstancia){

throw new IllegalStateException("Instância inválida, um professor deve ter apenas dois estagiários.");
        }
        contadorInstancia++;
        this.bolca = bolca;
    }

    public double getBolca() {
        return bolca;
    }

    public void setBolca(double bolca) {
        this.bolca = bolca;
    }

    @Override
    public double aplicarReembolco() {
       double valorReembolcado = this.getBolca() * taxa;
        return valorReembolcado;
    }

    @Override
    public String toString() {
        return " valor da bolsa: " + this.getBolca() + " reembolço aplicado: " + this.aplicarReembolco();
    }
}


