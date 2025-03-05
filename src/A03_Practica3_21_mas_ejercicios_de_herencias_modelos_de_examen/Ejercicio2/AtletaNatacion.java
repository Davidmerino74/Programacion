package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

public class AtletaNatacion extends Atleta{
    private String estiloPrincipal;

    public AtletaNatacion(String nombre,String nacionalidad,int edad,String disciplina,int medallasGanadas,String estiloPrincipal){
        super(nombre,nacionalidad,edad,disciplina,medallasGanadas);
        if(estiloPrincipal.equals("libre")||estiloPrincipal.equals("espalda")||estiloPrincipal.equals("mariposa")|estiloPrincipal.equals("pecho")){
            this.estiloPrincipal=estiloPrincipal;
        }else{
            this.estiloPrincipal= "libre";
        }
    }

    public String getEstiloPrincipal() {
        return this.estiloPrincipal;
    }
    
    public void setEstiloPrincipal(String estiloPrincipal) {
        if(estiloPrincipal.equals("libre")||estiloPrincipal.equals("espalda")||estiloPrincipal.equals("mariposa")|estiloPrincipal.equals("pecho")){
            this.estiloPrincipal=estiloPrincipal;
        }else{
            this.estiloPrincipal= "libre";
        }
    }

   


}
