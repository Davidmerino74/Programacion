package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio1;

public class JugadorCSGO extends Jugador{
    private double precisionPorcentaje;

    public JugadorCSGO(String nombre,String nacionalidad,String nombreDelEquipo,int torneosGanados,int puntosRanking,int categoria,double precisionPorcentaje){
        super(nombre,nacionalidad,nombreDelEquipo,torneosGanados,puntosRanking,categoria);
        this.precisionPorcentaje=precisionPorcentaje;
    }
    public double getPrecicionPorcentaje(){
        return this.precisionPorcentaje;
    }
    public void setPrecicionPorcentaje(double precisionPorcentaje){
        this.precisionPorcentaje=precisionPorcentaje;
    }
}
