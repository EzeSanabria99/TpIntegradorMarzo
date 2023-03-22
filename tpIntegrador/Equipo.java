package tpIntegradorG2;
import java.time.LocalDate;
public class Equipo {
    //Atributos
    private String nombre;
    private String descripcion;

    public Equipo (String nombre,String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    //metodos
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }

    public String toString(){
        return "Equipo [nombre= "+ nombre + "Descripcion =" + descripcion + "]";
    }
}
