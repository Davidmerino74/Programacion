package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

public class AtletaGimnasia extends Atleta{
    private String aparatoUsado;


    public AtletaGimnasia(String nombre,String nacionalidad,int edad,String disciplina,int medallasGanadas,double mejormarca,String aparatoUsado){
        super(nombre,nacionalidad,edad,disciplina,medallasGanadas,mejormarca);
        this.aparatoUsado=miAparatoUsado(aparatoUsado);
    }

    public String getAparatoUsado() {
        return aparatoUsado;
    }
    
    public void setAparatoUsado (String aparatoUsado) {
        this.aparatoUsado=miAparatoUsado(aparatoUsado);
    }   
    public void mejorarMarca(double marca){// ojo con las marcas tienen que ser distintos para un corredor la mejor marca en menor pero en la de gimnasia la mejor marca es superior por lo que no 
        if ((marca>mejormarca) && (marca>0)){
            this.mejormarca=marca;
        }
    }
    public String miAparatoUsado (String aparatoUsado) {
        if(aparatoUsado.equals("barra")||aparatoUsado.equals("suelo")||aparatoUsado.equals("anillas")){
            return aparatoUsado;
        }else{
            return "barra";
        }
    } 
    public void cambiarDisciplina(String disciplinanueva){
        super.cambiarDisciplina(disciplinanueva);
    }
    
}
