package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio4;

public class Enfermero extends Personal{
    private String areaAsignada;
    private int cantPacientesAtendidos;

    public Enfermero(String nombre,int edad,int id, String turnotrabajo,int aniosExperiencia,String areaAsignada,int cantPacientesAtendidos){
        super(nombre,edad,id,turnotrabajo,aniosExperiencia);
        if(areaAsignada.equals("urgencias")||areaAsignada.equals("pediatría")||areaAsignada.equals("quirofano")){
            this.areaAsignada= areaAsignada;
        }else{
            this.areaAsignada= "urgencias";
        }
        this.cantPacientesAtendidos=cantPacientesAtendidos;

    }



    public String getAreaAsignada() {
        return this.areaAsignada;
    }

    public void setAreaAsignada(String areaAsignada) {
        if(areaAsignada.equals("urgencias")||areaAsignada.equals("pediatría")||areaAsignada.equals("quirofano")){
            this.areaAsignada= areaAsignada;
        }else{
            this.areaAsignada= "urgencias";
        }
    }

    public int getCantPacientesAtendidos() {
        return this.cantPacientesAtendidos;
    }

    public void setCantPacientesAtendidos(int cantPacientesAtendidos) {
        this.cantPacientesAtendidos = cantPacientesAtendidos;
    }
    
    public void atenderPaciente(){
        this.cantPacientesAtendidos++;
        System.out.println("el Enfermero "+this.nombre+" ha atendido a un paciente y suma uno al contador");
    }

   


}
