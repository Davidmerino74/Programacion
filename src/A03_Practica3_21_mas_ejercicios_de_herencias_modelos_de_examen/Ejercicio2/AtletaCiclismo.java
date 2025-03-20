package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

public class AtletaCiclismo extends Atleta{
    private String tipoBicicleta;

    public AtletaCiclismo(String nombre,String nacionalidad,int edad,String disciplina,int medallasGanadas,double mejormarca,String tipoBicicleta){
        super(nombre,nacionalidad,edad,disciplina,medallasGanadas,mejormarca);
        this.tipoBicicleta=miTipoBicicleta(tipoBicicleta);
        

    }
    public String getTipoBicicleta() {
        return tipoBicicleta;
    }
    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta=miTipoBicicleta(tipoBicicleta);
    }
    @Override
    public String  toString(){
        return this.nombre +" es ciclista "+this.nacionalidad+ "años"+ this.edad+" años" ;
    }
    public void mejorarMarca(double marca){// ojo con las marcas tienen que ser distintos para un corredor la mejor marca en menor pero en la de gimnasia la mejor marca es superior por lo que no 
        if ((marca<mejormarca) && (marca>0)){
            this.mejormarca=marca;
        }
    }
    public String miTipoBicicleta(String tipoBicicleta){
        if (tipoBicicleta.equals("ruta")||tipoBicicleta.equals("montaña")||tipoBicicleta.equals("pista")){
            return tipoBicicleta;
        }else{
            return "ruta";
        }
    } 
    public void cambiarDisciplina(String disciplinanueva){
        super.cambiarDisciplina(disciplinanueva);
    }  
}
