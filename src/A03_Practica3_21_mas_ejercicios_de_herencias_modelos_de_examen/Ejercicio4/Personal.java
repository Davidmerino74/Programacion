package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio4;

public abstract class Personal {
    private String nombre;
    private int edad;
    private int id;
    private String turnoTrabajo;
    private int aniosExperiencia;


    public Personal(String nombre,int edad,int id,String turnoTrabajo,int aniosExperiencia){
        this.nombre=nombre;
        this.edad=edad;
        this.id=id;
        this.turnoTrabajo=miTurnoTrabajo(turnoTrabajo);
        this.aniosExperiencia=aniosExperiencia;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTurnoTrabajo() {
        return this.turnoTrabajo;
    }

    public void setTurnoTrabajo(String turnoTrabajo) {
        this.turnoTrabajo = miTurnoTrabajo(turnoTrabajo);
    }

    public int getAniosExperiencia() {
        return this.aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String miTurnoTrabajo(String turnoTrabajo){
        if (turnoTrabajo.equals("mañana")||turnoTrabajo.equals("tarde")||turnoTrabajo.equals("noche")){
            return turnoTrabajo;
        }else{
            return "mañana";
        }
    }

    //no todas las subclases tienen contador de pacientes,el Administrativo no tiene o se lo ponemos al administrativo y resolvemos el metodo aquí o lo dejamos vacio y hacemos que cada uno lo resuelva a su manera
    public abstract void atenderPaciente();

    public void cambiarTurno(String nuevoTurno){
        this.turnoTrabajo=miTurnoTrabajo(nuevoTurno);
    }
    //permite a un empleado ascender dentro del hospital si cumple ciertos requisitos, por ejemplo un enfermero puede ascender a supervisor, no sé como ponerlo
    public String ascenderPuesto(){
        return "no sé que poner";


    }

}
