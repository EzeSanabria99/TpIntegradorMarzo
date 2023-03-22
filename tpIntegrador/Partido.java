package tpIntegradorG2;

import java.util.Objects;

public class Partido {
    //atributos
    private Equipo equipo;
    private Equipo descripcion;
    private int golesEquipo1;
    private int golesEquipo2;

    //metodos
    public void setgolesEquipo1(int golesEquipo1){
    this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo2(int golesEquipo2){
        this.golesEquipo2 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }
    public void setEquipo(Equipo equipo){
        this.equipo = equipo;
    }

    public Equipo getEquipo() {
        return equipo;
    }
    public void setDescripcion(Equipo descripcion){
        this.descripcion = descripcion;
    }

    public Equipo getDescripcion() {
        return descripcion;
    }
}
