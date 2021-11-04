package hn.edu.ujcv.objetos;

public class Carrera {
    private int Id;
    private String Nombre;

    public Carrera (){}

    public Carrera (int pId, String pNombre){
        this.Id = pId;
        this.Nombre = pNombre;
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

    @Override
    public String toString() {
        return "ID: ".concat(String.valueOf(Id)).concat("\nNombre: ").concat(Nombre)
                .concat("\n\n");
    }
}
