package hn.edu.ujcv.objetos;

public class General extends Clase{
    private boolean TodasCarreras;

    public General(){
        super();
    }
    public General (int pId, String pNombre, int pUnidadesValorativas, int pNA1, int pNA2, int pNA3
            ,int pNE1, int pNE2, int pNE3, int pNR, boolean pTodasCarreras){
        super(pId, pNombre, pUnidadesValorativas, pNA1, pNA2, pNA3, pNE1, pNE2, pNE3, pNR);
        this.TodasCarreras = pTodasCarreras;
    }

    public void setTodasCarreras(boolean todasCarreras) {
        this.TodasCarreras = todasCarreras;
    }
    public boolean isTodasCarreras() {
        return TodasCarreras;
    }
    @Override
    public String toString(){
        return String.format("%s \nAplica para Todas las Carreras: %s ", super.toString(), isTodasCarreras());
    }

}
