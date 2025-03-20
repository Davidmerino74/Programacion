package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

public class AtletaAtletismo extends Atleta{
    private String distanciaPreferida;


    public AtletaAtletismo(String nombre,String nacionalidad,int edad,String disciplina,int medallasGanadas,double mejormarca,String distanciaPreferida){
        super(nombre,nacionalidad,edad,disciplina,medallasGanadas,mejormarca);
        this.distanciaPreferida=validarDistanciaPreferida(distanciaPreferida);
        
        
    }

    public String getDistanciaPreferida() {
        return distanciaPreferida;
    }
    
    public void setDistanciaPreferida (String pmiDistanciaPreferida) {
        this.distanciaPreferida=validarDistanciaPreferida(pmiDistanciaPreferida);
    }
    public String validarDistanciaPreferida (String miDistanciaPreferida) {
        if (miDistanciaPreferida.equals("100m")||miDistanciaPreferida.equals("200m")||miDistanciaPreferida.equals("maratón")){
            return miDistanciaPreferida;
        }else{
            return "100m";
        }
    }
    public void mejorarMarca(double marca){// ojo con las marcas tienen que ser distintos para un corredor la mejor marca en menor pero en la de gimnasia la mejor marca es superior por lo que no 
        if ((marca<mejormarca) && (marca>0)){
            this.mejormarca=marca;
        }
    }
    public void cambiarDisciplina(String disciplinanueva){
        super.cambiarDisciplina(disciplinanueva);
    }

    


}
