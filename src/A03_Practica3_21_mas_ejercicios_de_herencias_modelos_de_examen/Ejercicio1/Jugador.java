package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio1;

public class Jugador {
    protected String nacionalidad;
    protected String nombreDelEquipo;
    protected int torneosGanados;
    protected int puntosRanking;
    protected String nombre;
    protected int categoria;


    public Jugador(String nombre,String nacionalidad,String nombreDelEquipo,int torneosGanados,int puntosRanking,int categoria){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
        this.nombreDelEquipo=nombreDelEquipo;
        this.torneosGanados=torneosGanados;
        this.puntosRanking=puntosRanking;
        this.categoria=categoria;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombreDelEquipo() {
        return this.nombreDelEquipo;
    }

    public void setNombreDelEquipo(String nombreDelEquipo) {
        this.nombreDelEquipo = nombreDelEquipo;
    }

    public int getTorneosGanados() {
        return this.torneosGanados;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    public int getPuntosRanking() {
        return this.puntosRanking;
    }

    public void setPuntosRanking(int puntosRanking) {
        this.puntosRanking = puntosRanking;
    }

    public int getCategoria() {
        return this.categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    public void ganarTorneo(int puntos){
        this.torneosGanados=this.torneosGanados+1;
        this.puntosRanking=this.puntosRanking+puntos;
        System.out.println(this.nombre + " tiene "+this.torneosGanados+" torneos ganados y sus puntos en el Rankig son "+this.puntosRanking);
    }
    public void subirNivel(){
        this.categoria=this.categoria+1;
        System.out.println(this.nombre+ " ha subido a la categoria "+ this.categoria);
    }
}
