package tpIntegradorG2;

public class Pronostico {
    //atributos
    private Partido partido;
    private Equipo equipo;
    private Resultado resultadoFinal;
    public Pronostico (Partido partido,Equipo equipo, Resultado resultadoFinal) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultadoFinal = resultadoFinal;
    }
    //metodos
    public void setpartido(Partido partido){
        this.partido = partido;
    }
    public Partido getpartido(){
        return this.partido;
    }
    public void setequipo(Equipo equipo){
        this.equipo = equipo;
    }
    public Equipo getequipo(){
        return this.equipo;
    }
    public void setresultadoFinal(Resultado resultadoFinal) {
        this.resultadoFinal = resultadoFinal;
    }

    public Resultado getresultadoFinal() {
        return resultadoFinal;
    }
}
