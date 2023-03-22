package tpIntegradorG2;

public class Ronda {
    //atributos
    private String nro;
    private Partido partido;

    //metodos
    public void setNro(String nro){
        this.nro = nro;
    }

    public String getNro() {
        return nro;
    }

    public void setPartido (Partido partido){
        this.partido = partido;
    }

    public Partido getPartido() {
        return partido;
    }

    
}
