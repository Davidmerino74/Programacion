package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio4;

public abstract class Personal {
    protected String nombre;
    protected int edad;
    protected int id;
    protected String turnoTrabajo;
    protected int aniosExperiencia;


    public Personal(String nombre,int edad,int id,String turnoTrabajo,int aniosExperiencia){
        this.nombre=nombre;
        this.edad=edad;
        this.id=id;
        if (turnoTrabajo.equals("mañana")||turnoTrabajo.equals("tarde")||turnoTrabajo.equals("noche")){
            this.turnoTrabajo=turnoTrabajo;
        }else{
            this.turnoTrabajo="mañana";
        }
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
        if (turnoTrabajo.equals("mañana")||turnoTrabajo.equals("tarde")||turnoTrabajo.equals("noche")){
            this.turnoTrabajo=turnoTrabajo;
        }else{
            this.turnoTrabajo="mañana";
        }
    }

    public int getAniosExperiencia() {
        return this.aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

  

    //no todas las subclases tienen contador de pacientes,el Administrativo no tiene o se lo ponemos al administrativo y resolvemos el metodo aquí o lo dejamos vacio y hacemos que cada uno lo resuelva a su manera
    public abstract void atenderPaciente();

    public void cambiarTurno(String nuevo_turno){
        if (nuevo_turno.equals("mañana")||nuevo_turno.equals("tarde")||nuevo_turno.equals("noche")){
            this.turnoTrabajo=nuevo_turno;
        }
    }
    //permite a un empleado ascender dentro del hospital si cumple ciertos requisitos, por ejemplo un enfermero puede ascender a supervisor, no sé como ponerlo
    public String ascenderPuesto(){
        return "no sé que poner";


    }

}
