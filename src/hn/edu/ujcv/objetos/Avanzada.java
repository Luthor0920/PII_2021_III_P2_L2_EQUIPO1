package hn.edu.ujcv.objetos;

public class Avanzada extends Clase {
    private int ValorVinculacion;

    public Avanzada(int pID, String pNombre, int pUnidades, int pNA1,
                    int pNE1, int pNA2, int pNE2, int pNA3, int pNE3, int pNR,
                    int pValorVinculacion) {
        super(pID, pNombre, pUnidades, pNA1, pNE1, pNA2, pNE2, pNA3, pNE3, pNR);
        this.ValorVinculacion = pValorVinculacion;
    }

    public int getValorVinculacion() {
        return ValorVinculacion;
    }
    public void setValorVinculacion(int valorVinculacion) {
        this.ValorVinculacion = valorVinculacion;
    }

    @Override
    public double CalcularNotaFinal() {
        return super.CalcularNotaFinal() + this.ValorVinculacion*0.15;
    }

    @Override
    public String toString() {
        return super.toString().concat("\nValor Vinculacion: ").concat(String.valueOf(ValorVinculacion));
    }
}