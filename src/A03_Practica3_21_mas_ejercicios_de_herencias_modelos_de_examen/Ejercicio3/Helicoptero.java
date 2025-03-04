package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio3;

public class Helicoptero extends Aeronave{
    private int numeroRotores;
    private String usoCivil_Militar;

    public Helicoptero(String fabricante,String modelo,int capacidadPasajeros,int autonomiaVuelo,int velocidad,int numeroRotores,String usoCivil_Militar){
        super(fabricante,modelo,capacidadPasajeros,autonomiaVuelo,velocidad);
        this.numeroRotores=numeroRotores;
        this.usoCivil_Militar=usoCivil_Militar;
    }


    public int getNumeroRotores() {
        return this.numeroRotores;
    }

    public void setNumeroRotores(int numeroRotores) {
        this.numeroRotores = numeroRotores;
    }

    public String getUsoCivil_Militar() {
        return this.usoCivil_Militar;
    }

    public void setUsoCivil_Militar(String usoCivil_Militar) {
        this.usoCivil_Militar = usoCivil_Militar;
    }

}
