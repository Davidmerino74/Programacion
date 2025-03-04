package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

public class AtletaNatacion extends Atleta{
    private String estiloPrincipal;

    public AtletaNatacion(String nombre,String nacionalidad,int edad,String disciplina,int medallasGanadas,String estiloPrincipal){
        super(nombre,nacionalidad,edad,disciplina,medallasGanadas);
        this.estiloPrincipal=miEstilo(estiloPrincipal);
    }

    public String getEstiloPrincipal() {
        return this.estiloPrincipal;
    }
    //llama al metodo miEstilo para comprobar el String introducido
    public void setEstiloPrincipal(String estiloPrincipal) {
        this.estiloPrincipal = miEstilo(estiloPrincipal);
    }

    //puesto el estilo libre en el caso de meterlo mal
    public String miEstilo(String miestilo){
        if(miestilo.equals("libre")||miestilo.equals("espalda")||miestilo.equals("mariposa")|miestilo.equals("pecho")){
            return miestilo;
        }else{
            return "libre";
        }
    }


}
