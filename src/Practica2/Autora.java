package Practica2;

public class Autora {
    /*
    Cread los siguientes atributos
     * nombre: Nombre de la autora.
     * apellidos: Apellidos de la autora
     */
    
    private String nombre;
    private String apellidos;
    //Método constructor
    public Autora(String pNombre,String pApellidos){
        this.nombre=pNombre;
        this.apellidos=pApellidos;
    }
    // Getters y setters
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String pNombre){
        this.nombre=pNombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public void setApellidos(String pApellidos){
        this.apellidos=pApellidos;
    }
    
}
