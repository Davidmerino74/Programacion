package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio1;

public class JugadorValorant extends Jugador {
    private String agenteFavorito;

    public JugadorValorant(String nombre,String nacionalidad,String nombreDelEquipo,int torneosGanados,int puntosRanking,int categoria,String agenteFavorito){
        super(nombre,nacionalidad,nombreDelEquipo,torneosGanados,puntosRanking,categoria);
        this.agenteFavorito=agenteFavorito;
    }

    public String getAgenteFavorito(){
        return this.agenteFavorito;
    }
    public void setAgenteFavorito (String agenteFavorito){
        this.agenteFavorito=agenteFavorito;        
    } 
}
