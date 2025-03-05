package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio3;

public class AvionComercial extends Aeronave {
    private int numeroAerolinea;
    private String clase;

    public AvionComercial(String fabricante, String modelo, int capacidadPasajeros, int autonomiaVuelo, int velocidad,int numeroAerolinea, String clase) {
        super(fabricante, modelo, capacidadPasajeros, autonomiaVuelo, velocidad);
        this.numeroAerolinea = numeroAerolinea;
        if (clase.equals("turista") || clase.equals("business") || clase.equals("primera clase")) {
            this.clase=clase;
        } else {
            this.clase= "turista";
        }
    }

    public int getNumeroAerolinea() {
        return this.numeroAerolinea;
    }
    public void setNumeroAerolinea(int numeroAerolinea) {
        this.numeroAerolinea = numeroAerolinea;
    }
    public String getClase(){
        return this.clase;
    }
    public void setClase(String clase){
        this.clase=clase;
    }

   
}
