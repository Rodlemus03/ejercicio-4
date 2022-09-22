import java.time.chrono.ThaiBuddhistChronology;

public class Jugador {
    protected String nombre;
    protected String pais;
    protected int errores;
    protected int aces;
    protected int totalServicios; 
    public Jugador(String nombre, String pais, int errores, int aces, int total){
        this.nombre=nombre;
        this.pais=pais;
        this.errores=errores;
        this.aces=aces;
        this.totalServicios=total;
    }
    //gets
    public String getNombre(){return this.nombre;}
    public String getPais(){return this.pais;}
    public int getErrores(){return this.errores;}
    public int getAces(){return this.aces;}
    public int getServicios(){return this.totalServicios;}
    //sets
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setPais(String pais){this.pais=pais;}
    public void setErrores(int errores){this.errores=errores;}
    public void setAces(int aces){this.aces=aces;}
    public void setServicios(int servicios){this.totalServicios=servicios;}
    //toString
    public String toString(){
        String cadena="";
        cadena+="Nombre: "+this.nombre+"\n";
        cadena+="Pais: "+this.pais+"\n";
        cadena+="Errores: "+this.errores+"\n";
        cadena+="Aces: "+this.aces+"\n";
        cadena+="Total servicios: "+this.totalServicios+"\n";
        return cadena;
    }
}
