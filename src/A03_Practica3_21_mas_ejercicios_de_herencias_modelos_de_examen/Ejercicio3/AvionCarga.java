package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio3;

public class AvionCarga extends Aeronave{
    private int capacidadCargaToneladas;
    private String tipoMercancia;

    public AvionCarga(String fabricante,String modelo,int capacidadPasajeros,int autonomiaVuelo,int velocidad,int capacidadCargaToneladas,String tipoMercancia){
        super(fabricante,modelo,capacidadPasajeros,autonomiaVuelo,velocidad);
        this.capacidadCargaToneladas=capacidadCargaToneladas;
        this.tipoMercancia=tipoMercancia;
    }

    public int getCapacidadCargaToneladas() {
        return capacidadCargaToneladas;
    }
    public void setCapacidadCargaToneladas(int capacidadCargaToneladas) {
        this.capacidadCargaToneladas = capacidadCargaToneladas;
    }
    public String getTipoMercancia() {
        return tipoMercancia;
    }
    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }
    
}
