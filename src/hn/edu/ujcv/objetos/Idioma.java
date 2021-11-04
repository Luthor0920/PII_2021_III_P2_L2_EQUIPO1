package hn.edu.ujcv.objetos;

public class Idioma extends General {
    private int NotaLaboratorio;

    public Idioma(int pID, String pNombre, int pUnidades, int pNA1, int pNE1, int pNA2, int pNE2, int pNA3, int pNE3, int pNR, boolean pTodasCarreras,
                  int pNotaLab) {
        super(pID, pNombre, pUnidades, pNA1, pNE1, pNA2, pNE2, pNA3, pNE3, pNR, pTodasCarreras);
        this.NotaLaboratorio = pNotaLab;
    }

    public int getNotaLaboratorio() {
        return NotaLaboratorio;
    }
    public void setNotaLaboratorio(int notaLaboratorio) {
        this.NotaLaboratorio = notaLaboratorio;
    }

    @Override
    public double CalcularNotaFinal() {
        double notaLaboratorio;
        notaLaboratorio = (super.CalcularNotaFinal()*0.7) + (getNotaLaboratorio()*0.3);
        return notaLaboratorio;
    }

    @Override
    public String toString() {
        return super.toString().concat("\nNota Laboratorio: ").concat(String.valueOf(NotaLaboratorio)).concat(" Nota Final: ")
                .concat(String.valueOf(CalcularNotaFinal()));
    }
}
