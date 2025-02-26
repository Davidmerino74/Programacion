package Practica2;

public class Genero {
    /*
    Aquí tenéis que poner los siguientes atributos
     * nombre: El nombre del género.
     * edad_recomendada: La edad mínima recomendada.
     */
    private String nombre;
    private int edad_recomendada;

    
    
    //Método constructor
    public Genero(String pNombre,int pEdad_recomendada){
        this.nombre=pNombre;
        this.edad_recomendada=pEdad_recomendada;
    }

    // Getters y setters
    public String getNombre(){
        return this.nombre;/*se puede poner return nombre; */
    }
    public void setNombre(String pNombre){
        this.nombre=pNombre;
    }
    public int getedad_recomendada(){
        return this.edad_recomendada;
    }
    public void setedad_recomendada(int pedad_recomendada){
        this.edad_recomendada=pedad_recomendada;
    }

        

}
