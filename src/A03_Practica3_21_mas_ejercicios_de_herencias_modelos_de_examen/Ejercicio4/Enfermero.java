package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio4;

public class Enfermero extends Personal{
    private String areaAsignada;
    private int cantPacientesAtendidos;

    public Enfermero(String nombre,int edad,int id, String turnotrabajo,int aniosExperiencia,String areaAsignada,int cantPacientesAtendidos){
        super(nombre,edad,id,turnotrabajo,aniosExperiencia);
        this.areaAsignada=miAreaAsignada(areaAsignada);
        this.cantPacientesAtendidos=cantPacientesAtendidos;

    }



    public String getAreaAsignada() {
        return this.areaAsignada;
    }

    public void setAreaAsignada(String areaAsignada) {
        this.areaAsignada = miAreaAsignada(areaAsignada);
    }

    public int getCantPacientesAtendidos() {
        return this.cantPacientesAtendidos;
    }

    public void setCantPacientesAtendidos(int cantPacientesAtendidos) {
        this.cantPacientesAtendidos = cantPacientesAtendidos;
    }
    
    public void atenderPaciente(){
        this.cantPacientesAtendidos++;
        System.out.println("el Enfermero "+getNombre()+" ha atendido a un paciente y suma uno al contador");
    }

    //por defecto si lo introduce mal el area se le asigna urgencias
    public String miAreaAsignada(String areaAsignada){
        if(areaAsignada.equals("urgencias")||areaAsignada.equals("pediatría")||areaAsignada.equals("quirofano")){
            return areaAsignada;
        }else{
            return "urgencias";
        }
    }


}
