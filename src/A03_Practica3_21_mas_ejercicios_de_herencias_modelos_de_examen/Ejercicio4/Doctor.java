package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio4;

public class Doctor extends Personal{
    private String especialidadMedica;
    private int numeroPacientesAtendidos;

    public Doctor(String nombre,int edad,int id, String turnotrabajo,int aniosExperiencia,String especialidadMedica,int numeroPacientesAtendidos){
        super(nombre,edad,id,turnotrabajo,aniosExperiencia);
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
        System.out.println("el Doctor "+this.nombre+" ha atendido a un paciente y suma uno al contador");
    }
}
