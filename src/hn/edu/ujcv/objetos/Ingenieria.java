package hn.edu.ujcv.objetos;

public class Ingenieria extends General{
    private int NotaProyecto;

    public Ingenieria(int pId, String pNombre, int pUnidadesValorativas, int pNA1, int pNA2, int pNA3
            ,int pNE1, int pNE2, int pNE3, int pNR, boolean pTodasCarreras, int pNotaProyecto){
        super(pId, pNombre, pUnidadesValorativas, pNA1, pNA2, pNA3, pNE1, pNE2, pNE3, pNR, pTodasCarreras);
        if (pNotaProyecto < 0 || pNotaProyecto > 100){
            throw new IllegalArgumentException("Nota Proyecto debe estar entre 0 y 100");
        }
        this.NotaProyecto = pNotaProyecto;
    }
    public int getNotaProyecto() {
        return NotaProyecto;
    }
    public void setNotaProyecto(int pNotaProyecto) {
        if (pNotaProyecto < 0 || pNotaProyecto > 100){
            throw new IllegalArgumentException("Nota Proyecto debe estar entre 0 y 100");
        }
        this.NotaProyecto = pNotaProyecto;
    }

    @Override
    public double CalcularNotaFinal() {
        double notaProyecto;
        notaProyecto = (super.CalcularNotaFinal()*0.7) + (getNotaProyecto()*0.3);
        return super.CalcularNotaFinal();
    }
    @Override
    public String toString(){
        return String.format("%s \nNota Proyecto: %s Nota final: %s", super.toString(),
                String.valueOf(CalcularNotaFinal()));
    }
}
