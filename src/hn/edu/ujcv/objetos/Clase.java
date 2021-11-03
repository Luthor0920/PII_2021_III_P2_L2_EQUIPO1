package hn.edu.ujcv.objetos;

public class Clase implements IClase{
    private int Id;
    private String Nombre;
    private int UnidadesValorativas;
    private int NA1;
    private int NA2;
    private int NA3;
    private int NE1;
    private int NE2;
    private int NE3;
    private int NR;

    public Clase(){}

    public Clase(int pId, String pNombre, int pUnidadesValorativas, int pNA1, int pNA2, int pNA3
            ,int pNE1, int pNE2, int pNE3, int pNR){
        this.Id = pId;
        this.Nombre = pNombre;
        if (pUnidadesValorativas <= 0){
            throw new IllegalArgumentException("Unidades valorativas deben ser mayores a 0");
        }
        if (pNA1 < 0 || pNA1 > 100){
            throw new IllegalArgumentException("Nota Acumulativa 1 debe estar entre 0 y 100");
        }
        if (pNA2 < 0 || pNA2 > 100){
            throw new IllegalArgumentException("Nota Acumulativa 2 debe estar entre 0 y 100");
        }
        if (pNA3 < 0 || pNA3 > 100){
            throw new IllegalArgumentException("Nota Acumulativa 3 debe estar entre 0 y 100");
        }
        if (pNE1 < 0 || pNE1 > 100){
            throw new IllegalArgumentException("Nota Examen 1 debe estar entre 0 y 100");
        }
        if (pNE2 < 0 || pNE2 > 100){
            throw new IllegalArgumentException("Nota Examen 2 debe estar entre 0 y 100");
        }
        if (pNE3 < 0 || pNE3 > 100){
            throw new IllegalArgumentException("Nota Examen 3 debe estar entre 0 y 100");
        }
        if (pNR < 0 || pNR > 100){
            throw new IllegalArgumentException("Nota Reposicion debe estar entre 0 y 100");
        }
        this.UnidadesValorativas = pUnidadesValorativas;
        this.NA1 = pNA1;
        this.NA2 = pNA2;
        this.NA3 = pNA3;
        this.NE1 = pNE1;
        this.NE2 = pNE2;
        this.NE3 = pNE3;
        this.NR = pNR;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public int getUnidadesValorativas() {
        return UnidadesValorativas;
    }
    public void setUnidadesValorativas(int pUnidadesValorativas) {
        if (pUnidadesValorativas <= 0){
            throw new IllegalArgumentException("Unidades valorativas deben ser mayores a 0");
        }
        this.UnidadesValorativas = pUnidadesValorativas;
    }
    public int getNA1() {
        return NA1;
    }
    public void setNA1(int pNA1) {
        if (pNA1 < 0 || pNA1 > 100){
            throw new IllegalArgumentException("Nota Acumulativa 1 debe estar entre 0 y 100");
        }
        this.NA1 = pNA1;
    }
    public int getNA2() {
        return NA2;
    }
    public void setNA2(int pNA2) {
        if (pNA2 < 0 || pNA2 > 100){
            throw new IllegalArgumentException("Nota Acumulativa 2 debe estar entre 0 y 100");
        }
        this.NA2 = pNA2;
    }
    public int getNA3() {
        return NA3;
    }
    public void setNA3(int pNA3) {
        if (pNA3 < 0 || pNA3 > 100){
            throw new IllegalArgumentException("Nota Acumulativa 3 debe estar entre 0 y 100");
        }
        this.NA3 = pNA3;
    }
    public int getNE1() {
        return NE1;
    }
    public void setNE1(int pNE1) {
        if (pNE1 < 0 || pNE1 > 100){
            throw new IllegalArgumentException("Nota Examen 1 debe estar entre 0 y 100");
        }
        this.NE1 = pNE1;
    }
    public int getNE2() {
        return NE2;
    }
    public void setNE2(int pNE2) {
        if (pNE2 < 0 || pNE2 > 100){
            throw new IllegalArgumentException("Nota Examen 2 debe estar entre 0 y 100");
        }
        this.NE2 = pNE2;
    }
    public int getNE3() {
        return NE3;
    }
    public void setNE3(int pNE3) {
        if (pNE3 < 0 || pNE3 > 100){
            throw new IllegalArgumentException("Nota Examen 3 debe estar entre 0 y 100");
        }
        this.NE3 = pNE3;
    }
    public int getNR() {
        return NR;
    }
    public void setNR(int pNR) {
        if (pNR < 0 || pNR > 100){
            throw new IllegalArgumentException("Nota Reposición debe estar entre 0 y 100");
        }
        this.NR = pNR;
    }
    public String toString(){
        return String.format("Codigo: %s \nClase: %s \nUnidades valorativas: %s \nNota Acumulativa 1: %s " +
                "\nNota Acumulativa 2: %s \nNota Acumulativa 3: %s \nNota Examen 1: %s \nNota Examen 2: %s" +
                "\nNota Examen 3: %s \nNota Reposicion %s \nNota Final: %s",getId(),getNA1(),getUnidadesValorativas(),getNA1(),
                getNA2(),getNA3(),getNE1(),getNE2(),getNE3(),getNE3(),String.valueOf(CalcularNotaFinal()));
    }

    @Override
    public double CalcularNotaFinal() {
        double notaFinal;
        double NA1 = getNA1()*0.15;
        double NA2 = getNA2()*0.15;
        double NA3 = getNA3()*0.20;
        double NE1 = getNE1()*0.15;
        double NE2 = getNE2()*0.15;
        double NE3 = getNE3()*0.20;
        double NR  = getNR()*0.15;

        notaFinal = (NA1+NA2+NA3) + (NE1+NE2+NE3+NR);

        return notaFinal;
    }
}
