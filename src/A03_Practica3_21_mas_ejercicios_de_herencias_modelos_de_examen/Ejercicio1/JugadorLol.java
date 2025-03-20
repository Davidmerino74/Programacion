package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio1;

public class JugadorLol extends Jugador{
    private String rolPrincipal;


    public JugadorLol(String nombre,String nacionalidad,String nombreDelEquipo,int torneosGanados,int puntosRanking,int categoria,String rolPrincipal){
        super(nombre,nacionalidad,nombreDelEquipo,torneosGanados,puntosRanking,categoria);
        if (rolPrincipal.equals("Top")||rolPrincipal.equals("Mid")||rolPrincipal.equals("Jungla")||rolPrincipal.equals("ADC")||rolPrincipal.equals("Support")){
            this.rolPrincipal=rolPrincipal;
        }else{
            this.rolPrincipal="Top";
        }
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
    //en lugar de duplicar el codigo se puede crear un metodo comprobarRol() y ponerlo en el constructor y en el set this.rolPrincipal=comprobarRol(rolPrincipal)
    public String comprobarRol(String pRoll){
        if (rolPrincipal.equals("Top")||rolPrincipal.equals("Mid")||rolPrincipal.equals("Jungla")||rolPrincipal.equals("ADC")||rolPrincipal.equals("Support")){
            return pRoll;
        }else{
            return "Top";
        }
        
    } 
    public void ganarTorneo(int puntos){
        super.ganarTorneo(puntos);
    }
    public void subirNivel(){
        super.subirNivel();
    }
}
