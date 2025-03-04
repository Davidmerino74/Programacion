package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

public class AtletaAtletismo extends Atleta{
    private String distanciaPreferida;


    public AtletaAtletismo(String nombre,String nacionalidad,int edad,String disciplina,int medallasGanadas,String distanciaPreferida){
        super(nombre,nacionalidad,edad,disciplina,medallasGanadas);
        this.distanciaPreferida=miDistanciaPreferida(distanciaPreferida);
    }

    public String getDistanciaPreferida() {
        return distanciaPreferida;
    }
    //llama al metodo miDistanciaPreferida para comprobar el String introducido
    public void setDistanciaPreferida (String miDistanciaPreferida) {
        this.distanciaPreferida = miDistanciaPreferida(miDistanciaPreferida);
    }   

    //puesto la distancia de  100m en el caso de meterlo mal
    public String miDistanciaPreferida(String miDistanciaPreferida){
        if(miDistanciaPreferida.equals("100m")||miDistanciaPreferida.equals("200m")||miDistanciaPreferida.equals("maratón")){
            return miDistanciaPreferida;
        }else{
            return "100m";
        }
    }
}
