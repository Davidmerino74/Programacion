package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

public class AtletaGimnasia extends Atleta{
    private String aparatoUsado;


    public AtletaGimnasia(String nombre,String nacionalidad,int edad,String disciplina,int medallasGanadas,String aparatoUsado){
        super(nombre,nacionalidad,edad,disciplina,medallasGanadas);
        this.aparatoUsado=miDistanciaPreferida(aparatoUsado);
    }

    public String getAparatoUsado() {
        return aparatoUsado;
    }
    //llama al metodo miEstilo para comprobar el String introducido
    public void setAparatoUsado (String aparatoUsado) {
        this.aparatoUsado = miDistanciaPreferida(aparatoUsado);
    }   

    //puesto el aparato barra en el caso de meterlo mal
    public String miDistanciaPreferida(String aparatoUsado){
        if(aparatoUsado.equals("barra")||aparatoUsado.equals("suelo")||aparatoUsado.equals("anillas")){
            return aparatoUsado;
        }else{
            return "barra";
        }
    }
}
