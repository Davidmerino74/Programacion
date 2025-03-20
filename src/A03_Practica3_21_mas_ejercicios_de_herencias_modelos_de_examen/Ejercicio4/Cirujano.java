package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio4;

public class Cirujano extends Personal{
    private int cantCirujiasRealizadas;
    private String tipoCirujia;

    public Cirujano(String nombre,int edad,int id, String turnotrabajo,int aniosExperiencia,String puesto, int cantCirujiasRealizadas,String tipoCirujia){
        super(nombre,edad,id,turnotrabajo,aniosExperiencia,puesto);
        this.cantCirujiasRealizadas=cantCirujiasRealizadas;
        this.tipoCirujia=tipoCirujia;       
    }


    public int getCantCirujiasRealizadas() {
        return this.cantCirujiasRealizadas;
    }

    public void setCantCirujiasRealizadas(int cantCirujiasRealizadas) {
        this.cantCirujiasRealizadas = cantCirujiasRealizadas;
    }

    public String getTipoCirujia() {
        return this.tipoCirujia;
    }

    public void setTipoCirujia(String tipoCirujia) {
        this.tipoCirujia = tipoCirujia;
    }




    public void atenderPaciente(){
        this.cantCirujiasRealizadas++;
        System.out.println("el Cirujano "+this.nombre+" ha atendido a un paciente y suma uno al contador");
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
