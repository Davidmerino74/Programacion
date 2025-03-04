package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio1;

public class JugadorLol extends Jugador{
    private String rolPrincipal;


    public JugadorLol(String nombre,String nacionalidad,String nombreDelEquipo,int torneosGanados,int puntosRanking,int categoria,String rolPrincipal){
        super(nombre,nacionalidad,nombreDelEquipo,torneosGanados,puntosRanking,categoria);
        this.rolPrincipal=rolPrincipal;
    }

    public String getRolPrincipal(){
        return this.rolPrincipal;
    }
    public void setRolPrincipal(String rolPrincipal){
        if (rolPrincipal.equals("Top")||rolPrincipal.equals("Mid")||rolPrincipal.equals("Jungla")||rolPrincipal.equals("ADC")||rolPrincipal.equals("Support")){
            this.rolPrincipal=rolPrincipal;
        }else{
            this.rolPrincipal="Top";
        }
        
    }   
}
