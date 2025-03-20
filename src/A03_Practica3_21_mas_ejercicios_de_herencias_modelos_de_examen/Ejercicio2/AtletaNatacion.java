package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

public class AtletaNatacion extends Atleta{
    private String estiloPrincipal;

    public AtletaNatacion(String nombre,String nacionalidad,int edad,String disciplina,int medallasGanadas,double mejormarca,String estiloPrincipal){
        super(nombre,nacionalidad,edad,disciplina,medallasGanadas,mejormarca);
        this.estiloPrincipal=miEstiloPrincipal(estiloPrincipal);
        
    }

    public String getEstiloPrincipal() {
        return this.estiloPrincipal;
    }
    
    public void setEstiloPrincipal(String estiloPrincipal) {
        this.estiloPrincipal=miEstiloPrincipal(estiloPrincipal);    
    }
    @Override
    public String  toString(){
        return this.nombre +" es nadador  "+this.nacionalidad+ "años"+ this.edad+" años" ;
    }
    public void mejorarMarca(double marca){// ojo con las marcas tienen que ser distintos para un corredor la mejor marca en menor pero en la de gimnasia la mejor marca es superior por lo que no 
        if ((marca<mejormarca) && (marca>0)){
            this.mejormarca=marca;
        }
    }
    public String miEstiloPrincipal(String estiloPrincipal){
        if(estiloPrincipal.equals("libre")||estiloPrincipal.equals("espalda")||estiloPrincipal.equals("mariposa")|estiloPrincipal.equals("pecho")){
            return estiloPrincipal;
        }else{
            return "libre";
        }
    }
    public void cambiarDisciplina(String disciplinanueva){
        super.cambiarDisciplina(disciplinanueva);
    }

}
