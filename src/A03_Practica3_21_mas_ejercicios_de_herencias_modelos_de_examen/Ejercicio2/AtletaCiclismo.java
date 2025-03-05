package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

public class AtletaCiclismo extends Atleta{
    private String tipoBicicleta;

    public AtletaCiclismo(String nombre,String nacionalidad,int edad,String disciplina,int medallasGanadas,String tipoBicicleta){
        super(nombre,nacionalidad,edad,disciplina,medallasGanadas);
        if (tipoBicicleta.equals("ruta")||tipoBicicleta.equals("montaña")||tipoBicicleta.equals("pista")){
            this.tipoBicicleta=tipoBicicleta;
        }else{
            this.tipoBicicleta="ruta";
        }
        

    }
    public String getTipoBicicleta() {
        return tipoBicicleta;
    }
    public void setTipoBicicleta(String tipoBicicleta) {
        if (tipoBicicleta.equals("ruta")||tipoBicicleta.equals("montaña")||tipoBicicleta.equals("pista")){
            this.tipoBicicleta=tipoBicicleta;
        }else{
            this.tipoBicicleta="ruta";
        }
    }

    
        
}
