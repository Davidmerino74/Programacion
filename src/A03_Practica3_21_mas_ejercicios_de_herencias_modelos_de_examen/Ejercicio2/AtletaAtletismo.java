package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

public class AtletaAtletismo extends Atleta{
    private String distanciaPreferida;


    public AtletaAtletismo(String nombre,String nacionalidad,int edad,String disciplina,int medallasGanadas,String distanciaPreferida){
        super(nombre,nacionalidad,edad,disciplina,medallasGanadas);
        if (distanciaPreferida.equals("100m")||distanciaPreferida.equals("200m")||distanciaPreferida.equals("maratón")){
            this.distanciaPreferida=distanciaPreferida;
        }else{
            this.distanciaPreferida="100m";
        }
        
    }

    public String getDistanciaPreferida() {
        return distanciaPreferida;
    }
    
    public void setDistanciaPreferida (String miDistanciaPreferida) {
        if (distanciaPreferida.equals("100m")||distanciaPreferida.equals("200m")||distanciaPreferida.equals("maratón")){
            this.distanciaPreferida=miDistanciaPreferida;
        }else{
            this.distanciaPreferida="100m";
        }
    }


}
