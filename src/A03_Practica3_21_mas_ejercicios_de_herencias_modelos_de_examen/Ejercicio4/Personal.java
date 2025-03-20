package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio4;

public abstract class Personal {
    protected String nombre;
    protected int edad;
    protected int id;
    protected String turnoTrabajo;
    protected int aniosExperiencia;
    protected String puesto;//va con la actualizacion de los puestos

    public Personal(String nombre,int edad,int id,String turnoTrabajo,int aniosExperiencia,String puesto){
        this.nombre=nombre;
        this.edad=edad;
        this.id=id;
        this.turnoTrabajo=miTurnoTrabajo(turnoTrabajo);        
        this.aniosExperiencia=aniosExperiencia;
        this.puesto=puesto;
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
        this.turnoTrabajo=miTurnoTrabajo(turnoTrabajo);
    }

    public int getAniosExperiencia() {
        return this.aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getPuesto() {
        return puesto;
    }

  

    //no todas las subclases tienen contador de pacientes,el Administrativo no tiene o se lo ponemos al administrativo y resolvemos el metodo aquí o lo dejamos vacio y hacemos que cada uno lo resuelva a su manera
    public abstract void atenderPaciente();
    public abstract void ascenderPuesto();//nos inventamos el puesto al que asciende en los hijos    
    
        
    
    public void cambiarTurno(String nuevo_turno){
        if (nuevo_turno.equals("mañana")||nuevo_turno.equals("tarde")||nuevo_turno.equals("noche")){
            this.turnoTrabajo=nuevo_turno;
        }else{
            this.turnoTrabajo="mañana";
        }
    }
    
   
    public String miTurnoTrabajo(String turnoTrabajo){
        if (turnoTrabajo.equals("mañana")||turnoTrabajo.equals("tarde")||turnoTrabajo.equals("noche")){
            return turnoTrabajo;
        }else{
            return "mañana";
        }
    }
}
