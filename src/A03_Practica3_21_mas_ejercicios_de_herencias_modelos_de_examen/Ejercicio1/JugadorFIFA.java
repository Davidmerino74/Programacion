package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio1;

public class JugadorFIFA extends Jugador{
    private int golesAnotados;

    public JugadorFIFA(String nombre,String nacionalidad,String nombreDelEquipo,int torneosGanados,int puntosRanking,int categoria,int golesAnotados){
        super(nombre,nacionalidad,nombreDelEquipo,torneosGanados,puntosRanking,categoria);
        this.golesAnotados=golesAnotados;
    }
    public double getGolesAnotados(){
        return this.golesAnotados;
    }
    public void setGolesAnotados(int golesAnotados){
        this.golesAnotados=golesAnotados;
    }
}
