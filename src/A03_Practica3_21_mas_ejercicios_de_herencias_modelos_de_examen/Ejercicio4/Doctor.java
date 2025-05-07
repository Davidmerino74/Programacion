package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio4;

public class Doctor extends Personal{
    private String especialidadMedica;
    private int numeroPacientesAtendidos;//este es el contador que pide en el metodo atender paciente

    public Doctor(String nombre,int edad,int id, String turnotrabajo,int aniosExperiencia,String especialidadMedica,String puesto,int numeroPacientesAtendidos){
        super(nombre,edad,id,turnotrabajo,aniosExperiencia,puesto);
        this.especialidadMedica=especialidadMedica;
        this.numeroPacientesAtendidos=numeroPacientesAtendidos;

    }


    public String getEspecialidadMedica() {
        return this.especialidadMedica;
    }

    public void setEspecialidadMedica(String especialidadMedica) {
        this.especialidadMedica = especialidadMedica;
    }

    public int getNumeroPacientesAtendidos() {
        return this.numeroPacientesAtendidos;
    }

    public void setNumeroPacientesAtendidos(int numeroPacientesAtendidos) {
        this.numeroPacientesAtendidos = numeroPacientesAtendidos;
    }


    public void atenderPaciente(){
        this.numeroPacientesAtendidos++;
        System.out.println(this.nombre+"ha atendido a un paciente");
    }
    public void ascenderPuesto(){
        switch (this.puesto) {
            case ("doctor1"):
                this.puesto="doctor2";
                break;
            case ("doctor2"):
                this.puesto="doctor3";
                break;
            default:
            System.out.println("Error");
                break;
        }

    }

    
}
