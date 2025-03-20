package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio4;

public class Administrativo extends Personal{
    private String departamento;
    private boolean accesoDatosConfidenciales;

    public Administrativo(String nombre,int edad,int id, String turnotrabajo,int aniosExperiencia,String puesto, String departamento,boolean accesoDatosConfidenciales){
        super(nombre,edad,id,turnotrabajo,aniosExperiencia,puesto);
        this.departamento=departamento;
        this.accesoDatosConfidenciales=accesoDatosConfidenciales;

    }


    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isAccesoDatosConfidenciales() {
        return this.accesoDatosConfidenciales;
    }

    public boolean getAccesoDatosConfidenciales() {
        return this.accesoDatosConfidenciales;
    }

    public void setAccesoDatosConfidenciales(boolean accesoDatosConfidenciales) {
        this.accesoDatosConfidenciales = accesoDatosConfidenciales;
    }


    public void atenderPaciente(){
        
        System.out.println("el Administrativo "+this.nombre+" ha atendido a un paciente ");
    }
    public void ascenderPuesto(){
        switch (this.puesto) {
            case ("nivel1"):
            this.puesto="nivel2";                
                break;
            case ("nivel2"):                
            this.puesto="nivel3";
                break;
            default:
            System.out.println("Error");
                break;
        }

    }
}
